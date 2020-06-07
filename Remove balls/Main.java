#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  int l[n+1];
  l[0]=1;
  for(i=1;i<=n;i++)
  {
    if((i-3)<0)
      l[i]=l[i-1];
    else
      l[i]=l[i-1]+l[i-3];
  }
  int a=pow(10,9);
  cout<<l[n]%(a+7);
  return 0;
}