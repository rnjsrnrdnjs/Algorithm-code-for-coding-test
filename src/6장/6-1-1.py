n = int(input())
array_list = list(map(int, input().split()))

max_num = array_list[0]
min_num = array_list[0]

for num in array_list:
    
    if num > max_num:
        max_num = num
    if num < min_num:
        min_num = num

print(min_num, max_num)