#include <iostream>

using namespace std;

template<typename T>
class Calculator {
public:
    // Template function for addition
    T add(T a, T b) {
        return a + b;
    }

    // Template function for subtraction
    T subtract(T a, T b) {
        return a - b;
    }

    // Template function for multiplication
    T multiply(T a, T b) {
        return a * b;
    }

    // Template function for division
    T divide(T a, T b) {
        if (b == 0) {
            cout<<"Error!!Can't possiable"<<endl;
            return 0;
        }
        else
        {
            return a / b;
        }
    }
};

int main() {
    Calculator<int> intCalculator;

    cout << "Integer calculations:" <<endl;
    cout << "5 + 3 = " << intCalculator.add(5, 3) <<endl;
    cout << "5 - 3 = " << intCalculator.subtract(5, 3) <<endl;
    cout << "5 * 3 = " << intCalculator.multiply(5, 3) <<endl;
    cout << "5 / 3 = " << intCalculator.divide(5, 3) <<endl;

    Calculator<double> doubleCalculator;

    cout << "\nDouble calculations:" <<endl;
    cout << "5.5 + 3.2 = " << doubleCalculator.add(5.5, 3.2) <<endl;
    cout << "5.5 - 3.2 = " << doubleCalculator.subtract(5.5, 3.2) <<endl;
    cout << "5.5 * 3.2 = " << doubleCalculator.multiply(5.5, 3.2) <<endl;
    cout << "5.5 / 3.2 = " << doubleCalculator.divide(5.5, 3.2) <<endl;

    return 0;
}