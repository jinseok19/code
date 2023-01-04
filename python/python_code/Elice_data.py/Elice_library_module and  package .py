## 이렇게 해보세요!를 따라 수행해보세요.
import cal

var1 = cal.modelName

var2 = cal.plus(3,4)

var3 = cal.minus(7,2)

## 변수의 값을 확인하는 출력문입니다.
print(var1, var2, var3)


## 이렇게 해보세요!를 따라 수행해보세요.
from random import randrange
import math

var1 = randrange(1,11)
var2 = math.log(5184,72)
print(var1, var2)

## 이렇게 해보세요!를 따라 수행해보세요.
from urllib.request import urlopen
webpage = urlopen("https://www.naver.com/").read().decode("UTF-8")
print(webpage)
