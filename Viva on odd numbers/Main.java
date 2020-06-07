#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  int a,r=0;
  float sum=0;
  for(int i=0;;i++){
    if(r==3)
      break;
    cin>>a;
    if(a<0){
      sum=sum-1.0;
      break;}
    if(a%2!=0){
      sum=sum+1.0;
      r++;}
    else if(a%2==0)
      sum=sum-0.5;
    else if(sum==3.0)
      break;
  }
  cout<<sum;
  return 0;
}