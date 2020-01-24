#include<stdio.h>
#include<stdlib.h>
#include<graph.h>


void DessinerTriangle(int m,int l)
{
		DessinerSegment(0,600,700,600);
		DessinerSegment(0,600,350/m,0+l);
		DessinerSegment(700/m,600,350,0);
}


void triangle(int n){

	if (n < 0 )
	{
		exit(0);
	}

	if (n == 0)
	{

		DessinerTriangle(1,0);
	}
	else{
		DessinerTriangle(2,300);
		n =n - 1;
		triangle(n);


	}



}



int main(int argc, char const *argv[])
{






	InitialiserGraphique();
	CreerFenetre(0,0,700,600);

	while(1)
	{
		triangle(2);

	}


	FermerGraphique();
	
	return 0;
}