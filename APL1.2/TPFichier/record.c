#include<stdio.h>
#include<stdlib.h>


int main(int argc, char const *argv[])
{
	FILE* flux;
	flux = fopen("top10","r");

	int score = 0;
	char buffer[3];

	if (flux == NULL)
	{
		perror("Y a po le fichier !\n");
		exit(1);
	}else{
		printf("Lecture réussi ! \n");

		for (int i = 0; i < 10; ++i)
		{
			fread(&score,sizeof(int), 1,flux);
			fread(&buffer,sizeof(char),3,flux);
			printf("%d %s \n",score,buffer );
			score = 0;
		}

	}

	fclose(flux);



	return 0;
}