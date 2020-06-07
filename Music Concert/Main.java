#include<iostream>
using namespace std;
int main(){
  int n,i,f=0,m=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2==0)
       f++;
    else
       m++;}
   cout<<m<<"\n"<<f;
  return 0;
}