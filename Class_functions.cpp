#include<iostream>

using namespace std;

inline void displayWelcomeMessage()
{
    cout<<"Welcome to the C++ program"<<endl;
}

class Box
{
    float length,width,height;
    public:
        void boxArea(float length, float width,float height)
        {
            cout<<"Area of the box is "<<(2*(length*width))+(2*(width*height))+(2*(height*length))<<endl;
        }
        void setDimensions(float l,float w,float h)
        {
            length=l;
            width=w;
            height=h;
        }
    void boxVolume(float length, float width, float height);
    friend void displayBoxDimensions(Box);
};

void Box :: boxVolume(float length, float width, float height)
{
    cout<<"The Volume of the box is "<<(length*width*height)<<endl;
}

void displayBoxDimensions(Box obj)
{
    cout<<"Length of obj is "<<obj.length<<endl;
    cout<<"Width of obj is "<<obj.width<<endl;
    cout<<"Height of obj is "<<obj.height<<endl;
}

int main()
{
    Box obj;
    float l,w,h;
    displayWelcomeMessage();
    cout<<"Enter length,width and height of the Box: ";
    cin>>l>>w>>h;
    obj.setDimensions(l,w,h);
    displayBoxDimensions(obj);
    obj.boxArea(l,w,h);
    obj.boxVolume(l,w,h);
}