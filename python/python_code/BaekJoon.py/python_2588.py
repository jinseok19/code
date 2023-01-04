a = int(input())
b = int(input())

var1 = a*(b%10)
var2 = a*((b%100)//10)
var3 = a*(b//100)
var4 = a*b
print(var1,var2,var3,var4)
