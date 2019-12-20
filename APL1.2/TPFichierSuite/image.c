#include<stdio.h>
#include<stdlib.h>
#include<graph.h>


int main(int argc, char const *argv[])
{
	FILE* flux = NULL;
	flux = fopen("image.bin","r");
	int largeur,hauteur;

	if (flux == NULL)
	{
		perror("Y a une erreur ");
		exit(1);
	} else(){


		printf("Lecture de votre fichier est possible :) \n");
		fread(&hauteur,sizeof(int),1,flux);
		fread(&largeur,sizeof(int),1,flux);
		InitialiserGraphique();
		CreerFenetre(0,0,largeur,hauteur);

	}

	




	return 0;
}