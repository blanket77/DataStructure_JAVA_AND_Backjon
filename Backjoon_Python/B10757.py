import sys
a,b = sys.stdin.readline().split(" ")
b = b.replace("\n","")
a = a[::-1]
b = b[::-1]
r = ""
carry = 0

if len(a)>=len(b):
    for i in range(len(b)):
        tmp_add = int(a[i]) + int(b[i]) + carry
        if tmp_add>=10:
            carry = 1
            tmp_add-=10
            r += str(tmp_add)
        else:
            carry = 0
            r += str(tmp_add)
    if carry == 1 and len(a)==len(b):
        r += "1"
        carry = 0

    else:
        for i in range(len(b),len(a)):
            tmp_add = int(a[i]) + carry
            if tmp_add >= 10:
                carry=1
                tmp_add -=10
                r += str(tmp_add)
            else:
                carry = 0
                r += str(tmp_add)

    if carry == 1:
        r += "1"
                
else:
    for i in range(len(a)):
        tmp_add = int(a[i]) + int(b[i]) + carry
        if tmp_add>=10:
            carry = 1
            tmp_add-=10
            r += str(tmp_add)
        else:
            carry = 0
            r += str(tmp_add)
            
    for i in range(len(a),len(b)):
        tmp_add = int(b[i]) + carry
        if tmp_add >= 10:
            carry=1
            tmp_add -=10
            r += str(tmp_add)
        else:
            carry = 0
            r += str(tmp_add)
            
    if carry == 1:
        r += "1"

r = r[::-1]
print(r)

