#include<iostream>

using namespace std;

class mainclass
{
    public:
        void displaymsg()
        {
            cout<<"I am a main class."<<endl;
        }
};
class subclass : public mainclass
{
    public:
        void displaymsg()
        {
            cout<<"I am a sub class."<<endl;
        }
};
int main()
{
    subclass obj;
    obj.displaymsg();
}