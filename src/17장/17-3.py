k, n = map(int, input().split())
lanson = []
for i in range(k): lanson.append(int(input()))
low, high = 0, 10000000000
answer=0
while low <= high:
    mid = (low + high) // 2
    num = 0
    for len in lanson: 
      num += len//mid 
    if num >= n: 
      low = mid + 1
      if mid> answer :
        answer=mid
    else: high = mid - 1
print(answer)