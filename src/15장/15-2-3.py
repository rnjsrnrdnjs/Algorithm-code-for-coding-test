from collections import deque

dx= [0, -1, 0, 1] 
dy =[-1, 0, 1, 0]

def bfs():
    visit = [[[0]*2 for _ in range(M)] for _ in range(N)]
    visit[0][0][0] = 1
    while q:
        x, y, wall = q.popleft()
        if x==(N-1) and y==(M-1): return visit[x][y][wall]
        for i in range(4):
            if 0 <= x+dx[i] < N and 0 <= y+dy[i] < M and visit[x+dx[i]][y+dy[i]][wall] == 0:
                if Map[x+dx[i]][y+dy[i]]=='0':
                    visit[x+dx[i]][y+dy[i]][wall] = visit[x][y][wall] + 1
                    q.append([x+dx[i], y+dy[i], wall])
                if wall == 0 and Map[x+dx[i]][y+dy[i]] == '1':
                    visit[x+dx[i]][y+dy[i]][1] = visit[x][y][0] + 1
                    q.append([x+dx[i], y+dy[i], 1])
    
    return -1

N, M = map(int, input().split())
Map = [list(input()) for _ in range(N)]
q = deque()
q.append([0, 0, 0])
print(bfs())