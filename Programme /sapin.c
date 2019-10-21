#include<stdlib.h>
#include<stdio.h>


int main(void){

int i,o,p;
int a;



printf("De quelle taille doit etre votre sapin : \n");
scanf("%d",&a);



for(i =0; i < a;i++){
	for(o = (a-i)-1; o > 0 ;o--){
	printf(" ");
	}
	for(p = (i * 2)+1;p > 0 ; p--){
	printf("*");
	
	} 


printf("\n");


}
			







return EXIT_SUCCESS;
}
