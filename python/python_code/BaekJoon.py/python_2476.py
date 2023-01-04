import time
N = int(input())
M=0
time1 = time.time()
for _ in range(N):
  k, m, n = map(int, input().split())
  if k==m==n:
    j = 10000 + m*1000
  elif k==m or m==n:
    j = 1000 + m*100
  elif k==n:
    j = 1000+ k*100
  elif k!=m!=n:
    j = max(k,m,n)*100  
  if M<j:
      M=j

print(M)
time2 = time.time()
print(time2-time1)
    
    