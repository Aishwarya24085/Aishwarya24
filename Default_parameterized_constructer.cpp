#include<iostream>

using namespace std;

class Student
{
    public:
        int collegeCode;
        double semPerentage;
        Student()
        {
            cout<<"Values in Default constructor:"<<endl;
            string collegeName = "MVGR";
            int collegeCode=33;
            cout<<"College name ="<<collegeName<<endl;
            cout<<"College code ="<<collegeCode<<endl;
        }
        Student(string fullName, double semPercentage)
        {
            cout<<"In parameterized Constructor:"<<endl;
            cout<<"FullName ="<<fullName<<endl;
            cout<<"Sem Percentage ="<<semPercentage<<endl;
        }
};
int main()
{
    Student s1;
    string name;
    double sp;
    cout<<"Enter your name:";
    getline(cin,name);
    cout<<"Enter your sem percentage:";
    cin>>sp;
    Student s2(name,sp);
}