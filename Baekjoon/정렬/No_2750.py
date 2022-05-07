import sys
import heapq

N = int(sys.stdin.readline())
heap = []

for _ in range(N):
    x = int(sys.stdin.readline())
    heapq.heappush(heap, x)

for _ in range(N):
    print(heapq.heappop(heap))