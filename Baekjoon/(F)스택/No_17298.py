from inspect import stack
import sys

n = int(sys.stdin.readline())
a = list(map(int, list(sys.stdin.readline().split(" "))))
result = [-1] * n
temp = []

for i in range(n):
    while temp and a[temp[-1]] < a[i]:
        result[temp.pop()] = a[i]
    temp.append(i)

print(*result)