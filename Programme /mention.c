#include<stdlib.h>
#include<stdio.h>


int main(void){
int moy;


printf("Tapé votre moyenne au bac\n");
scanf("%d",&moy);

if(moy < 12 ){
	printf("Vous n'avez pas de mention ! \n");

}  

if(moy > 12 && moy < 14 ){
	printf("Vous avez la mention assez-bien ! \n");


}

if(moy > 14 && moy < 16 ){
	printf("Vous avez la mention bien !\n");


}
if(moy > 16 && moy < 20){
	printf("Vous avez la mention tres bien ! \n");

}


return EXIT_SUCCESS;

}
