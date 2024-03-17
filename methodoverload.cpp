#include<iostream>
#include<cstring>

using namespace std;

class Addition{
    public:
       int add(int a,int b,int c,int d)
       {
            return (a+b+c+d);
       }
       int add(int a,int b,int c)
       {
            return (a+b+c);
       }
       int add(int a,int b)
       {
            return (a+b);
       }
       float add(float a,float b,float c,float d)
       {
           return (a+b+c+d);
       }
       float add(float a,float b,float c)
       {
          return (a+b+c);
       }
};

int main()
{
    Addition obj;
    cout<<"Sum of four int variables:"<<obj.add(1,2,3,4)<<endl;
    cout<<"Sum of three int variables:"<<obj.add(1,2,3)<<endl;
    cout<<"Sum of two int variables:"<<obj.add(1,2)<<endl;
    cout<<"Sum of three float variables:"<<obj.add(34.23,9.78,3,4)<<endl;
    cout<<"Sum of four float variables:"<<obj.add(1.7,2.3,3,9.4)<<endl;
    cout<<obj.add(1,2,3,4,5)<<endl;
}