N=int(input())
k=int(input())
X=int(input())


# N=8
# k=2
# X=5
prices=[1,2,3,4,5,1,2,3]
dist_count=len(set(prices))
not_remember=dist_count-k
cost=not_remember*X
print(cost)