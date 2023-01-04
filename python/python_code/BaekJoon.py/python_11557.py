#Yangjojang of the year
#학교별로 한 해동안 술 소비량이 주어질 떄,
# 가장 술 소비가 많은 학교 이름을 출력하여라.

T = int(input()) #반복할 횟수 입력
for _ in range(T):
    schoolN = int(input()) #입력할 학교 수
    alcohol = [] #학교 이름과 알콜 L를 담을 리스트
    for _ in range(schoolN): 
        S, L = map(str,input().split()) # 공백을 기준으로 학교이름과 알콜 리터를 변수에 담음                                        # 
        alcohol.append([S,int(L)]) # 두 변수를 리스트에 담음
    alcohol = sorted(alcohol, key=lambda x: x[1]) # alcohol 리스트를 sorted함수와 lambda를 활용하여 오름 차순으로 정렬
    
    print(alcohol[-1][0])# 오롬 차순으로 정렬 되었으므로 맨 뒤의 값이 가장 크므로 -1로 값을 지정
                        #대학 이름이 있는 0번째를 출력



