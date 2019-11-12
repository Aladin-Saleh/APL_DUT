#include<stdio.h>
#include<stdlib.h>


int triangle(int b){
for(int i = 0; i < b+1;++i){
	printf(" ");
	for(int o = 0; o < i;o++){
	printf("*");
	}
printf("\n");


}

}
////////////////////////////////////////

int carre(int b){
for(int p = 0; p < b; p++){
	for(int d = 0; d < b; ++d){
		printf("*");
	}
printf("\n");
}

}
//////////////////////////////////////////
int choix(int a){
int chx;
int b;
printf("\n1)Triangle\n2)Carre\nQ)Quitter\n");
scanf("%d",&chx);
if(chx == 1 ){
	printf("Taille de votre triangle : \n");
	scanf("%d",&b);
	int tr;
	tr = triangle(b);
}

if(chx == 2){
	printf("Quelle sera la taille de votre carré ? : \n");
	scanf("%d",&b);
	int cr;
	cr = carre(b);
}

if(chx != 1 || chx != 2){
printf("Au revoir....\n");

}

}
//////////////////////////////////////////////////////////

int main(void){


int ch;
int a;
ch = choix(a);
}
