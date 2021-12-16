s=str(input())
bomb=str(input())
left=[]

start=0;end=len(s)-1
while(start<=end):
  tof=True
  left.append(s[start]);start+=1
  if(len(left)>=len(bomb)):
    for i in range(len(bomb)):
      if bomb[i]!= left[len(left)-len(bomb)+i]:
        tof=False
        break
    if tof==True:
      for i in range(len(bomb)):
        left.pop()

if len(left)==0 : print("FRULA")
else :
  for i in range(len(left)):
    print(left[i],end='')


