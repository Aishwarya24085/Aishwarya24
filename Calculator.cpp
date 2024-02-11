#include<iostream>
using namespace std;

int main()
{
    int choice;
    float n,m;
    cout<<"Enter number1:";
    cin>>n;
    cout<<"Enter number2:";
    cin>>m;
    cout<<"Available Operations:\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n";
    cout<<"Enter your choice:";
    cin>>choice;
    switch(choice)
    {
        case 1: cout<<"Addition of "<<n<<","<<m<<" is "<<(n+m)<<endl;
            break;
        case 2: cout<<"Subtraction of "<<n<<","<<m<<" is "<<(n-m)<<endl;
            break;
        case 3: cout<<"Multiplication of "<<n<<","<<m<<" is "<<(n*m)<<endl;
            break;
        case 4: if(m==0)
                    cout<<"Division Can't be done.\n";
                else
                    cout<<"Division of "<<n<<","<<m<<" is "<<(n/m)<<endl;
            break;
        default: cout<<"Operation Can't be performed.\n";
    }
}