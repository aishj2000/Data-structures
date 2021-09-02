#include <iostream>

using namespace std;

char RemoveX(char str[]){
if(str[0]=='\0')
{
    return 0;
}

if(str[0]=='x'){
    int i=1;
    for(; str[i]!='\0'; i++){
            str[i-1]=str[i];
    }
    str[i-1]=str[i];
    RemoveX(str);
}
else{
    RemoveX(str+1);
}



}

int main()
{
    cout<<"Enter string: ";
    char str[100];
    cin>>str;
    RemoveX(str);
    cout<<"String is: "<<str<<endl;


}
