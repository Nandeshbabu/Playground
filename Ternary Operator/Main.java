#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  n=n%2;
  string result=(n==0)?"Even":"Odd";
  cout<<result;
}