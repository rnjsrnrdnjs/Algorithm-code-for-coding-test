import sys
n = int(input())
count_sort = [0] * 10001
for i in range(n):
    count_sort[int(sys.stdin.readline())] += 1
for i in range(10001):
    if count_sort[i] != 0:
        for j in range(count_sort[i]):
            print(i)