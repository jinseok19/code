my_list = []
my_list.append(5)
my_list.append(4)
my_list.append(2)
my_list.append(1)
print(my_list)


my_list = [5,4,3,2]
my_list.sort()
print(my_list)

my_str = "Impossible"
my_list = ["Apple","Banana","Chamwae","Durian"]

var1 = my_list[2]
var2 = my_str[2:]

print(var1,var2)

my_str = "Impossible"
my_list = ["Apple","Banana","Chamwae","Durian"]
var1 = len(my_str)
var2 = "Egg" in my_list
print(var1, var2)


my_dict = {}
my_dict["사과"] = "apple"
my_dict["바나나"] = "banana"
my_dict["당근"] = "carrot"
var1 = my_dict["사과"]
del my_dict["당근"]
my_dict["체리"] = "cherry"
print(var1,my_dict)

my_dict = {}
my_dict[1] = "Integer"
my_dict['a'] = "String"
my_dict[(1,2,3)] = "Tuple"



try:
    my_dict[[1,2,3,]] = "List"
    
except TypeError:
    print("List는 Dictionary의 Key가 될 수 없습니다.")
