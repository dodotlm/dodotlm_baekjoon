#include <iostream>
using namespace std;

int main() {
    int A, B;
    // 입력 받기
    cin >> A >> B;

    // A와 B의 거꾸로 읽은 숫자 계산
    int reversedA = (A % 10) * 100 + ((A / 10) % 10) * 10 + (A / 100);
    int reversedB = (B % 10) * 100 + ((B / 10) % 10) * 10 + (B / 100);

    // 더 큰 값 출력
    if (reversedA > reversedB) {
        cout << reversedA;
    } else {
        cout << reversedB;
    }

    return 0;
}
