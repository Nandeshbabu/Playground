#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,n1=0,n2=1,n3;
  cin>>n;
 for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;
  n1=n2;    
  n2=n3;  
  }
  cout<<n3;
}