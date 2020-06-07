#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,i=11,c=0;
  cin>>n;
  while(c<n)
  {
    cout<<pow(i,2)<<" ";
    i=i+4;
    c++;
  }
}
    