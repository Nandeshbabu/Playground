#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u;
  cin>>u;
  if(u<=200)
    cout<<"Rs."<<(u/2);
  else if(u>200 && u<=400)
    cout<<"Rs."<<(0.65*u)+100;
  else if(u>400 && u<=600)
    cout<<"Rs."<<(0.80*u)+200;
  else
    cout<<"Rs."<<(1.25*u)+425;

}