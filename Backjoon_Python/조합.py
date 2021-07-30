def dfs(L):
    if L==r :
        print(result)
    else :    
        for i in range (len(n)):
            if checklist[i] == 0:
                checklist[i] = 1
                #result[L] = n[i]
                result[L] = i+1
                dfs(L+1)
                checklist[i] = 0

                
if __name__ == "__main__" :
    n = [1,2,3,4]
    r = 4
    checklist = [0] * len(n)
    result = [0] * r
    dfs(0)

    
    
