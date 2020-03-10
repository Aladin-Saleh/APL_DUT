#include<stdlib.h>
#include<stdio.h>


int main(void){

float prod =5.49;
int a,b,c;


printf("Combien le client a donné(e) ? :\n");
scanf("%f",&a);



for(float i = 0;i<a;i=i+2){
printf("%f\n",i);
break;

}



return EXIT_SUCCESS;
}
