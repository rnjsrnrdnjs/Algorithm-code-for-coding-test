n=int(input())
a=list(map(int,input().split()))
prefix_sum=[0]*200001
map={}
answer=0
 
map[0]=1
for i in range(n):
  prefix_sum[i]=a[i]
  if i!=0:
    prefix_sum[i]+=prefix_sum[i-1]
  if prefix_sum[i] in map :
    answer+=1
    map.clear()
    map[prefix_sum[i-1]]=1
  map[prefix_sum[i]]=1
print(answer)