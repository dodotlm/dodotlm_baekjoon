#include <iostream>
#include <vector>

using namespace std;

int main() {
    string S;
    cin >> S;
    vector<int> result(26, -1);  // result 벡터를 -1로 초기화

    // 문자열 S에서 각 알파벳의 첫 번째 위치 기록
    for (int k = 0; k < S.size(); k++) {
        if (result[S[k] - 'a'] == -1) {  // 첫 등장 위치만 기록
            result[S[k] - 'a'] = k;
        }
    }

    // 결과 출력
    for (int i = 0; i < 26; i++) {
        cout << result[i];
        if (i != 25) {  // 마지막 문자가 아니면 공백을 추가
            cout << " ";
        }
    }

    return 0;
}
