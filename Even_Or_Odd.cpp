#include<iostream>
using namespace std;

void Check(int num){
    if(num%2==0)
        cout<<num<<" is Even.\n";
    else
        cout<<num<<" is Odd.\n";
}

int main()
{
    int num;
    cout<<"Enter a Number:";
    cin>>num;
    Check(num);
}