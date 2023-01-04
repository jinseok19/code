#약수들의 합

while True:
    N = int(input())
    if N==-1: #-1을 입력하면 
        break # 종류함
    sum = 0   # 약수들의 합을 저장 
    N_num = [] # 약수들을 저장
    for i in range(1,N+1): #자기 자신으로 나누어봄
        if N%i==0: #나누어 떨어지면 약수
            N_num.append(i) # 리스트에 입력
    total_sum = N_num[len(N_num)-1] # 약수들의 합은 자기자신

    for i in N_num[:-1]: # 약수들의 합을 구함
        sum += i
    if sum== total_sum: # 자기자신과 sum이 같으면
        result = str(total_sum) + " = " + str(N_num[0])
        for i in range(1, len(N_num)-1):#1부터 자기자신의 전까지
            result +=" + "+ str(N_num[i]) # result에 넣음 "+"와 같이 넣음
        print(result)
    else:
        print(str(N_num[-1])+" is NOT perfect.")

        