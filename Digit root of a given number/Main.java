#include<iostream>
using namespace std;
int number(int);
int main()
{
  int n;
  cin>>n;
  while(1){
  if(n<10){
      cout<<n;
      break;}
  else
     n=number(n);  
  }
}
int number(int m)
{
  int a=0,digit;
   while(m>0)
   {
    digit=m%10;
    a=a+digit;
    m=m/10;
   }
   return a;
}
