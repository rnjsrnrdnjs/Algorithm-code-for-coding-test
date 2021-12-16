n=int(input())
weight=list(map(int,input().split()))
weight.sort()

answer=1
for i in weight:
  if answer<i:
    break
  answer+=i

print(answer)