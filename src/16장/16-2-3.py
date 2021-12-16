moduler=[0]*1001
 
n,m=map(int,input().split())
a=list(map(int,input().split()))
 
for i in range(n):
  moduler[a[i]%m]+=1
 
tof=True
for i in range(1000):
  if moduler[i]>1 :tof=False
 
if tof==False: print(0)
else:
  answer=1
  for i in range(n-1):
    for j in range(i+1,n):
      tmp=0
      if a[i]<a[j]:tmp=a[j]-a[i]
      else:tmp=a[i]-a[j]
      answer*=tmp
      answer%=m
 
  print(answer%m)