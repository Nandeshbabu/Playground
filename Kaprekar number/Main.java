#include<iostream>
using namespace std;
int main()
{
  int c,sum=0,digit,a,l,p;
  cin>>a;
  l=a;
  c=a*a;
  if(c<100)
    p=10;
  else
    p=100;
  while(c>0)
  {
    digit=c%p;
    sum=sum+digit;
    c=c/p;}
  if(a==sum)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  
}