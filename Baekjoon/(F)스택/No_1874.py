import sys

n = int(sys.stdin.readline())
arr = list()
result = list()
count = 0
flag = 0

for i in range(n):
    x = int(sys.stdin.readline())
    
    while count < x:
        count += 1
        arr.append(count)
        result.append('+')

    if arr[-1] == x:
        arr.pop()
        result.append('-')
    else:
        flag = 1
        break

if flag == 1:
    print("NO")
else:
    for i in result:
        print(i)