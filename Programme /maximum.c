#include<stdlib.h>
#include<stdio.h>

int main(void){

int a,b,c;
int max;




printf("Entrer a,b,c :");
scanf("%d %d %d", &a , &b, &c);


if(a > b && b > c){

printf("%d\n",a);

}else if(b > a && a > c){
printf("%d\n",b);


}else if(c > a && a > b)

printf("%d\n",c);


return EXIT_SUCCESS;

}
