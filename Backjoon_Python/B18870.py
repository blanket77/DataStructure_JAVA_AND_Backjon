import sys

N = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
arr_list =[]
for i in range(N):
    arr_list.append([i, a[i]]) #index, data
    
arr_list = sorted(arr_list, key=lambda x : x[1])

tmp = arr_list[0][1]
value = 0

for i in range(N):
    if arr_list[i][1] != tmp:
        tmp = arr_list[i][1]
        value+=1
    arr_list[i][1] = value

#print
arr_list = sorted(arr_list, key=lambda x : x[0])
for i in range(N):
    print(arr_list[i][1], end =" ")
