#include <stdio.h>
int main() 
{ 
  int n;
  int i,j;
  int arr[10];
  scanf("%d",&n);
  for( i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for( i=0;i<n;i++){
    for(j=0;j<i;j++)
    {
      if(arr[i]==arr[j])
        break;
    }
  if(i==j)
    printf("%d ",arr[i]);
  }
    //write your logic here
	return 0;
}