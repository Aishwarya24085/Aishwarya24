#include<iostream>
#include"boxArea.h"
#include"boxVolume.h"

using namespace std;

int main()
{
    float l,w,h;
    cout<<"Enter length,width and height of the box:";
    cin>>l>>w>>h;
    #ifdef AREA
        boxArea(l,w,h);
    #endif
    #ifndef AREA
        cout<<"Box area cannot be found!! header file is not included\n";
    #endif
    #ifdef VOLUME
        boxVolume(l,w,h);
    #endif
    #ifndef VOLUME
        cout<<"Box volume cannot be found!! header file is not included\n";
    #endif
}
