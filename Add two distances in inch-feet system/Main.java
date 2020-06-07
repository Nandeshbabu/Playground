#include<iostream>
using namespace std;
int main()
{
  int i1,i2,i;
  float f1,f2,f;
  cin>>i1>>f1>>i2>>f2;
    f=f1+f2;
    if(f>12){
      i1++;
      f=f-12;}
    i=i1+i2;
  cout<<i<<"'"<<"-"<<f<<"\"" ;
  
}