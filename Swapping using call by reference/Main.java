#include<iostream>
using namespace std;
 int main()    
{    
int a=10, b=20;
   cin>>a>>b;
cout<<"Before swapping a= "<<a<<" and b="<<b;
a=a+b;
b=a-b;//b=10 (30-20)    
a=a-b;//a=20 (30-10)    
cout<<"\nAfter swapping a= "<<a<<" and b="<<b;    
return 0;  
}  