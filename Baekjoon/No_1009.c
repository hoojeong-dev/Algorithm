#include <stdio.h>

int main(){

    int T, i = 0;   // T : test case 개수
    scanf("%d", &T);

    while(i<T){
        int a, b, total = 1;
        scanf("%d %d", &a, &b);

        for(int j=0; j<b; j++){
            total = total * a % 10;
        }

        if(total == 0)
            total = 10;

        printf("%d\n", total);

        i++;
    }
    return 0;
}