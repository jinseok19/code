#Baseball
#승패 기록

T = int(input())
for _ in range(T):
    K_win = Y_win = 0 # 승리 수를 기록하는 변수 초기화 
    for _ in range(9):
       
        Y, K = map(int, input().split())  # 승리 수를 공백으로 입력받음
        K_win +=K # k_win에 승리 수를 더함
        Y_win +=Y # y_win에 승리 수를 더함
    if Y_win > K_win: # 어떤 값이 더 큰지 판단
        print("Yonsei")
    elif K_win > Y_win:
        print("Korea")
    else:
        print("Draw")
