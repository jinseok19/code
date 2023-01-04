#인공지능 시계

start_hour, start_minute, start_second = map(int,input().split())

cook_time = int(input())

start_second_result = (start_second + cook_time) % 60 # 최종 초값
minnute_over = (start_second + cook_time) // 60 # 시작 초와 요리 초를 더해 60이 넘는 값은 분으로 저장

start_minute_result = (start_minute + minnute_over) % 60 # 최종 분값
hour_over = (start_minute + minnute_over) // 60 # 시작 분과 넘치는 분을 시로 계산

start_hour_result = (start_hour + hour_over) % 24 # 24가 넘을떄를 대비




print("{0} {1} {2}".format(start_hour_result,start_minute_result,start_second_result))