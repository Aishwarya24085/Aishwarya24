#include<iostream>

using namespace std;

class Student
{
    public:
        string fullName;
        int rollNum;
        double semPerentage;
        string collegeName;
        int collegeCode;
        void getdata(Student s1)
        {
            cout<<"Information of the student:"<<endl;
            cout<<"Name : "<<s1.fullName<<endl;
            cout<<"RollNum : "<<s1.rollNum<<endl;
            cout<<"SemPercentage : "<<s1.semPerentage<<endl;
            cout<<"CollegeName : "<<s1.collegeName<<endl;
            cout<<"CollegeCode : "<<s1.collegeCode<<endl;
        }
        Student(string fn,int rn,double sp,string cn,int cc)
        {
            cout<<"Constructor is Created."<<endl;
            fullName=fn;
            rollNum=rn;
            semPerentage=sp;
            collegeName=cn;
            collegeCode=cc;
        }
        ~Student(){}
};


int main()
{
    string fn;
    int rn;
    double sp;
    string cn;
    int cc;
    cout<<"Enter Your Full Name:";
    getline(cin,fn);
    cout<<"Enter Your Roll Number:";
    cin>>rn;
    cout<<"Enter Your Sem Percentage:";
    cin>>sp;
    cout<<"Enter Your College Name:";
    cin>>cn;
    cout<<"Enter Your College Code:";
    cin>>cc;
    Student s1(fn,rn,sp,cn,cc);
    
    s1.getdata(s1);
}
