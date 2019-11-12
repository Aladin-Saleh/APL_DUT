#include <stdio.h>
#include <time.h>
#include <stdlib.h>

void randome(int tab[]) {
int i;
for (i = 0; i < 10; i++) {
	tab[i] = rand()%100-50;
	}
}

void affichage(int tab[]) {
int i;
printf("+---+---+---+---+---+---+---+---+---+---+\n|");
for (i = 0; i < 10; i++) {
	printf("%3d|", tab[i]);
								
}
					
printf("\n+---+---+---+---+---+---+---+---+---+---+");
printf("\n");

}

void inversion(int tab[]) {
		
int tmp, i;
for(i = 0; i < 5; i++) {
						
tmp = tab[i];
tab[i] = tab[9-i];
tab[9-i] = tmp;
								

}
}



int main(void) {
int tab[10];
srand(time(0));
			


randome(tab);

printf("TABLEAU NORMALE : \n");
affichage(tab);

							
printf("TABLEAU MIROIR : \n");

								
inversion(tab);

									
affichage(tab);

										
return 0;
}
