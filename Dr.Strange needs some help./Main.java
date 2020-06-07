#include<iostream>
#include<cmath>
using namespace std;
int required(int,int,int);
int main()
{
  int a,b,c,req;
  cin>>a>>b>>c;
  req=required(a,b,c);
  if(c<req)
     cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  
}
int required(int x,int y,int z)
{
  int r;
  r=pow(y,x);
  return r;
}