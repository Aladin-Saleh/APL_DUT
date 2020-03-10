#include<stdlib.h>
#include<stdio.h>



int main(void){

int a,b,c,d;
int i,o,p;

c = 0;

for(i =0; i<5;i++){

	
printf("Tapé le nombre de visiteur par jour : \n ");
scanf("%d",&a);
c=c+a;

}
printf("Pour l'instant votre moyenne est de : %d \n",c/5);


return EXIT_SUCCESS;
}
