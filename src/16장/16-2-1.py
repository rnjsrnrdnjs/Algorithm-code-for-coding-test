N, K = list(map(int, input().split()))

up = 1
for i in range(1,N+1):
    up *= i

down = 1

for i in range(1, N-K+1):
    down *= i

down2=1

for i in range(1, K+1):
    down *= i

down*=down2

print(up // down)