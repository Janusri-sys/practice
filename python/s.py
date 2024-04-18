n=5
for i in range(n):
    if i%2==0:
        for j in range(3):
            print(" *",end="")
    else:
        if i==1:
            print("*",end="")
            for j in range(1,3):
                print(" ",end="")
        else:
            if i==3:
                for j in range(3):
                    print(" ",end="")
                print("*")

        
    print()