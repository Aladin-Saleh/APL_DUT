#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void){
	int jour,mois,annee;
	time_t now;

	time(&now);
	struct tm *local = localtime(&now);
	jour = local->tm_mday;          
	mois = local->tm_mon + 1;     
	annee = local->tm_year + 1900;



	printf("Date : %d / %d / %d\n",jour,mois,annee);
	return 0;
}