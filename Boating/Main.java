#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,a,c,ans;
  cin>>w>>a>>c;
  a=a*75;
  c=c*30;
  ans=a+c;
  if(ans==w || (ans>=0&&ans<=w))
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";

    
  
}