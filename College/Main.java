#include<iostream>
using namespace std;
struct college{
  char name[50],city[50];
  int year;
  float pper;
}c[10];
int main()
{
  int n,i;
  cin>>n;
  cout<<"Enter the number of colleges\n";
  for(i=1;i<=n;i++)
  {
    cin>>c[i].name>>c[i].city>>c[i].year>>c[i].pper;
    cout<<"Enter the details of college "<<i<<"\nEnter name\nEnter city\nEnter year of establishment\nEnter pass percentage\n";
  }
  cout<<"Details of colleges";
  for(i=1;i<=n;i++)
    cout<<"\nCollege:"<<i<<"\nName:"<<c[i].name<<"\nCity:"<<c[i].city<<"\nYear of establishment:"<<c[i].year<<"\nPass percentage:"<<c[i].pper;
}