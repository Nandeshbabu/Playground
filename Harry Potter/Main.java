#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,f,l,ans;
  cin>>n;
  l=n%10;
  f=n/1000;
  ans=l+f;
  cout<<ans;
}