N = int(input())
arr = [int(i) for i in input().split()]
 
s=int(input())
while True:
  tof=False
  for i in range(N):
    idx=i
    cmp=0
    for j in range(N-1,i,-1):
      if arr[idx]<arr[j] and j-i<=s:
        idx=j
        tof=True
        cmp=j-i
    if idx!=i:
      tmp=arr[idx]
      del arr[idx]
      arr.insert(i,tmp)
      s-=cmp
      break
  if tof==False:
    break

print(*arr)

