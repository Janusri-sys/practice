n=4
for i in range(n):
    for j in range(n-i):
        print("*",end="")
    print()
for i in range(1,n):
    for j in range(i+1):
        print("*",end="")
    print()