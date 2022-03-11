import sys

while True:
    n = list(sys.stdin.readline())
    stack = []
    flag = 0

    if n[0] == ".":
        break
        
    for i in n:
        if i == "(" or i == "[":
            stack.append(i)
        elif i == ")":
            if stack and stack[-1] == "(":
                stack.pop()
            else:
                flag = 1
                break
        elif i == "]":
            if stack and stack[-1] == "[":
                stack.pop()
            else:
                flag = 1
                break
           
    if stack or flag == 1: print('no')
    else: print('yes')
