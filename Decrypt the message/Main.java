#include<iostream>
using namespace std;
int main()
{
  int n,m,a,sum=0;
  cin>>n>>m;
  a=n+m;
  for(int i=1;i<a;i++)
  {
    if(a%i==0)
      sum=sum+i;
  }
  if(sum==a)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}
  