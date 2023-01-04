# 사분면
# 2차원 좌표 상의 여러 점의 좌표(x, y)가 주어졌을 때,
# 각 사분면과 축에 점이 몇 개 있는지 구하는 프로그램

T = int(input())
Q1 = Q2 = Q3 = Q4 = Axis = 0 #점의 갯수를 저장 변수 초기화


for _ in range(T):
    x, y = map(int, input().split()) #두 수 공백 구분으로 입력 받는다.
    # 사분면 좌표
    if x > 0 and y > 0:
        Q1 += 1
    elif x > 0 and y < 0:
        Q4 += 1
    elif x < 0 and y > 0:
        Q2 += 1
    elif x < 0 and y < 0:
        Q3 += 1
    else:
        Axis += 1

print('Q1:', Q1)
print('Q2:', Q2)
print('Q3:', Q3)
print('Q4:', Q4)
print('AXIS:', Axis)
