#큰 수 A+B
# 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
# 파이썬은 오버플로우가 없기 때문에 가능
# arbitrary precision은 사용할 수 있는 메모리양이 정해져 있는 기존의 fixed-precision과 달리, 현재 남아있는 만큼의 가용 메모리를 모두 수 표현에 끌어다 쓸수 있다.
A, B = map(int,input().split())

print(A+B)
