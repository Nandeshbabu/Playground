#include<iostream>
using namespace std;
int main()
{
  int num,d,count;
  cin>>num;
  do{
    d=num%10;
    count=count+1;
    num=num/10;
  }while(num);
  cout<<count;  
    
}