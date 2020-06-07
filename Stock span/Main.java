#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,a[100],b=2,d;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"1"<<endl;
  d=a[0];
  for(i=1;i<n;i++)
  {
    if(a[i]<d)
    {
      d=a[i];
      cout<<"1"<<endl;
    }
    else
    { cout<<b<<endl;
      b=b+2;
    d=a[i];}
  }
    
}