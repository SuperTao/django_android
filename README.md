# django_android

android与django服务器通信的简单例程。

android使用xUtils框架，发送GET或POST数据给django。django数据库使用mysql。

xUtils使用方法：

　　https://github.com/wyouflf/xUtils3

#### django运行
--

python manage.py runserver 0.0.0.0:8000

#### 测试运行效果
--

浏览器输入： 192.168.1.249:8000

显示结果：  onoff 0

浏览器输入： 192.168.1.249:8000/?onoff=100

显示结果：  onoff 100

### Android连接
--

程序中使用get或者post方法上传数据。django接受到数据返回给app。并用toast显示出来。

### mysql测试
--

如果要测试mysql,用info/view.py.mysql覆盖info/view.py

```
　　cp info/view.py.mysql info/view.py
```

将aplex/onoff.mysql导入到自己电脑安装的mysql数据库。数据库名称是onoff,只添加了一张表time,如下所示：

导入方法：

```
　　mysql -u root -p school < onoff.sql
```

查看方法：

```
mysql> use onoff;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+----------------------------+
| Tables_in_onoff            |
+----------------------------+
| auth_group                 |
| auth_group_permissions     |
| auth_permission            |
| auth_user                  |
| auth_user_groups           |
| auth_user_user_permissions |
| django_admin_log           |
| django_content_type        |
| django_migrations          |
| django_session             |
| info_time                  |
+----------------------------+
11 rows in set (0.00 sec)

mysql> select * from info_time
    -> ;
+----+-------+
| id | count |
+----+-------+
|  1 |   100 |
|  2 |     1 |
+----+-------+
2 rows in set (0.00 sec)
```

### 问题记录
--

android使用post方法时，连接错误。

http://www.cnblogs.com/helloworldtoyou/p/6033006.html

xUtils使用get和post上传数据方法.

http://www.cnblogs.com/helloworldtoyou/p/6033067.html

