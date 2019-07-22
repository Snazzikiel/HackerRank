long repeatedString(string s, long n) {

    double letCount = 0.0;
    double ratio = 0.0;

    char cTemp[s.length() + 1];
    strcpy(cTemp, s.c_str());
    for (int i = 0; i < s.length(); i++){
        if (cTemp[i] == 'a'){
            letCount++;
        }
    }
    /*for (int i = 0; i <= s.length(); i++){
        if (s[i] == 'a'){
            letCount++;
        }
    }*/

    ratio = ( n/s.length() ) *letCount;
    for(int i = 0; i < n%s.length(); i++){
        if (s[i] == 'a'){
            ratio++;
        }
    }
    return ratio;
    
}