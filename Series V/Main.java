#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=11,c=0,b;
  cin>>n;
  while(c<n)
  {
    b=pow(i,2);
    cout<<b<<" ";
    i=i+4;
    c++;
}
}