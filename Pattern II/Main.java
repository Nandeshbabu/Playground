#include<iostream>
using namespace std;
int main()
{
  int n,k=1,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      for(j=0;j<i;j++)
      {
        if(j+1==i){
          cout<<k<<"\n";
          k++;}
        else{
          cout<<k<<"*";
          k++;}
        }
      }
    else
      {
        k=k+i;
        for(j=0;j<i;j++)
        {
          if(j+1==i){
            cout<<k-1<<"\n";
            k--;}
          else{
            cout<<k-1<<"*";
            k--;}
        }
        k=k+i;
      }
    }
  }
        