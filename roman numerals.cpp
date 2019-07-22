#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
#include <map>


map<string, int> m;

int main(){
    m["I"] = 1;
    m["V"] = 5;
    m["X"] = 10;
    m["L"] = 50;
    m["C"] = 100;
    m["D"] = 500;
    m["M"] = 1000;
    //int T; scanf("%d", &T);
    
    string sInput;
    cin >> sInput;
    while(cin >> sInput){
        //string s; cin >> s;

        int sum = 0;
        for(int i=0;i<sInput.size();i++){
            string z = "";
            z += sInput[i];
            sum += m[z];
        }
        //cout << sum <<endl;
        string result = "";
        int sub[] =  {1000, 900, 500, 400, 100, 90,   50, 40,   10,   9,  5,   4, 1};
        string add[]={"M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        
        int p = 0;
        while(sum != 0){
            while(sum >= sub[p]){
                sum -= sub[p];
                result += add[p];
            }
            p++;
        }

        cout << result << endl;
    }

}
