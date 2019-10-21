#include<stdio.h>
#include<stdlib.h>

int main(void){


int a,b,c,d;
int i,o,p;


printf("\n1)TRIANGLE\n2)CARRE\nQ)QUITTER\n");
scanf("%d",&a);




if(a == 1 ){
	printf("Taille de votre triangle : \n");
	scanf("%d",&b);

for(i=0;i < b+1;i++){
	printf(" ");
	for(o =0;o< i;o++){
	printf("*");
	}
printf("\n");


}



}


if(a == 2){
	printf("Quelle sera la taille de votre carré ? : \n");
	scanf("%d",&b);

for(p = 0;p<b;p++){
	for(d = 0;d<b;d++){
	printf("*");
	}

	printf("\n");
}


}

if(a != 1 || a != 2){

printf("Au revoir...\n");

}

return EXIT_SUCCESS;
}
