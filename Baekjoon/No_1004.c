#include <stdio.h>
#include <math.h>
#pragma warning (disable:4996)

int main(void) {
	int T, i = 0;
	scanf("%d", &T);

	while(i < T){
		int x1, x2, y1, y2, n, count = 0;
		scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
		scanf("%d", &n);

		for (int j = 0; j < n; j++) {
			int x, y, r;
			scanf("%d %d %d", &x, &y, &r);
			int s = (pow((x - x1), 2) + pow((y - y1), 2));
			int a = (pow((x - x2), 2) + pow((y - y2), 2));
			if (s < pow(r, 2) && a > pow(r, 2))
				count++;
			if (s > pow(r, 2) && a < pow(r, 2))
				count++;
		}
		printf("%d\n", count);
		i++;
	}
	return 0;
}