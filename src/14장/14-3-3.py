def back_Traking(index,sum):
    global minAns
    global maxAns
    if index==N-1:
        if minAns > sum:minAns = sum
        if maxAns < sum:maxAns = sum
        return 

    for i in range(4):
        temp = sum
        if operator[i]==0:continue
        if i==0:sum+=numArr[index+1]
        elif i==1:sum-=numArr[index+1]
        elif i==2:sum*=numArr[index+1]
        else:
            if sum<0:sum = abs(sum)//numArr[index+1]*-1
            else:sum //=numArr[index+1]

        operator[i] -= 1
        back_Traking(index+1,sum)
        operator[i] += 1
        sum = temp

N = int(input())
numArr = list(map(int,input().split()))
operator = list(map(int,input().split()))
minAns = float('Inf')
maxAns = float('-Inf')

back_Traking(0,numArr[0])
print(maxAns)
print(minAns)