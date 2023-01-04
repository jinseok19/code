my_list = [1,2,3,4,5]
var1 = sum(my_list)
var2 = len(my_list)
var3 = var1/var2
print(var1,var2,var3)

def plus_print(a,b):
    print(a+b)
    
def times_return(a,b):
    return a*b
    
plus_print(3,4)
print(times_return(3,4))

my_dict = {"달": "Moon","태양" : "Sun", "별" : "Star"}
var1 = my_dict.keys()
var2 = my_dict.values()

print(var1, var2)


def solve(a, b):

    return a*b
var1 = solve(3, 4)
var2 =  solve(3, ["Cham"])

print(var1,var2)