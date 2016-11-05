package com.example.tony.httptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;

import org.xutils.x;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestParams params = new RequestParams("http://192.168.1.249:8000/");
                //get 请求参数
                /*
                params.addQueryStringParameter("onoff", "100");
                x.http().get(params, new Callback.CommonCallback<String>(){
                */
                // post请求参数
                params.addBodyParameter("onoff", "103");
                x.http().post(params, new Callback.CommonCallback<String>(){
                @Override
                public void onSuccess(String result) {
                    Toast.makeText(x.app(), result, Toast.LENGTH_LONG).show();
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {
                    Toast.makeText(x.app(), ex.getMessage(), Toast.LENGTH_LONG).show();
                }

                @Override
                public void onCancelled(CancelledException cex) {
                    Toast.makeText(x.app(), "cancelled", Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFinished() {
                    Toast.makeText(x.app(), "Finish", Toast.LENGTH_LONG).show();
                }
                });
            }
        });
    }
}
