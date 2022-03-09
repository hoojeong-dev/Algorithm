import sys
from collections import deque

n, m = map(int, list(sys.stdin.readline().split()))
out = list(map(int, list(sys.stdin.readline().split())))
deq = deque()
count = 0

for i in range(1, n+1):
    deq.append(i)

for i in range(m):
    target = deq.index(out[i])
    half = int(len(deq) / 2)

    if out[i] == deq[0]:
        deq.popleft()
        continue
        
    else:
        if target <= half:
            deq.rotate(-target)
            count += target
        
        else:
            deq.rotate(len(deq)-target)
            count += len(deq)-target
            
    deq.popleft()

print(count)
