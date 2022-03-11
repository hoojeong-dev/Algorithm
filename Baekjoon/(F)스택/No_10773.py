import sys

k = int(sys.stdin.readline())
stack = []
result = 0

for i in range(k):
    data = int(sys.stdin.readline())

    if data:
        stack.append(data)
    else:
        stack.pop()

for i in range (len(stack)):
    result = result + stack[i]

print(result)