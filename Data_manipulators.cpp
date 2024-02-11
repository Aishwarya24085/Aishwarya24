#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
    //using endl
    cout<<"Using endl\n";
    cout<<"This is a c++ program."<<endl;
    //using ends
    cout<<"Using ends and endl\n";
    cout<<"Hi"<<ends;
    cout<<endl;
    //terminates by inserting null operator
    //using ws
    string name;
    cout<<"Using ws\n";
    cout<<"Enter a name:";
    getline(cin>>ws,name);
    cout<<name<<endl;
    //removes whitespaces if they are present
    //setw
    cout<<"Using setw(int)\n";
    cout<<setw(4)<<"Hi\n";
    //creates spaces provides in setw(n)
    //setfill
    cout<<"Using setfill(char)\n";
    cout<<setfill('*')<<setw(15)<<"Hi Aishu\n";
    //fills the space given by setw
    //setprecision
    cout<<"Using setprecision(int)\n";
    double num=8.9379;
    cout<<setprecision(3)<<num<<endl;
    //setprecision decides the values after the decimal points
    //flush
    int a=10;
    cout<<"Using flush\n";
    cout.flush();
    cout<<"The value of a is "<<a;
    return 0;
}