# 백준 10818
import sys

N = int(sys.stdin.readline())
Max_Min_list = list(map(int, sys.stdin.readline().split()))
print(min(Max_Min_list), max(Max_Min_list))