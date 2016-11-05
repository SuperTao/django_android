from django.shortcuts import render

from django.http import HttpResponse

def index(request):
    count = 0
    if request.method == 'GET':
        try:
            count = request.GET['onoff']
        except KeyError: 
            count = 0
        return HttpResponse('onoff '  + str(count))
    elif request.method == 'POST':
        try:
            count = request.POST['onoff']
        except KeyError: 
            count = 0
        return HttpResponse('onoff '  + str(count))
    
    return render(request, 'index.html')
