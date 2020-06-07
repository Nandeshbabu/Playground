#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j;
  cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++){
      if(i%2==0){
        if((j+1)==n)
           cout<<i+2;
        else
          cout<<i+1;}
      else{
        if(j==0)
          cout<<i+2;
        else
          cout<<i+1;}
    }
    cout<<"\n";
  }
    return 0;
}