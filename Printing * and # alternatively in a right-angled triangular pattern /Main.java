#include <stdio.h>
int main(){
	// Type your code here
  int n;
  scanf("%d",&n);
  int count =0;
  for(int curr_row=0;curr_row<n;curr_row++)
  {
    for(int curr_col=0;curr_col<=curr_row;curr_col++)
    {
      if(count%2==0)
        printf("*");
      else
        printf("#");
      count++;
      
    }
    printf("\n");
  }
  	return 0;
}