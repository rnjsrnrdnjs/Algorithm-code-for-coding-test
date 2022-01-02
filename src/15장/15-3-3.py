from collections import deque

N,M,V=map(int,input().split())
vertex=[[0]*(N+1) for i in range(N+1)]
for i in range(M):
    a,b = map(int,input().split())
    vertex[a][b]=vertex[b][a]=1
visit=[0]*(N+1)

def dfs(V):
    visit[V]=1 
    print(V, end=' ')
    for i in range(1,N+1):
        if(visit[i]==0 and vertex[V][i]==1):
            dfs(i)

def bfs(V):
    visit[V]=0 
    queue=deque() 
    queue.append(V)
    while queue:
        V=queue.popleft()
        print(V, end=' ')
        for i in range(1, N+1):
            if(visit[i]==1 and vertex[V][i]==1):
                queue.append(i)
                visit[i]=0

dfs(V)
print()
bfs(V)