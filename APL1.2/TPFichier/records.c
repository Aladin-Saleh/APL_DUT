#include<stdio.h>
#include<stdlib.h>


int main(int argc, char const *argv[])
{

	int stck;
	char pseudo[3];
	FILE* flux = NULL;
	flux = fopen("top10","r");
	flux = fopen("top10","w");
	if ( flux != NULL)
	{
		
	}
	else
	{

		printf("ERREUR ! \n");
		fclose(flux);
	}

	for (int i = 0; i < 10; ++i)
	{
		fread(&stck,sizeof(int),1,flux);
		fread(&pseudo,sizeof(char),3,flux);
		
		printf("%.9d %s\n",stck,pseudo );
	}


fclose(flux);

	return 0;
}