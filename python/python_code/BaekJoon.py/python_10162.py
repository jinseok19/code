#전자레인지
#5분 1분 10초 단위로 최소 횟수 구하기


T = int(input())
if T % 10 != 0:
    print(-1)# 일의 자리가 0이 아님면 오류 메시지 출력
else:
    five_result = one_result = ten_result = 0 # 결과 저장 변수 초기화
    # 최솟값을 구해야 하므로 5분으로 먼저 몫을 구하고 차례대로 구함.
    five_result = T // 300 
    one_result = (T % 300)//60
    ten_result = (T % 300) % 60 // 10

    print(five_result, one_result, ten_result)