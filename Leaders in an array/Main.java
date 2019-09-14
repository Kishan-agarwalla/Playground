#include <stdio.h>
int main() 
{
  int n;
  int arr[10];
  int i,j,flag;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(i=0;i<n;i++)
  {  flag=1;
    for(j=i+1;j<n-1;j++)
      if(arr[i]<arr[j])
      {
        flag=0;
        break;
      }
    if(flag==1)
      printf("%d ",arr[i]);
  }
  
    //write your code here
    return 0;
}