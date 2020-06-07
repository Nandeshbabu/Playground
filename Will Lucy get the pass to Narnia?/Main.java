#include<iostream>
using namespace std;
int main()
{
  int n,m,a;
  cout<<"Enter first number :";
  cin>>n;
  cout<<" Enter second number :";
  cin>>m;
  cout<<" Menu\n"<<"1.Addition\n"<<"2.Subtraction\n"<<"3.Multiplication\n"<<"4.Division\n"<<"5.Remainder\n";
  cin>>a;
  switch(a)
  {
    case 1:cout<<n+m;
           break;
    case 2:cout<<n-m;
           break;
    case 3:cout<<n*m;
           break;
    case 4:cout<<n/m;
           break;
    case 5:cout<<n%m;
           break;
    default:cout<<"Invalid operation";
      
  }
}



  