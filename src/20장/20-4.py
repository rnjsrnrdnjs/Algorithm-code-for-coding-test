m, n = map(int, input().split())
map = [list(map(int, input().split())) for _ in range(m)]
dp = [[-1]*n for _ in range(m)]
move=[[0,1],[1,0],[0,-1],[-1,0]]

def dp_bruteForce(y,x):
  if dp[y][x]!=-1:return dp[y][x]
  if y==m-1 and x==n-1 : return 1

  dp[y][x]=0
  for i in range(0,4):
    dy=y+move[i][0]
    dx=x+move[i][1]
    if 0 <= dy < m and 0 <= dx < n and map[y][x]>map[dy][dx]:
      dp[y][x]+=dp_bruteForce(dy,dx)
  
  return dp[y][x]

print(dp_bruteForce(0,0))