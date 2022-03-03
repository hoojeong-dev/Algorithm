import sys

t = int(sys.stdin.readline())

for i in range(t):
    data = sys.stdin.readline()
    stack = list(data)
    sum = 0

    for j in stack :
        if j == "(":
            sum += 1
        elif j == ')':
            sum -= 1
        
        if sum < 0 :
            print("NO")
            break

    if sum == 0: print('YES')
    else: print('NO')