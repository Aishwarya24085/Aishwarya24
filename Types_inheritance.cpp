#include<iostream>

using namespace std;

//simple inheritance
class supercls{
    public:
        int a=10;
};

class subcls : public supercls{
    public:
        void displaySIn()
        {
            cout<<"Simple Inheritance"<<endl;
            cout<<"a="<<a<<endl;
        }
};

//multiple inheritance

class father{
    public:
       int x=2;
};

class mother{
    public:
       int y=3;
};

class child : public father,public mother{
    public:
        void displayMIn()
        {
            cout<<"Multiple Inheritance"<<endl;
            cout<<"Total="<<(x+y)<<endl;
        }
};

//multi-level inheritance

class maincls{
    public:
    void mainf()
    {
        cout<<"I am main class"<<endl;
    }
};

class derived1 : public maincls{
    public:
    void der1()
    {
        cout<<"I am first derived class"<<endl;
    }

};

class derived2 : public derived1{
    public:
    void der2()
    {
        cout<<"I am second derived class"<<endl;
    }
};

//Hierarchical Inheritance

class vehicle{
    public:
    string colour;
};

class bike : public vehicle{
    public:
        int speed=100;
        string colour="yellow";
};

class car : public vehicle{
    public:
        int speed=350;
        string colour="red";
};

//Hybrid Inheritance

class subjects{
    public:
    int numpages;
};

class biology : public subjects{
    public:
    int btopic=10;
    int numpages=150;
};

class physics : public subjects{
    public:
    int ptopic=14;
    int numpages=300;
};

class science : public biology,public physics{
    public:
    int topic=(btopic+ptopic);
};


int main()
{
    subcls obj1;
    obj1.displaySIn();
    child obj2;
    obj2.displayMIn();
    derived2 obj3;
    cout<<"Multi-level Inheritance"<<endl;
    obj3.der1();
    obj3.der2();
    obj3.mainf();
    cout<<"Hierarchical Inheritance"<<endl;
    bike b;
    car c;
    cout<<"Colour of bike = "<<b.colour<<endl;
    cout<<"Colour of car = "<<c.colour<<endl;
    cout<<"Speed of bike = "<<b.speed<<endl;
    cout<<"Speed of car = "<<c.speed<<endl;
    cout<<"Hybrid Inheritance"<<endl;
    science book;
    cout<<"no of topics = "<<book.topic<<endl;
}