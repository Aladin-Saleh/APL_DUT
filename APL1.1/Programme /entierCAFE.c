#include<stdlib.h>
#include<stdio.h>



int main(void){

int hexadeca = 1234;


printf("Tapez un chiffer en qui sera en hexadecimal : ");
scanf("%x", &hexadeca);

if(hexadeca==1234){
	printf("ERREUR ! \n");


} else {

printf("L'entier tapé est : %d en décimale\n", hexadeca);
}
return EXIT_SUCCESS;
}
