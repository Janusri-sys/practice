def search(li,element):
    low=0
    high=len(li)-1
    while low<high:
        mid=low+(high-low)//2
        if li[mid]>element:
            high=mid-1
        elif li[mid]<element:
            low=mid+1
    return low
li=[2,4,5,6,8,10]
element=9
print(search(li,element))