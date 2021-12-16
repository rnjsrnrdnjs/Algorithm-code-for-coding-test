n, k=map(int, input().split())
dp = [[0]*1001 for _ in range(1001)]

for i in range(1, n+1) :
    for j in range(0, i+1) :
      if j==0:
        dp[i][j]=1
      elif j==i:
        dp[i][j]=1
      else:
        dp[i][j] = ( dp[i-1][j-1] + dp[i-1][j]) %10007

print(dp[n][k])