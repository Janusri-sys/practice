n=int(input("enter n:"))
for i in range(n):
    for k in range(n-i-1):
        print(" ",end="")
    for j in range(2*i+1):
        print("*",end="")
    print()
for i in range(n-1,0,-1):
    for k in range(n-i):
        print(" ",end="")
    for j in range(2*i-1):
        print("*",end="")
    print()