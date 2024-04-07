#include <iostream>

using namespace std;

class Animal {
public:
    virtual void makeSound()=0;
};

class Dog : public Animal {
public:
    void makeSound(){
        cout <<"Woof!"<<endl;
    }
};

class Cat : public Animal {
public:
    void makeSound(){
        cout<<"Meow!"<<endl;
    }
};

int main() {
    Dog dog;
    Cat cat;
    cout<<"Dog makes sound:"<<endl;
    dog.makeSound();
    cout<<"Cat makes sound:"<<endl;
    cat.makeSound();
    return 0;
}