#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k;
  cin>>n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<i+1;j++)
      cout<<n+i;
    cout<<"\n";
  }
  for(i=n+3;i>=n;i--)
  {
    k=i+n;  
    for(j=k;j>=(n+n);j--)
      cout<<i;
    cout<<"\n";
  }
}
  