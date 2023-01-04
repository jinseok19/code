n = int(input())

for i in range(n):
    a, b = map(int, input().split())
    A,B= a,b
    
    while a!=0:
      b= b%a
      a,b = b,a
      
             
    fma= A*B//b
    print(fma)
    
  
