testcase = int(input())

for i in range(testcase):
    map = {}
    answer = 1
    n = int(input())
    for j in range(n):
        a, b = input().split()
        if not b in map:
            map[b] = 1
        else:
            map[b] += 1
    for k in map.keys():
        answer = answer * (map[k]+1)
    print(answer-1)
