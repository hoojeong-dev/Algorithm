import sys

MAX_NUM = 10001

N = int(sys.stdin.readline())
list = [0] * MAX_NUM

for _ in range(N):
    list[int(sys.stdin.readline())] += 1

for i in range(MAX_NUM):
    if list[i] != 0:
        for _ in range(list[i]):
            print(i)