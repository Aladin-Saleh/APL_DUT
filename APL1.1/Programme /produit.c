#include<stdlib.h>
#include<stdio.h>



int main(void){


int ent1;
int ent2;


printf("Tapé le premier entier:\n");
scanf("%d", &ent1);

printf("Tapé le deuxieme entier:\n");
scanf("%d", &ent2);
 


if(ent1 < 0 && ent2 < 0){

	printf("Le resultat du produit sera positif \n");



}
if(ent1 > 0 && ent2 < 0 ){

	printf("Le resultat du produit sera négatif\n");


}

if(ent1 < 0 && ent2 > 0 ){

	printf("Le resultat du produit sera négatif\n");


}


if(ent1 > 0 && ent2 > 0){
	printf("Le resultat du produit sera positif \n");


}


return EXIT_SUCCESS;
}
