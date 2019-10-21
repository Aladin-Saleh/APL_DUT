#include<stdio.h>
#include<stdlib.h>



int main(void){


int a;
signed char b;



printf("Tapé un entier : \n ");
scanf("%d",&a);
b = (signed char) a;
printf("%c \n",b);

signed char c;

printf("tapé un entier : \n");
scanf("%c",&c);

printf("%c",c);




return EXIT_SUCCESS;
}
