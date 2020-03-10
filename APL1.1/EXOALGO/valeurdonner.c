#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define INDICE 16

int main(int argc, char const *argv[])
{
	int tab[INDICE];
	srand(time(0));
	int valeur;


	for (int i = 0; i < INDICE; ++i)
	{
		tab[i] = rand()%100-50;

	}
printf("+------+------+------+------+------+------+------+------+------+------+------+------+------+------+------+------+\n");
	for (int i = 0; i < INDICE; ++i)
	{
		printf("|%6d",tab[i] );
	}

printf("\n+------+------+------+------+------+------+------+------+------+------+------+------+------+------+------+------+\n");

/*On cherche une valeur donner par l'utilisateur */
printf("Entrez une valeur que vous chercher : \n");
scanf("%d",&valeur);

int i =0;
int trouver = 0;
while(i < INDICE)
{
	if (tab[i] == valeur)
	{
		trouver = 1;
		break;
	}else{
		i = i +1;
		trouver = 0;
	}
}

if (trouver == 1 )
{
	printf("Nous avons trouver votre valeur , elle se trouve à la %d eme case\n",i+1 );
}
if (trouver == 0)
{
	printf("Nous n'avons rien trouver :/ \n");
}

	printf("\n");
	return 0;
}