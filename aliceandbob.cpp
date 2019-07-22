#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the sillyGame function below.
 */
string sillyGame(int n) {
    /*
     * Write your code here.
     */

    //sieve of eratosthenes
     vector<bool> game(n + 1, 0);
     vector<int>vRemPrime;

    if (n == 1){
        return "Bob";
    }

    //create vector for each game result (false = bob)
    
    for(int i = 2; i*i <= n ; i++){
        if(!game[i]){
            for(int x = i * 2; x < n+1 ;x = x + i ){
                game[x] = 1;
            }
        }
    }

    //look through prime numbers, and add any remaining numbers - add to vector if found
    for(int i = 2; i < n+1; i++){
        if(!game[i]){
            vRemPrime.push_back(i);
        }
    }

    if ( (vRemPrime.size() % 2) == 0 ){
        return "Bob";
    } else {
        return "Alice";
    }
    

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int g;
    cin >> g;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int g_itr = 0; g_itr < g; g_itr++) {
        int n;
        cin >> n;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        string result = sillyGame(n);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
