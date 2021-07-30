def dfs(L, start):
    if L==r :
        print(result)
    else :    
        for i in range (start, len(n)):
            #result[L] = n[i]
            result[L] = i+1
            dfs(L+1, i+1)

                
if __name__ == "__main__" :
    n = [1,2,3,4]
    r = 2
    result = [0] * r
    dfs(0,0)

    
    
