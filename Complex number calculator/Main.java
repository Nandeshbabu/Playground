#include <iostream>
using namespace std;
int main ()
{
  int choice,a,b,c,d,r,i;
  cin>>choice>>a>>b>>c>>d;
  if(choice<4)
  {
  if(choice==1)
  {
    r=a+c;
    i=b+d;
  }
  else if(choice==2)
  {
    r=a-c;
    i=b-d;
  }
  else if(choice==3)
  {
     r= a*c-b*d;
     i=(b*c)+(a*d);
  }
    if(i<0)
      cout<<r<<i<<"i";
    else
      cout<<r<<"+"<<i<<"i";
  }
  else
    cout<<"Invalid choice";
}