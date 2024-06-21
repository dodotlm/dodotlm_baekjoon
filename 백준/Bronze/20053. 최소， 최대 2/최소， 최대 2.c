#include <stdio.h>

int main() {
    int T, N, num;
    int max, min;

    // 테스트 케이스 개수 입력
    scanf("%d", &T);

    while (T--) {
        // 배열의 크기 입력
        scanf("%d", &N);
        
        // 첫 번째 숫자를 입력받고, 이를 max와 min으로 초기화
        scanf("%d", &num);
        max = min = num;

        // 나머지 숫자들 입력받고 최대/최소값 갱신
        for (int i = 1; i < N; i++) {
            scanf("%d", &num);
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // 결과 출력
        printf("%d %d\n", min, max);
    }

    return 0;
}