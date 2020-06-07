#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,i=6,c=1;
  cin>>n;
  while(c<=n)
  {
    cout<<i<<" ";
    i=i+(5*c);
    c++;
  }
}
  