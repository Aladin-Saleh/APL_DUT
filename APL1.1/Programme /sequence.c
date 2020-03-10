#include<stdlib.h>
#include<stdio.h>


int main(void){

int a;
int b;

printf("Taper un entier a \n");
scanf("%d",&a);

printf("Taper un entier b \n");
scanf("%d",&b);

if(a < b){
while(a < b ){
	printf("%d \n",a++);


}
} else {
while(b < a ){
	printf("%d \n",b++);
}

}




return EXIT_SUCCESS;
}
