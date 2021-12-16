n, m = map(int, input().split())
board = []
answer = []

for _ in range(n):
    board.append(input())

for col in range(n - 7):
    for row in range(m - 7):
        countW = 0
        countB = 0
        for i in range(col, col + 8):
            for j in range(row, row + 8):
                if (i + j)%2 == 0:
                    if board[i][j] != 'W': countW += 1  
                    if board[i][j] != 'B': countB += 1
                else :
                    if board[i][j] != 'B': countW += 1
                    if board[i][j] != 'W': countB += 1
        answer.append(countW)
        answer.append(countB)

print(min(answer))        