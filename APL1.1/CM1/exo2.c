#include<stdio.h>
#include<stdlib.h>



int main(void){

signed char a ='9';
int c = 9;
long double b = 9.0L;
long int d = 9L;

printf("%x \n",c);
printf("%.0Lf \n",b);
printf("%ld \n",d);
printf("%c \n",a);


return EXIT_SUCCESS;
}
