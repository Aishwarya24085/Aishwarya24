#include<iostream>

using namespace std;

class supercls{
    public:
        int pubv=10;
    protected:
        int prov=20;
    private:
        int priv=30;
    public:
        int getpriv(){
            return priv;
        }
        int getpub(){
            return pubv;
        }
        int getpro(){
            return prov;
        }

};

class subcls1 : public supercls{
    public:
    int vpub1=pubv;
    int vpub2=prov;
    int vpub3=getpriv();
};

class subcls2 : protected supercls{
    public:
    int vpro1=pubv;
    int vpro2=prov;
    int vpro3=getpriv();
};

class subcls3 : private supercls{
    public:
    int vpri1=pubv;
    int vpri2=prov;
    int vpri3=getpriv();
};

int main()
{
    subcls1 obj1;
    subcls2 obj2;
    subcls3 obj3;
    cout<<"Class public inheritance:"<<endl;
    cout<<"Public : "<<obj1.vpub1<<endl; //public
    cout<<"Protected : "<<obj1.vpub2<<endl;//protected
    cout<<"Private : "<<obj1.vpub3<<endl;//private
    cout<<"Class protected inheritance:"<<endl;
    cout<<"Public : "<<obj2.vpro1<<endl;//protected
    cout<<"Protected : "<<obj2.vpro2<<endl;//protected
    cout<<"Private : "<<obj2.vpro3<<endl;//private
    cout<<"Class private inheritance:"<<endl;
    cout<<"Public : "<<obj3.vpri1<<endl;//private
    cout<<"Protected : "<<obj3.vpri2<<endl;//private
    cout<<"Private : "<<obj3.vpri3<<endl;//private

}