#include<stdio.h>
#include<stdlib.h>
#include<graph.h>


int main(int argc, char const *argv[])
{
	FILE* flux = NULL;
	flux = fopen("image.bin","r");
	int largeur,hauteur;
	couleur pixel;
	long decalage;

	if (flux == NULL)
	{
		perror("Y a une erreur ");
		exit(1);
	} else{



		printf("Lecture de votre fichier est possible :) \n");
		fread(&largeur,sizeof(int),1,flux);
		fread(&hauteur,sizeof(int),1,flux);
				decalage = sizeof(pixel)*((largeur/2)*hauteur)+(sizeof(pixel)*(hauteur/2));

		
		InitialiserGraphique();
		CreerFenetre(0,0,largeur/2,hauteur/2);

		fseek(flux,decalage,SEEK_CUR);
		for (int i = 0; i < largeur/2; ++i)
		{
			for (int j = 0; j < hauteur/2; ++j)
			{
				
				fread(&pixel,sizeof(pixel),1,flux);
				ChoisirCouleurDessin(pixel);
				DessinerPixel(i,j);


			}
			fseek(flux,(hauteur/2)*sizeof(pixel),SEEK_CUR);
		}


		fclose(flux);
	}

Touche();
FermerGraphique();



	return 0;
}