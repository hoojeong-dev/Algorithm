#include <stdio.h>

long long comb(int M, int N){
    long long answer=1;

    if(2*N > M)
        N = M-N;

    for(int i=1; i<=N; i++)
        answer = answer*(M--)/i;

    return answer;
}

int main(){

    int T;
    scanf("%d", &T);

    while(T--){
        int N, M;
        scanf("%d %d", &N, &M);

        printf("%lld\n", comb(M, N));
    }

    return 0;
}