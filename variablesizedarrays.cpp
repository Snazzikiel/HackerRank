#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   

    int arrNo = 0;
    int arrIndex = 0;
    int totCount = 0;

    int find1 = 0;
    int find2 = 0;

    cin >> arrNo >> arrIndex;

    int **arr = new int*[arrNo];
    int arr2d[arrNo];

    for (int i = 0; i < arrNo; i++){
        cin >> totCount;
        arr[i] = new int[totCount];
        for (int x = 0; x < totCount; x++){
            cin >> arr[i][x];
        }
    }

    for (int q = 0; q < arrNo; q++){
        cin >> find1 >> find2;
        cout << arr[find1][find2] << endl;
    }


    return 0;
}

