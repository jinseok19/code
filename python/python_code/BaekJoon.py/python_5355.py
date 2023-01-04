T = int(input())
for _ in range(T):
  a = input().split(" ")
  
  b = float(a[0])
  c=a[1:]

  for i in c:
    if i =="@":
      b *=3
    elif i =="%":
      b +=5
    else:
      b -=7
  print(format(b,".2f"))








