#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=0;i<n;i++)
    for(j=0;j<i+1;j++)
    {
      cout<<i+1;
      if((i+1)==1){
         cout<<"\n";
         break;}
      else if(j==i){
        cout<<"\n";
        break;}
      else
       cout<<"*";
  }
  for(i=n+n;i>n;i--)
  {
    for(j=i;j>n;j--){
      cout<<i-n;
    if((i-n)==1){
         break;}
      else if((j-1)==n){
        cout<<"\n";
        break;}
      else
       cout<<"*";
    }
  }
}