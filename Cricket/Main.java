#include<iostream>
#include<bits/stdc++.h> 
using namespace std;
int main()
{
  //Type your code here.
  int o,b,bb;
  float sr,tr,of,cr,trr;
  string str;
  cin>>b>>tr>>sr>>bb;
  o=b/6;
  of=(bb%6);
  of=(bb/6)+(of*0.1);
  cr=sr/of;
  trr=tr/o;
  if(cr>trr)
    str="Eligible to Win";
  else
    str="Not Eligible to Win"; 
  cout<<o<<"\n";
  cout<<fixed<<setprecision(1)<<of<<"\n";
  cout<<cr<<"\n"<<trr<<"\n"<<str;
}