import sys
from collections import deque

t = int(sys.stdin.readline())

for i in range(t):
    p = sys.stdin.readline().rstrip()
    n = int(sys.stdin.readline())
    deq = deque(sys.stdin.readline().rstrip()[1:-1].split(","))
    count_R = 0
    flag = 0

    if n == 0:
        deq = deque()

    for j in p:
        if j == "R":
            count_R += 1
        else:
            if len(deq) < 1:
                flag = 1
                print("error")
                break
            else:
                if count_R %2 == 0:
                    deq.popleft()
                else:
                    deq.pop()

    if count_R %2 != 0:
        deq.reverse()
    
    if flag == 0:
        print("[" + ",".join(deq) + "]")