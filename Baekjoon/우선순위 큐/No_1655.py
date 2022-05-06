import sys
import heapq

N = int(sys.stdin.readline())

left_heap = []
right_heap = []

for _ in range(N):
    x = int(sys.stdin.readline())
    
    if len(left_heap) <= len(right_heap):
        heapq.heappush(left_heap, (-x, x))
    
    else:
        heapq.heappush(right_heap, x)

    if right_heap and left_heap[0][1] > right_heap[0]:
        left = heapq.heappop(left_heap)[1]
        right = heapq.heappop(right_heap)

        heapq.heappush(left_heap, (-right, right))
        heapq.heappush(right_heap, left)

    print(left_heap[0][1])