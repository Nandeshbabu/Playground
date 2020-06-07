#include<iostream>
using namespace std;
int main()
{
  int n,n1,v,i;
  cin>>n;
  int a[n],b[n+1];
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>n1>>v;
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\nEnter the location where you wish to insert an element\n";
  if(n1>n)
    cout<<"Invalid Input";
  else{
  cout<<"Enter the value to insert\nArray after insertion is\n";
  for(i=0;i<n;i++){
    if(i==n1-1){
      b[i]=v;
      cout<<b[i]<<"\n";
      while(i<n){
        b[i+1]=a[i];
        cout<<b[i+1]<<"\n";
        i++;}}
     else{
       b[i]=a[i];
       cout<<b[i]<<"\n";}
  }
  }
}