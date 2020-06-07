#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,sum1=0,i,j;
  cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  for(i=0;i<n;i++)
    sum=sum+a[i][i];
  for(i=0;i<n;i++)
    sum1=sum1+a[i][n-1-i];
  if(sum==sum1)
    cout<<"Yes";
  else
    cout<<"No";
}