n=4
for i in range(n):
    for k in range(i):
        print(" ",end="")
    for j in range(n-i):
        print("*",end="")
    print()
for i in range(1,n):
    for k in range(n-i-1):
        print(" ",end="")
    for j in range(i+1):
        print("*",end="")
    print()