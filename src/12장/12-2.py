equtation =input().split('-')
answer=0

for i in equtation[0].split('+'):
  answer+=int(i)

for i in equtation[1:]:
  for j in i.split('+'):
    answer-=int(j)

print(answer)