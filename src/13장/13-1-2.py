def hanoi(num, start, to, end):
    if num == 1:
        print(start, end)
    else:
        hanoi(num-1, start, end, to)
        print(start, end)
        hanoi(num-1, to, start, end)

num = int(input())
print(2**num - 1)
hanoi(num, 1, 2, 3)