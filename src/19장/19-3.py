n, m = map(int, input().split(':'))

def GCD(a, b):
    if b % a: return GCD(b % a, a)
    else: return a

a = GCD(n, m)
print(n//a,end='')
print(":",end='')
print(m//a,end='')
