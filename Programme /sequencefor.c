#include<stdlib.h>
#include<stdio.h>


int main (){

int a,b;

printf("Taper un entier a :\n");
scanf("%d",&a);

printf("Taper un entier b : \n");
scanf("%d",&b );


if (a < b){
for(a=a; a < b; a++){
	printf("%d \n",a);
}
} else {
for(b = b; b < a ; b++){
printf("%d \n",b);
}

}



return EXIT_SUCCESS;
}
