#include<stdio.h>
#include<stdlib.h>



typedef struct entier entier;  /* Lors de l'affichage il se peut que le programme affiche un 0 en trop, c'est un problème que je n'ai pas réussi à fixer*/
struct entier
{
	
	int valeur;
    entier* suivant;


};


typedef struct Liste Liste;
struct Liste
{
	
	entier *premier;
};



Liste *init()
{
	
	Liste *liste =malloc(sizeof(*liste));
	entier *entier=malloc(sizeof(*entier));
	if (liste == NULL || entier == NULL)
	{
		exit(EXIT_FAILURE);
	}

	entier->valeur =0;
	entier->suivant = NULL;
	liste->premier = entier;


	return liste;

}


void insert(Liste *liste, int NvNombre)
{
	entier *nvx = malloc(sizeof(*nvx));
	if (liste == NULL || nvx == NULL)
	{
		exit(EXIT_FAILURE);
	}

	nvx->valeur = NvNombre;

	nvx->suivant = liste->premier;
	liste->premier = nvx;


}
void affiche_liste(Liste *liste)
{

	if (liste == NULL)
	{
		exit(EXIT_FAILURE);
	}

	entier *actuel = liste->premier;
	while(actuel != NULL)
	{

		printf(" %d,",actuel->valeur );
		actuel = actuel->suivant;

	}
	
}



int main(int argc, char const *argv[])
{
	int entrer;
	int i;

	Liste *maListe = init();

	for (i = 0; i < 5; ++i)
	{
		printf("Entier n°%d : ",i+1 );
		scanf("%d",&entrer);
		insert(maListe,entrer);
	}




	affiche_liste(maListe);
	printf("\n");
	return 0;
}