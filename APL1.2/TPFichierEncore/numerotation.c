#include<stdio.h>
#include<stdlib.h>


int main(int argc, char const *argv[])
{
	FILE* fichier = NULL;
	fichier = fopen(argv[1],"r");
	char lecture[600];
	int n = 0;


	if (fichier != NULL)
	{
		printf("Ouverture réussie\n");
		while(fgets(lecture,600,fichier) != NULL){
			n++;
			printf(" %d )%s\n",n,lecture );
		}
		

	}else{

		perror("Y'a un probleme \n");
		
	}

	return 0;
}