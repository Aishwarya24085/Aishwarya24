#include<iostream>

using namespace std;

class AccessSpecifierDemo
{
    public:
        int pubvar;
    protected:
        int provar;
    private:
        int privar;
    public:
    void setVar(int priValue,int proValue, int pubValue)
    {
        pubvar=pubValue;
        provar=proValue;
        privar=priValue;
    }
    void getVar()
    {
        cout<<"private variable:"<<privar<<endl;
        cout<<"protected variable:"<<provar<<endl;
        cout<<"public variable:"<<pubvar<<endl;
    }
};

int main()
{
    int p1,p2,p3;
    AccessSpecifierDemo obj;
    cout<<"Enter private variable:";
    cin>>p1;
    cout<<"Enter protected variable:";
    cin>>p2;
    cout<<"Enter public variable:";
    cin>>p3;
    obj.setVar(p1,p2,p3);
    obj.getVar();
}