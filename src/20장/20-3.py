dp=[0]*1001

n=int(input())
arr=list(map(int,input().split()))
arr.insert(0,0)

answer=0
for i in range(1,n+1):
  for j in  range(0,i):
    if arr[j]<arr[i]:
      dp[i]=max(dp[i],dp[j]+1)
  answer=max(answer,dp[i])

print(answer)