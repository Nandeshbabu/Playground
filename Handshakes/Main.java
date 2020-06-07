#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,i,j,sum=0,count=0;
  cin>>s;
  for(i=1;i<=s;i++)
  {
    for(j=i+1;j<=s;j++){
        sum=sum+(j+i);
        count++;
    }
  }
  cout<<count;
}