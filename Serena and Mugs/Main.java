#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,vc,i,sum=0;
  cin>>n>>vc;
  int vm[n];
  for(i=0;i<n;i++){
    cin>>vm[i];
    sum=sum+vm[i];}
  if(sum<=vc)
    cout<<"YES";
  else
    cout<<"NO";
}