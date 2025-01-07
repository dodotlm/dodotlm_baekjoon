#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
    string str;
    int count = 0;

    // 한 줄 입력 받기
    getline(cin, str);

    // 문자열 앞뒤 공백을 제거
    size_t start = str.find_first_not_of(" ");
    size_t end = str.find_last_not_of(" ");

    if (start == string::npos || end == string::npos) {
        // 문자열이 공백만 있을 경우
        cout << 0 << endl;
        return 0;
    }

    // 공백을 기준으로 단어를 분리하여 카운트
    stringstream ss(str.substr(start, end - start + 1));  // 앞뒤 공백을 제거한 부분만 처리
    string word;

    while (ss >> word) {
        count++;  // 단어를 하나씩 읽으면서 카운트
    }

    cout << count << endl;

    return 0;
}
