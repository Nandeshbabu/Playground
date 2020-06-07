#include<iostream>
using namespace std;
int main()
{
  int p,r,n;
  float i,a,d,f;
  cin>>p>>n>>r;
  i=(p*n*r)/100;
  a=p+i;
  d=(i*2)/100;
  f=a-d;
  cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
}