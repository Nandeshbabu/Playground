#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b1,b2,b3,t,s;
  cin>>b1>>b2>>b3;
  t= (b1 >= b2 && b1 >= b3) ? ((b2 >= b3) ? b2 : b3) : 
    ((b2 >= b3) ? ((b1 >= b3) ? b1 : b3) : ((b1 >= b2) ? b1 : b2));
  s=(b1<b2)?(b1<b3)?b1:b3:(b2<b3)?b2:b3;
  if(b1%s==0 && b2%s==0 & b3%s==0)
    cout<<"The treasure is in box which has number "<<t<<"\nThe code to open the box is "<<s;
  else
    cout<<"The treasure is in box which has number "<<t<<"\nThe code to open the box is 1";
    
  
  
}