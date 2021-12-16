import sys
n=int(sys.stdin.readline())
 
colorPaper=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]

white=0
blue=0  

def divideAndConquer(x,y,n):
    global blue,white
    sameColor=colorPaper[x][y]
    for i in range(x,x+n):
        for j in range(y,y+n):
            if sameColor!=colorPaper[i][j]:
                divideAndConquer(x,y,n//2)
                divideAndConquer(x,y+n//2,n//2)
                divideAndConquer(x+n//2,y,n//2)
                divideAndConquer(x+n//2,y+n//2,n//2)
                return
 
 
    if sameColor==0:
        white+=1
        return
    else:
        blue+=1
        return
 
divideAndConquer(0,0,n)
print(white)
print(blue)