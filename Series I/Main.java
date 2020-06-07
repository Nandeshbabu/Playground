#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  float i=0.5,c=0;
  cin>>n;
  while(c<n)
  {
    cout<<i<<" ";
    i=i+(pow(3,c));
    c++;
  }
}