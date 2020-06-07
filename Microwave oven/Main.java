#include<iostream>
#include <iomanip>  
using namespace std;
int main()
{
  //Type your code here.
  int t;
  float time,lt;
  cin>>t>>time;
  if(t==2){
    lt=(time/2)+time;
    cout<<fixed<<setprecision(2)<<lt;}
  else if(t==3){
    lt=time*2;
    cout<<fixed<<setprecision(2)<<lt;}
  else 
    cout<<"Number of items is more";
  
}