dp=[0]*10001
glass=[0]*10001

n=int(input())
for i in range(1,n+1):
  glass[i]=int(input())

dp[1]=glass[1]
dp[2]=glass[1]+glass[2]
for i in range(3,n+1):
  dp[i]=max(dp[i-1],dp[i-2]+glass[i],dp[i-3]+glass[i-1]+glass[i])

print(dp[n])