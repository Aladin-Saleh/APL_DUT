#include<stdio.h>
#include<stdlib.h>
#include<time.h>


/*A finir a la maison*/

typedef maximum maximum;
struct maximum
{
	unsigned short int entier;
	struct maximum *suivant;


	
};



int Genere_entier()
{
	int entierg;

	for (int i = 0; i < 10; ++i)
	{
		suivant = (struct maximum*)malloc(sizeof(maillon));
		entierg = rand()%999-111;
		entier = entierg;

	}




return entier;	

}


void Afficher()
{







}




int main(int argc, char const *argv[])
{
	srand(time(NULL));
	int entierg;
	int entier;
	                                                                                                                                         

	Genere_entier();

	
	return 0;
}