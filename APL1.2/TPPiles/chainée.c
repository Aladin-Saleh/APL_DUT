#include<stdio.h>
#include<stdlib.h>



typedef struct caractere caractere;
struct caractere
{
	char carac;
	caractere *suivant;

	
};

typedef struct Pile Pile;
struct Pile
{
	caractere *premier;
};

Pile *initialiser()
{
    Pile *pile = malloc(sizeof(*pile));
    pile->premier = NULL;
}



void Empile(Pile *pile,char nv_carac)
{
	caractere *nouveau = malloc(sizeof(*nouveau));
	if(pile == NULL || nouveau == NULL)
	{
		exit(EXIT_FAILURE);


	}

	nouveau->carac = nv_carac;
	nouveau->suivant = pile->premier;
	pile->premier = nouveau;
}

char Depile(Pile *pile)
{

	if (pile == NULL)
	{	printf("La pile est vide :/ .\n");
		exit(EXIT_FAILURE);
	}

	char caracDepile;
	caractere *caractereDepile = pile->premier;

if (pile != NULL && pile->premier != NULL)
{
	caracDepile = caractereDepile->carac;
	pile->premier = caractereDepile->suivant;
	free(caractereDepile);
	
}

return caracDepile;


}



void afficherPile(Pile *pile)
{
	if (pile == NULL)
	{
		exit(EXIT_FAILURE);
	}
caractere *actuel = pile->premier;


while(actuel != NULL)
{

	printf("%s\n",actuel->carac );
	actuel = actuel->suivant;

}

printf("\n");

}





int main()
{

	Pile *maPile = initialiser();


	Empile(maPile,'a');
	Empile(maPile,'b');


	printf("\n Etat de la pile \n");
	afficherPile(maPile);

	printf("Je depile %s\n", Depile(maPile));
	afficherPile(maPile);


	return 0;
}