#include<stdio.h>
int main()
{
  int n,i,pos;
  int arr[10];
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int insert;
  scanf("%d",&insert);
  for(i=0;i<n;i++)
  {
    if(insert<arr[i]){
      pos=i;
    break;
    }
  else
    pos=n;
  }
  for(i=n;i>=pos;i--)
    arr[i]=arr[i-1];
  arr[pos]=insert;
  for(i=0;i<n+1;i++)
    printf("%d ",arr[i]);
    
 //Type your code here
  return 0;
}