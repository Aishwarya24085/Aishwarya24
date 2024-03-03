#include <iostream>
using namespace std;

class Shape {
    public:
        int numSides;
        void displaySides() {
            cout << "Number of sides: " << numSides << endl;
        }
};

class Triangle : public Shape {
public:
    Triangle(){
        numSides=3;
    }
    void displayType() {
        cout << "Type: Triangle" << endl;
    }
};

int main() {
    Triangle t;

    // Call methods from both base and derived classes
    t.displayType();
    t.displaySides();

    return 0;
}