#include <stdio.h>
int main() {
	//write your code here
  int n;
  scanf("%d",&n);
  if(n==1||n==2)
    printf("%d",1);
  else if(n>2 && n<55)
    printf("%d",2);
  else 
    printf("%d",5);
	return 0;
}