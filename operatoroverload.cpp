#include<iostream>

using namespace std;

class complex{
    public:
        int real;
        int imag;
        complex(){};
        complex(int r, int i){
            real = r;
            imag = i;
        }
        complex operator -(complex c)
        {
            complex temp;
            temp.real = real - c.real;
            temp.imag = imag - c.imag;
            return temp;
        }
        void Display(){
            cout<<"Subtraction of the two complex numbers is:"<<endl;
            cout<<real<<" - "<<imag<<"i"<<endl;
        }
};

int main()
{
    int r1,i1,r2,i2;
    cout<<"Enter real and imaginary values of first complex number:"<<endl;
    cin>>r1>>i1;
    cout<<"Enter real and imaginary values of second complex number:"<<endl;
    cin>>r2>>i2;
    complex c1(r1,i1), c2(r2,i2), c3;
    c3 = c1 - c2;
    c3.Display();
    return 0;
}