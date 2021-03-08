#include <stdio.h>

int T, M, N, K, answer;
int cabbage[51][51], visit[51][51];
 
void dfs(int y, int x);
void init(int *arr, int size);

int main() {
 
    scanf("%d", &T);
 
    while(T--){
        answer = 0;
        scanf("%d %d %d", &M, &N, &K);

        init(cabbage, sizeof(cabbage)/4);
        init(visit, sizeof(visit)/4);

        for (int i = 0; i < K; i++){
            
            int x, y;
            scanf("%d %d", &x, &y);
            cabbage[y][x] = 1;
        }
 
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                
                if (cabbage[i][j] == 1 && !visit[i][j]) {
                    dfs(i, j);
                    answer++;
                }
            }
        }
        printf("%d\n", answer);
    }
    return 0;
}

void dfs(int y, int x) {
 
    int dy[] = {-1,1,0,0};
    int dx[] = {0,0,-1,1};
    visit[y][x] = 1;
 
    for (int i = 0; i < 4; i++)
    {
        int ny = y + dy[i];
        int nx = x + dx[i];
 
        if (ny < 0 || nx < 0 || ny >= N || nx >= M) continue;
        if (cabbage[ny][nx] == 1 && !visit[ny][nx])
            dfs(ny, nx);
    }
}

void init(int *arr, int size){
    for (int i=0;i<size;i++)
        arr[i] = 0;
}