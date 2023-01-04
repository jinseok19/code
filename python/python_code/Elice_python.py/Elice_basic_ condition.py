# Q1. == 혹은 != 연산자을 이용해서 True인 명제를 ans1에 넣어봅시다.
ans1 = 3!=4

# Q2. > 혹은 < 연산자를 이용해서 False인 명제를 ans2에 넣어봅시다.
ans2 = 3>4

# Q3. >= 혹은 <= 연산자를 이용해서 True인 명제를 ans3에 넣어봅시다.
ans3 = 3<=6

# 위의 세 변수를 출력해서 True, False 여부를 확인해봅시다.
print(ans1, ans2, ans3)

# 괄호 안에 적절한 명제를 채워 stat1이 True가 되게 해봅시다.
stat1 = 3==3 and 2<4 and (3<6)

# 괄호 안에 적절한 명제를 채워 stat2이 False가 되게 해봅시다.
stat2 = 4>=6 or "apple"=="Apple" or ('kkk'!='kkk') 

# 괄호 안에 적절한 명제를 채워 stat3이 True가 되게 해봅시다.
stat3 = not not(True)

# 위의 세 변수를 한 문장으로 출력해서 True, False 여부를 확인해봅시다.
print(stat1,stat2,stat3)

# input()을 이용해서 숫자(정수) 입력을 받고, 변수 num에 이를 넣어봅시다.
num = int(input())

# if-else문을 이용해서 만약 입력받은 수가 홀수면 "(입력받은 수) 홀수입니다."
# 짝수면 "(입력받은 수) 짝수입니다."를 출력해봅시다.
# 괄호는 출력하지 않습니다.
if num%2 !=0:
        print(num,'홀수입니다.')
else:
        print(num,'짝수입니다.')



# 변수 answer에 수 1~50 중 하나를 넣어봅시다.
answer = 7

# input을 통해 숫자형으로 입력을 받아서 변수 submit에 저장해봅시다.
submit = int(input())

# if-elif-else문으로 Up-Down Game을 구현해봅시다.
# 만약 answer보다 submit이 더 크면 "정답보다 더 큰 수를 입력했습니다."
# 만약 answer보다 submit이 더 작으면 "정답보다 더 작은 수를 입력했습니다."
# 만약 answer와 submit이 같으면 "정답!" 를 출력합니다.
if  answer<submit:
        print('정답보다 더 큰 수를 입력했습니다.')
elif answer>submit:
        print('정답보다 더 작은 수를 입력했습니다.')
elif answer==submit:
        print('정답!')


