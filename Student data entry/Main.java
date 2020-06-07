#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student s;
  cin.getline(s.name,50);
   cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\nName: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
}