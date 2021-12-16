from collections import deque

visit=[[0 for col in range(10)] for row in range(10)]
visit2=[[0 for col in range(10)] for row in range(10)]
dx=[0,0,1,-1]
dy=[1,-1,0,0]

def bfs():
  global answer

  for x in range(n):
    for y in range(m):
      visit[x][y]=lab[x][y]
      if(lab[x][y]==2):
        queue.append([x,y])
  
  while(queue):
    x,y=queue.popleft()
    visit[x][y]=1
    for i in range(4):
      if 0<= x+dx[i]<n and 0<=y+dy[i]<m and lab[x+dx[i]][y+dy[i]]==0 and visit[x+dx[i]][y+dy[i]]==0:
        queue.append([x+dx[i],y+dy[i]])
        visit[x+dx[i]][y+dy[i]]=1

  cnt=0
  for x in range(n):
    for y in range(m):
      if lab[x][y]==0 and visit[x][y]==0:
        cnt+=1
  answer=max(answer,cnt)

def back_Traking(select):
    
    if select == 3:
      bfs()
      return
    for x in range(n):
      for y in range(m):
        if not lab[x][y] and not visit2[x][y]:
          visit2[x][y]=1
          lab[x][y] = 1
          back_Traking(select + 1)
          lab[x][y] = 0
          visit2[x][y]=0

queue=deque()
answer = 0
n, m = map(int, input().split())
lab = [list(map(int, input().split())) for _ in range(n)]
back_Traking(0)
print(answer)