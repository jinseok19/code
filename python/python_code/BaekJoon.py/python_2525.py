#오븐 시계

start_hour, start_minute = map(int,input().split())
cook_time = int(input())

start_hour += cook_time//60 # 요리 시간을 시와 분으로 나누어
start_minute += cook_time % 60 # 시작시간에 더한다.



if start_minute>= 60: # 분이 60이 넘으면 
    start_hour +=1 # 시에 1을 더하고
    start_minute -= 60 # 분에서 60을 빼준다

if start_hour>= 24: # 시가 24가 넘으면
    start_hour -=24 # 시작 시간에서 24를 빼준다

    
print("{0} {1}".format(start_hour,start_minute))