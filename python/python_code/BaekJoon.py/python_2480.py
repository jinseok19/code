import time

a,b,c = map(int, input().split())
time1 = time.time()
if a==b and b==c:
    total = 10000+a*1000
    
elif a==b or b==c:
    total = 1000+b*100
elif a==c:
    total= 1000+a*100

elif a>b and a>c:
    total = a*100
elif b>a and b>c:
    total = b*100
elif c>a and c>b:
    total = c*100

print(total)
time2 = time.time()
print(time2-time1)
