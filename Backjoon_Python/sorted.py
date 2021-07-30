N = int(input())
time_list = []

for i in range(N):
    an,bn = input().split()
    an, bn = int(an), int(bn)
    time_list.append([an, bn])
    
print(time_list)
time_list = sorted(time_list, key=lambda x : x[0])
print(time_list)
