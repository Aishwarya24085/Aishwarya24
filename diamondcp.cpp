#include<iostream>

using namespace std;
class ClassA{
    public:
        void aClass()
        {
            cout<<"I am a ClassA"<<endl;
        }
};

class ClassB: public ClassA{
    public:
        void bClass()
        {
            cout<<"I am a ClassB"<<endl;
        }
};

class ClassC: public ClassA{
    public:
    void cClass()
    {
        cout<<"I am a ClassC"<<endl;
    }
};
class ClassD: public ClassC,public ClassB
{
    public:
    void dClass()
    {
        cout<<"I am a ClassD"<<endl;
    }
};
int main()
{
    ClassD obj;
    //obj.aClass();
    //aClass() method becomes ambiguous here
    obj.bClass();
    obj.cClass();
    obj.dClass();
    return 0;
}
