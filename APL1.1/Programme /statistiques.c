#include<stdio.h>
#include<stdlib.h>
#include<string.h>



int main(void){


char carac[200];

printf("Tapez votre chaîne de caractère : \n");

int i;
int c;
int tailleCarac;



i =0;
while((c = getchar()) !='\n'){
	if(c  == 'e'){
		i = i + 1;
	}


}

tailleCarac = strlen(c);
printf("Il y a %d caractere \n");
printf("Il y a %d 'e' dans votre chaine \n",i);
	
	





return 0;
}
