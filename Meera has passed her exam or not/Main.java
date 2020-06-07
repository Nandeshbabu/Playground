#include<iostream>
using namespace std;
int main()
{
  int n,max,i,flag;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>max;
  for(i=0;i<n;i++){
    if(a[i]==max){
      flag=1;
      break;}
    else
      flag=0;
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}