#include<iostream>
using namespace std;
struct employee
{
  char name[50],d[50];
  int id,age,salary;
};
int main()
{
  employee e;
  cin>>e.name>>e.id>>e.age>>e.d>>e.salary;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details";
  cout<<"\nName of the Employee : "<<e.name<<"\nID of the Employee : "<<e.id<<"\nAge of the Employee : "<<e.age<<"\nDesignation of the Employee : "<<e.d<<"\nSalary of the Employee : "<<e.salary;
  
}