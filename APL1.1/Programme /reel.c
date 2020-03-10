#include<stdlib.h>
#include<stdio.h>
#include<math.h>


int main(void){


double a;



printf("Entrer un réel : ");
scanf("%lf",&a);

printf("%e\n",a);



int i;
char b; 

printf("Entrez un caractère :\n ");
scanf("%*c");
scanf("%c",&b);


i = 0;
while(i < 6){
i = i + 1;
printf("%c\n",b);

}








return EXIT_SUCCESS;
}
