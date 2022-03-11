import sys

n = list(map(int, list(sys.stdin.readline().split(" "))))
queue = []
result = []

for i in range(1, n[0]+1):
    queue.append(i)

while queue:
    for i in range(n[1]-1):
        queue.append(queue.pop(0))
    result.append(str(queue.pop(0)))

answer = "<"
for i in range(len(result)):
    answer += result[i]
    if i+1 == len(result):
        answer += ">"
        break
    answer += ", "

print(answer)