#include <iostream>

using namespace std;

class Shape {
public:
    virtual double area()=0;

    void displayArea(){
        cout <<"Area: "<< area()<<endl;
    }
};

class Circle : public Shape {
private:
    double radius;
public:
    Circle(double r){
        radius=r;
    }

    double area(){
        return 3.14*radius*radius;
    }
};

class Rectangle : public Shape {
private:
    double length;
    double width;

public:
    Rectangle(double l, double w){
        length=l;
        width=w;
    }

    double area(){
        return length*width;
    }
};

int main() {
    Circle circle(5.0);
    Rectangle rectangle(4.0, 6.0);

    cout<<"Circle ";
    circle.displayArea(); 
    cout<<"Rectangle ";
    rectangle.displayArea();  

    return 0;
}