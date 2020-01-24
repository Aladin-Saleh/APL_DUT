#include<stdlib.h>
#include<stdio.h>
#include<time.h>




double sal(int x,int b){
	double salaire;

	if (x >= 0 && x <= 34)
	{
		salaire = b + (b/34)*x;
	}

	if (x > 34 && x <= 42 )
	{
		salaire = 2 *b;
	}

return salaire;

}

void tableau(int slrBase)
{
	double tab[42];
	int i;


	for (i = 0; i < 42; ++i)
	{
		tab[i] = sal(i,slrBase);
		printf("%.3lf\n",tab[i] );
	}

}



double sal_moy(double *t,int taille) 
{
	srand(time(NULL));
	int i;
	double salMyn,a,b;
	t = malloc(taille*sizeof(double));

	double SalaireRdm;

	SalaireRdm = rand()%(1450-3600+1)+1450;


	
	



	a = 0;
	b = 0;

	for (i = 0; i < taille; ++i)
	{
		t[i] =sal(i,SalaireRdm);  	
	}

	for (i = 0; i < taille; ++i)
	{
		a = t[i];
		b = a + b;
		salMyn = b;
		
	}

	salMyn = salMyn /taille;

printf("Salaire de base : %.3lf\n",SalaireRdm );
printf("Salaire moyen sur la carriere :%.3lf\n",salMyn );



return salMyn;


}

double sal_moy2


int main(int argc, char const *argv[])
{

	
	/*printf("%.3lf\n",sal(10,1800));
	tableau(1550);*/  						/*Affichage afin de verifier mes résultats*/
	
	double *tab = NULL;


	sal_moy(tab,43);
	




	return 0;
}