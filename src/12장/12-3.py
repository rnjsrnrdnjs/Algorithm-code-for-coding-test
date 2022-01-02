N = int(input())
meet = []

for i in range(N):
    A, B = map(int, input().split())
    meet.append([A, B])

meet.sort(key=lambda x: (x[1], x[0]))

answer = 0
endTime = 0
for i in range(len(meet)):
    if endTime <= meet[i][0]:
        endTime = meet[i][1]
        answer += 1

print(answer)
