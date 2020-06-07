#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,i,digit,rev;
  cin>>n;
  while(n!=0){
    digit=n%10;
    rev=(rev*10)+digit;
    n=n/10;}
  cout<<rev;
  
	return 0;
}