#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main(){
    string str;
    cin >> str;
    int strSize = str.length();
    int result = 0;

    for(int i=0; i<strSize; i++){
        if(65 <= str[i] && str[i] <= 67){
            result = result + 3;
        } else if(68 <= str[i] && str[i] <= 70){
            result = result + 4;
        }else if(71 <= str[i] && str[i] <= 73){
            result = result + 5;
        }else if(74 <= str[i] && str[i] <= 76){
            result = result + 6;
        }else if(77 <= str[i] && str[i] <= 79){
            result = result + 7;
        }else if(80 <= str[i] && str[i] <= 83){
            result = result + 8;
        }else if(84 <= str[i] && str[i] <= 86){
            result = result + 9;
        }else if(87 <= str[i] && str[i] <= 90){
            result = result + 10;
        }
    }

    cout << result << endl;

    return 0;

}