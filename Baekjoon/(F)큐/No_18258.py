import sys

n=int(sys.stdin.readline())
data_queue=list()
index = 0   # 요소를 추가할 때마다 그 위치를 기억하는 변수

for i in range(n):
    data=sys.stdin.readline().split()
    
    if data[0]=='push':
        data_queue.append(data[1])
        
    # pop 동작을 수행하면 맨 앞의 요소를 제거한 뒤, 뒤의 모든 원소들을 모두 앞으로 땡김
    # 이 과정에서 많은? 시간이 듦
    # 첫번째가 될 요소의 위치를 기억하는 변수를 두어, 계속 뒤에 추가함
    elif data[0]=='pop':
        if len(data_queue) > index:
            print(data_queue[index])
            index += 1   # pop을 하게 된다면 맨 앞의 요소가 지워지므로 index가 1만큼 증가
        else: print(-1)
            
    elif data[0]=='size':
        print(len(data_queue)-index)
    
    elif data[0]=='empty':
        # 큐의 크기와 index의 크기가 같아질 때 큐를 비움
        if len(data_queue) == index:
            print(1)
            index, data_queue = 0, []
        else: print(0)
            
    elif data[0]=='front':
        print(data_queue[index] if len(data_queue) > index else -1)
            
    elif data[0]=='back':
        print(data_queue[-1] if len(data_queue) > index else -1)