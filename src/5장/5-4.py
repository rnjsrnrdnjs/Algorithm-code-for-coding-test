def sum(A,B):
  return A+B
def sub(A,B):
  return A-B
def mul(A,B):
  return A*B
def div(A,B):
  return int(A/B)
def sur(A,B):
  return A%B

a,b= map(int, input().split())
print(sum(a,b))
print(sub(a,b))
print(mul(a,b))
print(div(a,b))
print(sur(a,b))
