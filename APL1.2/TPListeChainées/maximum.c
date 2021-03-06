#include<stdio.h>
#include<stdlib.h>
#include<time.h>

typedef struct maximum maximum;
struct maximum
{
	
	unsigned short int valeur;
    maximum* suivant;


};


typedef struct Liste Liste;
struct Liste
{
	
	maximum *premier;
};



Liste *init()
{
	
	Liste *liste =malloc(sizeof(*liste));
	maximum *maximum=malloc(sizeof(*maximum));
	if (liste == NULL || maximum == NULL)
	{
		exit(EXIT_FAILURE);
	}

	maximum->valeur =0;
	maximum->suivant = NULL;
	liste->premier = maximum;


	return liste;

}


void insert(Liste *liste, int NvNombre)
{
	maximum *nvx = malloc(sizeof(*nvx));
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

	maximum *actuel = liste->premier;
	while(actuel != NULL)
	{

		printf("-> %d  ",actuel->valeur );
		actuel = actuel->suivant;

	}
	printf("(NULL)\n");
}




int main(int argc, char const *argv[])
{
    unsigned short int grand = 0;
	srand(time(NULL));
	int i;
	Liste *maListe = init();
	for(i =0;i<10;++i)
	{
		unsigned short int rdm = rand()%(111-999+1)+111;
		insert(maListe, rdm);
		if (rdm > grand)
		{
			grand = rdm;
		}



	}

	affiche_liste(maListe);
	printf("(PLUS GRAND : %hu )\n",grand );
	return 0;
}