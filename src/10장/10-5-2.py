import sys

q, x = map(int, sys.stdin.readline().split())
map = {}
mex = 0
for _ in range(q):
    y = int(sys.stdin.readline())
    if y % x in map:
        if y % x+x*map[y % x] in map:
            map[y % x+x*map[y % x]] += 1
        else:
            map[y % x+x*map[y % x]] = 1
        map[y % x] += 1
    else: map[y % x] = 1

    while mex in map:
        mex += 1
    print(mex)
