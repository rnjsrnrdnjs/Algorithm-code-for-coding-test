def dfs(idx, sum):
    global answer
    if(idx >= n):
      return
    sum+=arr[idx]
    if(s == sum):
      answer += 1
    dfs(idx+1, sum-arr[idx])
    dfs(idx+1, sum)

n, s = map(int, input().split())
arr = list(map(int, input().split()))
answer=0
dfs(0,0)
print(answer)