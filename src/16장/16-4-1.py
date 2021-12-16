def sosu(num):
  for i in range(2, int(num**0.5)+1):
    if num%i==0: return i
  return -1
 
def soinsu(num):
  for i in range(2, int(num**0.5)+1):
    if num%i==0:
       while num%i==0:num//=i
       if num==1:return 1
       else: return -1
  return -1
      
 
n=int(input())
answer=sosu(n)
s=soinsu(n)
if answer==-1:print(n)
else:
  if s==-1:print(1)
  else: print(answer)