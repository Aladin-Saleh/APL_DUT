#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main(int argc, char const *argv[])
{
	
	
	FILE* programme;
	programme = fopen("fichier","r");
	int execution = 0;


	if ( programme != NULL)
		{	fread(&execution,sizeof(int),1,programme);
			execution++;
			printf("%d\n",execution );
			fclose(programme);
			programme =fopen("fichier","w");
			fwrite(&execution,sizeof(int),1,programme);
			fclose(programme);

		}
		else
		{
			programme = fopen("fichier1","w");

			printf("ERREUR ! \n");
			fclose(programme);
		}




		return 0;
	}