#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=0,c=0,b=6,d;
  cin>>n;
  while(c<n)
  {
    if(c<2){
      cout<<a<<" ";
      if(c==1){
        c++;
        }
      else{
        a=a+2;
       c++;}
    }
    else{
      a=a+b;
      d=a+b;
      if(n==3){
         cout<<a<<" ";
         c++;}
      else{
      cout<<a<<" "<<d<<" ";
      b=b+4;
      a=d;
      c=c+2;}
    }
}
}