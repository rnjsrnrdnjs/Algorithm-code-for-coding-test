import sys
from collections import deque

N = int(sys.stdin.readline())

queue = deque()
for i in range(N):
    queue.append(i + 1)

while len(queue) > 1:
    queue.popleft()
    queue.append(queue.popleft())

print(queue.pop())
