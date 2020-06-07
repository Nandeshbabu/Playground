#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int n,digit,even=0,odd=0;
  cin>>n;
  while(n>0)
  {
    digit=n%10;
    if(digit%2==0)
      even=even+digit;
    else
      odd=odd+digit;
    n=n/10;
}
if(even==odd)
  cout<<"Yes";
else
  cout<<"No";
}