#include<stdlib.h>
#include<stdio.h>



int main(void){



int jourj;
int moisj;
int anneej;


int journ;
int mois;
int annee;

printf("Quelle jour somme nous ( au format JJ/MM/AAAA ):\n");
scanf("%d/%d/%d", &jourj,&moisj,&anneej);
printf("Nous sommes le %d/%d/%d\n",jourj,moisj,anneej);

printf("Quelle est votre date de naissance ( au format JJ/MM/AAAA ):\n");
scanf("%d/%d/%d",&journ ,&mois, &annee);
printf("Vous etes née : %d/%d/%d\n",journ, mois, annee );


if(mois==9 || mois==10 || mois==11 || mois==12){

printf("vous avez donc : %d ans \n", ((anneej + 2000) - (annee + 2000 ) - 1);

} else {

printf("Vous avez donc : %d ans  \n",((anneej + 2000) -( annee + 2000));




}





return EXIT_SUCCESS;

}
