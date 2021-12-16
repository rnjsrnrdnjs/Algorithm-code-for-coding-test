N = int(input())
arr = list()
for i in range(N):
  arr.append(int(input()))
for i in range(N):
    for j in range(i+1,N):
        if arr[i]>arr[j]:
            tmp=arr[i]
            arr[i]=arr[j]
            arr[j]=tmp
for i in arr:
  print(i)

