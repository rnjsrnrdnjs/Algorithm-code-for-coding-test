from collections import deque

def direction_change(d, c):
    if c == "L":
        d = (d - 1) % 4
    else:
        d = (d + 1) % 4
    return d

N = int(input())
K = int(input())
board = [[0] * N for _ in range(N)]
for _ in range(K):
    a, b = map(int, input().split())
    board[a - 1][b - 1] = 1  
L = int(input())
times = {}
for i in range(L):
    X, C = input().split()
    times[int(X)] = C

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

direction = 1 
time = 1  
y, x = 0, 0  
snake = deque([[y, x]]) 
board[y][x] = 2

while True:
    y, x = y + dy[direction], x + dx[direction]
    if 0 <= y < N and 0 <= x < N and board[y][x] != 2:
        if not board[y][x] == 1:
            del_y, del_x = snake.popleft()
            board[del_y][del_x] = 0 
        board[y][x] = 2
        snake.append([y, x])
        if time in times.keys():
            direction = direction_change(direction, times[time])
        time += 1
    else: 
        break

print(time)