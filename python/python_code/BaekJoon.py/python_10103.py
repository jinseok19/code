n = int(input())
dice_value1_total = dice_value2_total =100
for _ in range(n):
    dice_value1, dice_value2 = map(int, input().split())
    
    if dice_value1 > dice_value2 :
        dice_value2_total -= dice_value1
    elif dice_value1 < dice_value2:
        dice_value1_total -= dice_value2
    else:
        dice_value2_total += 0
print(dice_value1_total)
print(dice_value2_total)
