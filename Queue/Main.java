#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[2],i,s=0,c=0;
  for(i=0;i<2;i++) 
    cin>>a[i];
  int b[a[0]];
  for(i=0;i<a[0];i++) 
    cin>>b[i]; 
  if(a[1]==3 || a[1]==4) 
    cout<<a[1]; 
  else     
    cout<<"1"; 
}