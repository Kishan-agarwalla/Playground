#include<stdio.h>
int main()
{ 
  int m;
  int i,j,flag=1;
  int n;
  int arr[5][5];
  int search;
  scanf("%d",&m);
  scanf("%d",&n);
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      scanf("%d",&arr[i][j]);
  scanf("%d",&search);
  for(i=0;i<m;i++){
    for(j=0;j<n;j++)
      if(arr[i][j]==search)
      {
        flag=0;
        printf("(%d, %d)",i,j);
        
        break;
      }
  }
 if(flag==1)
   printf("(%d, %d)",-1,-1);
  
  
  //Type your code here
  return 0;
}