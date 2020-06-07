#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,k=0,max;
  cin>>r>>c;
  int a[r][c],sum[r],sum1[c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++){
    sum[i]=0;
    for(j=0;j<c;j++){
       sum[i]=sum[i]+a[i][j];}
    cout<<sum[i]<<" ";
  }
   max=sum[0];
  for(i=0;i<r;i++)
    if(sum[i]>max){
      max=sum[i];
      k++;}
  cout<<"\nRow "<<k+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(i=0;i<c;i++){
    sum1[i]=0;
    for(j=0;j<r;j++){
       sum1[i]=sum1[i]+a[j][i];}
    cout<<sum1[i]<<" ";
  }
  k=0;
  max=sum1[0];
   for(i=0;i<r;i++)
     if(sum1[i]>max){
      max=sum1[i];
      k++;}
  cout<<"\nColumn "<<k+1<<" has maximum sum";
  
}