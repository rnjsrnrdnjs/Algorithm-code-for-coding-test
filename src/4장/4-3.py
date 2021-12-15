	def Brute_Force(idx, x, y):
	    global answer
	    if(idx == m):
	        choice_chicken = []
	        for i in range(n):
	            for j in range(n):
	                if(City[i][j] == 3):
	                    choice_chicken.append((i,j))
9	        res = Min_Distance(choice_chicken, house)
10	        if(answer > sum(res)):
11	            answer = sum(res)
12	        return
13	    else:
15	        for i in range(x, n):
16	            if(i == x): k = y
17	            else: k = 0
18	            for j in range(k, n):
19	                if(City[i][j] == 2):
20      	              City[i][j] = 3
21              	      Brute_Force(idx+1, i, j+1)
22	                      City[i][j] = 2
23
24	def Min_Distance(chicken,house):
25	    sum_Distance = []
26	    for i in house:
27	        min_D = 987654321
28	        for j in chicken:
29	            Distance = abs(i[0]-j[0]) + abs(i[1]-j[1]) 
30	            min_D = min(min_D, Distance)
31	        sum_Distance.append(min_D)
32	    return sum_Distance
33	
34	n, m = map(int, input().split())
35	City = [list(map(int, input().split())) for _ in range(n)]
36	answer = 987654321
37	house = []
38	for i in range(n):
39	    for j in range(n):
40	        if(City[i][j] == 1):
41	            house.append((i,j))
42	Brute_Force(0,0,0)
43	print(answer)