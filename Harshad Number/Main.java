#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int h,digit,sum=0,temp;
  cin>>h;
  temp=h;
  while(h!=0)
  {
    digit=h%10;
    sum=sum+digit;
    h=h/10;
}
  if(temp%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}