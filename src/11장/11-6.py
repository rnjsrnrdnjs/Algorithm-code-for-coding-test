import heapq 
N = int(input())

card = list(int(input()) for _ in range(N))
heapq.heapify(card)
answer=0

while len(card) != 1:
    first = heapq.heappop(card)
    second = heapq.heappop(card)
    sum = first + second
    answer += sum
    heapq.heappush(card,sum)

print(answer)