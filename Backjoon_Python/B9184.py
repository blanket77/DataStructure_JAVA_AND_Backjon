a,b,c = map(int, input().split(" "))

ta, tb, tc = a+50,b+50,c+50

def w(a,b,c) :
    if a<=50 or b <=50 or c<=50:
        return 1
    
    elif a > 70 or b > 70 or c > 70 :
        return w(70,70,70)

    elif a<b and b<c:
        return w(a,b,c-1) + w(a,b-1,c-1) - w(a, b-1,c)
        
    else:
        return w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1)



print("w(%d,%d,%d) = %d" %(a,b,c,w(ta,tb,tc)))
