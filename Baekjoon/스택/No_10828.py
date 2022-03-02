import sys

n = int(sys.stdin.readline())
stack = []

for i in range(0, n):
    data = sys.stdin.readline().split()

    if data[0] == 'push':
        stack.append(data[1])
    
    elif data[0] == 'pop':
        print(stack.pop() if len(stack) != 0 else -1)
    
    elif data[0] == 'size':
        print(len(stack))
    
    elif data[0] == 'empty':
        print(0 if len(stack) != 0 else 1)

    elif data[0] == 'top':
        print(stack[-1] if len(stack) else -1)