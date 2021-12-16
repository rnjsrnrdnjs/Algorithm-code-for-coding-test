N = int(input())
room = []

for i in range(N):
    A, B = map(int, input().split())
    room.append([A, B])

room.sort(key=lambda x: (x[1], x[0]))

answer = 0
endTime = 0
for i in range(len(room)):
    if endTime <= room[i][0]:
        endTime = room[i][1]
        answer += 1

print(answer)
