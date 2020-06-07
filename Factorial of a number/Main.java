#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,i,sum=1;
  cin>>n;
  for(i=1;i<=n;i++)
    sum=sum*i;
  cout<<sum;
}