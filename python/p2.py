# 

def bin(n):
    binary_digits=""
    while(n>0):
        quotient,remainder=divmod(n,2)
        binary_digits=str(remainder)+binary_digits
        n=quotient
    return binary_digits
def oct(n):
    octal_digits=""
    while(n>0):
        quotient,remainder=divmod(n,8)
        octal_digits=str(remainder)+octal_digits
        n=quotient
    return octal_digits
def hex(n):
    hex_digits=""
    while(n>0):
        quotient,remainder=divmod(n,16)
        if remainder==10:
             remainder='A'
        if remainder==11:
             remainder='B'
        if remainder==12:
             remainder='C'
        if remainder==13:
             remainder='D'
        if remainder==14:
             remainder='E'

        if remainder==15:
             remainder='F'
        hex_digits=str(remainder)+hex_digits
        n=quotient
    return hex_digits
          
n=17
for i in range(1,n+1):
        print(str(i)+" "+oct(i)+" "+hex(i)+" "+bin(i))