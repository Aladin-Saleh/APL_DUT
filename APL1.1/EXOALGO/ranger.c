#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define INDICE 16

int main(int argc, char const *argv[])
{
	int tab[INDICE];
	srand(time(0));
	int valeur;
	int n = 16;

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

/*On cherche à ranger le tableau dans l'ordre */

int i =0; 
int indice = 0;
while(i < n){

	while(i < n){
		if (tab[i] > tab[indice] && i < n)
		{
			indice = i;
			i = i + 1;
		}


		tab[indice] = tab[n];
		tab[n] = tab[indice];

		n = n - 1;
		i =0;
		indice = 0;
	}


}


printf("+------+------+------+------+------+------+------+------+------+------+------+------+------+------+------+------+\n");
	for (int i = 0; i < INDICE; ++i)
	{
		printf("|%6d",tab[i] );
	}

printf("\n+------+------+------+------+------+------+------+------+------+------+------+------+------+------+------+------+\n");





	printf("\n");
	return 0;
}