# 백준 8958

n = int(input())
for _ in range(n):
    ox_list = list(input())
    ox_count = 0
    sum_ox = 0
    for ox in ox_list:
        if ox == "O":
            ox_count += 1
            sum_ox += ox_count
        else:
            ox_count = 0
    print(sum_ox)
    