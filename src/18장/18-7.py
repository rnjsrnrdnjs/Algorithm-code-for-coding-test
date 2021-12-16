n = int(input())
member = []
for i in range(n):
    age, name = map(str, input().split())
    age = int(age)
    member.append([age, name])

member.sort(key = lambda x : x[0])

for i in member:
    print(i[0], i[1])