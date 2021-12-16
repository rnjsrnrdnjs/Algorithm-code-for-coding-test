def upper_bound(s, e, d,L):
    while(e - s > 0):
        m = (s+e)//2
        if(L[m] <= d):
            s = m+1
        else:
            e = m
    return e
    
def lower_bound(s, e, d,L):
    while(e - s > 0):
        m = (s+e)//2
        if(L[m] < d):
            s = m+1
        else:
            e = m
    return e

up=[]
down=[]
result=[0]*500001
n,h=map(int,input().split())
for i in range(n):
  obstacle=int(input())
  if i%2==1: up.append(obstacle)
  else :down.append(obstacle)

up.sort()
down.sort()

answer=0
mx=2147483647

for i in range(1,h+1):
  idxd=lower_bound(0,len(down),i,down)
  idxu=lower_bound(0,len(up),h-i+1,up)
  result[i]=n//2-idxd + n//2-idxu
  mx=min(mx,result[i])

for i in range(1,h+1):
  if result[i]==mx:answer+=1

print(mx,answer)