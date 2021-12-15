human=[list(map(int, input().split())) for _ in range(5)] 
humanScore=[0]*5
score=0
for i in range(5):
  sum=0
  for j in range(4):
    sum+=human[i][j]
  humanScore[i]=sum
  score=max(score,sum)

for i in range(5):
  if humanScore[i]==score:
    print(i+1,score)
    break
