n, m = map(int, input().split())
answer = []

def backTraking(depth):
    if depth == m:
        print(' '.join(map(str, answer)))
        return
    for i in range(1,n+1):
        answer.append(i)
        backTraking(depth+1)
        answer.pop()

backTraking(0)