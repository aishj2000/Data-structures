#include <iostream>

using namespace std;

int length(char str[])
{
    if(str[0]=='\0'){
        return 0;
    }
    int ans = length(str+1);
    return 1+ans;
}

int main()
{
    char str[100];
    cout<<"Enter string: ";
    cin>>str;

    int l = length(str);
    cout<<"Length is: "<<l<<endl;
}
