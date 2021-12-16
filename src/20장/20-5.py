dp=[0]*3001
 
for _ in range(int(input())):
  n=int(input())
  for i in range(0,n):dp[i]=1
  tmp=list(map(int,input().split()))
  a=[]
  mx=1
  for i in range(n):
    a.append([tmp[i],i])
  a.sort()
  for i in range(1,n):
    if a[i-1][1]<a[i][1]:
      dp[i]=dp[i-1]+1
    mx=max(mx,dp[i])
  print(n-mx)