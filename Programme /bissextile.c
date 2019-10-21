#include<stdio.h>
#include<stdlib.h>


int main(void){

int a;

printf("Choisir l'année : ");
scanf("%d", &a);

if (a % 4==0 && a % 100!=0){
	printf("Votre année est bissextile \n", a);

} 
   else {
	printf("N'est pas bissextile \n", a);

}

 return EXIT_SUCCESS;

 }
