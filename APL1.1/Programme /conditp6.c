#include<stdlib.h>
#include<stdio.h>




int main(void){


int entn;


printf("Tapé un entier :\n");
scanf("%d", &entn);

if(entn%3==0){

printf("L'entier %d  est un multiple de 3\n",entn);

}else{
	printf("L'entier le plus proche est %d\n",((entn/3) * 3)); 

}

return EXIT_SUCCESS;
}
