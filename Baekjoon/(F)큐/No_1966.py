import sys

t = int(sys.stdin.readline())

for i in range(t):
    n = list(map(int, list(sys.stdin.readline().split())))
    que = list(map(int, list(sys.stdin.readline().split())))
    seq = [-1]*n[0]
    seq[n[1]] = 1
    count = 0

    while True:
        if que[0] == max(que):
            count += 1

            if seq[0] == 1:
                print(count)
                break
            else:
                que.pop(0)
                seq.pop(0)
        else:
            que.append(que.pop(0))
            seq.append(seq.pop(0))