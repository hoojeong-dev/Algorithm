import sys

n=int(sys.stdin.readline().rstrip())
data_queue=list()

for index in range(n):
    data=sys.stdin.readline().rstrip().split()
    
    if data[0]=='push':
        data_queue.append(data[1])
        
    elif data[0]=='pop':
        print(data_queue.pop(0) if len(data_queue) else -1)
            
    elif data[0]=='size':
        print(len(data_queue))
        
    elif data[0]=='empty':
        print(0 if len(data_queue) else 1)
            
    elif data[0]=='front':
        print(data_queue[0] if len(data_queue) else -1)
            
    elif data[0]=='back':
        print(data_queue[len(data_queue)-1] if len(data_queue) else -1)