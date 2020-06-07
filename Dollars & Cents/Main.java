#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,d,c,n;
  cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  c=c1+c2;
  n=c/100;
  if(n>0){
    d=d+n;
    c=c-(n*100);}
  cout<<d<<"\n"<<c;

  
}