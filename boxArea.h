#define AREA
#include<iostream>

using namespace std;

void boxArea(float length, float width,float height)
{
    cout<<"Area of the box is "<<(2*(length*width))+(2*(width*height))+(2*(height*length))<<endl;
}