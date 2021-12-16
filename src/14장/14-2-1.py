n = int(input())
title = 666
find_cnt=0
while(True):
    if "666" in str(title) : 
        find_cnt+=1
        if find_cnt == n : print(title) ; break
    title+=1