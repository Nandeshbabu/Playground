#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n,l,f;
  cin>>r>>c>>n;
  l=r*c;
  f=l-r;
  if(n<=r || n%r==1 || (n>f&&n<=l))
    cout<<"Yes";
  else 
    cout<<"No";
  
}