#include<stdlib.h>
#include<stdio.h>
#include<time.h>



int main(void){





int nbreh = 0;
int nbred = 0;
int i = 0; 

srand(time(NULL));
nbreh = (rand()%100);

printf("%d\n", nbreh);

while(i < 5 ){
i = i + 1;


printf("Tapé une valeur pour trouver le nombre générer au hasard par la machine : \n");
scanf("%d",&nbred);

if(nbreh < nbred){
printf("C'est moins\n");

}

if(nbreh > nbred){
printf("C'est plus\n");
}

if(nbreh == nbred){

i = 5;
printf("Bravo ! \n");
}

}


return EXIT_SUCCESS;
}
