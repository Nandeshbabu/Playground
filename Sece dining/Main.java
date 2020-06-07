#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  int a;
  cin>>s;
  cin>>a;
  if(s=="front")
     {
       if(a==1)
         cout<<"Left Handed";
       else
         cout<<"Right Handed";
     }
  else
  { if(s=="rear")
     {
       if(a==1)
         cout<<"Right Handed";
       else
         cout<<"Left Handed";}}
}