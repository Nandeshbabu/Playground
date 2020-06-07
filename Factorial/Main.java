#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,fact=1,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  cout<<"The factorial of "<<n<<" is "<<fact;
}