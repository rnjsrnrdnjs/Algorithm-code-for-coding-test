N = int(input())
csortA = [0 for i in range(1002)]
csortB = [0 for i in range(1002)]

teamA = [int(x) for x in input().split()]
for i in range(N):
  csortA[teamA[i]]+=1
teamB = [int(x) for x in input().split()]
for i in range(N):
  csortB[teamB[i]]+=1

 
answer=0

for i in range(1,1001):
  while csortA[i]:
    tof=False
    for j in range(i-1,0,-1):
      if csortB[j]:
        tof=True
        answer+=2
        csortA[i]-=1
        csortB[j]-=1
        break
    if tof==False:
      break

for i in range(1,1001):
  while csortA[i] and csortB[i]:
    answer+=1
    csortA[i]-=1
    csortB[i]-=1

print(answer)

