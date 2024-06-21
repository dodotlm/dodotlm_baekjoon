#include <stdio.h>
#include <string.h>

int stackArr[10000]; // 스택 배열
int numCnt = 0;

void push(int num){
    stackArr[numCnt] = num;
    ++numCnt;
}

void pop(){
    if(numCnt != 0){
        --numCnt; // 커서를 한 칸 아래로 지정 
        printf("%d\n", stackArr[numCnt]);
    }else{
        printf("-1\n");
    }
}

void size(){
    printf("%d\n", numCnt);
}

void empty(){
    if(numCnt != 0){
        printf("0\n");
    }else{
        printf("1\n");
    }
}

void top(){
    if(numCnt != 0){
        printf("%d\n", stackArr[numCnt-1]);
    }else{
        printf("-1\n");
    }
}

int main (void){
    int num; 
    char order[10]; // 명령어 배열 
    scanf("%d", &num);
    
    int i = 0; // c언어는 for문에서 변수 선언하면 이따금씩 오류난다. 
    
    for(i = 0; i < num; i++){
        scanf("%s", order);
        if(strcmp("push", order) == 0){
            int tempnum; 
            scanf("%d", &tempnum);
            push(tempnum);
        }else if(strcmp("pop", order) == 0){
            pop();
        }else if(strcmp("size", order) == 0){
            size();
        }else if(strcmp("empty", order) == 0){
            empty();
        }else if(strcmp("top", order) == 0){
            top();
        }
    }

    return 0;
}
