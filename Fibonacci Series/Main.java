#include<iostream>
using namespace std;
int main()
{
 int n1=0,n2=1,n3,i,number,n=1;
 cin>>number;    
 if(number==0)
   cout<<"The term 1 in the fibonacci series is "<<number;
 else{
 for(i=2;i<number;++i)   
 {    
  n3=n1+n2;    
  n++;    
  n1=n2;    
  n2=n3;
  if(n==number)
    break;
 }
 }
  cout<<"The term "<<number<<" in the fibonacci series is "<<n3;
  return 0;
}