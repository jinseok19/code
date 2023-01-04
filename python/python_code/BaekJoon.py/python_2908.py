a,b = list(map(int,input().split()))

a_list = []
while (a !=0):
    a_list.append(a%10)
    a = a//10

b_list = []
while (b !=0):
    b_list.append(b%10)
    b = b//10

a_list = str(a_list[0]) + str(a_list[1]) + str(a_list[2])
b_list = str(b_list[0]) + str(b_list[1]) + str(b_list[2])

if a_list>b_list:
    print(a_list)
else:
    print(b_list)