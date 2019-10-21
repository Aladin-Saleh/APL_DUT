#include<stdlib.h>
#include<stdio.h>
#include<time.h>


int main(void){

int a,b,c,i;
int MAX = 0;
printf("\n");


srand(time(NULL));

for(c = 0; c <10; c++){
for(i = 0; i < 1; i++){
	a = rand()%50;
	
for(b = 0; b < 1; b++){	
	int tab[10] = {a};
	printf(" %d  ",tab[b]);
	printf("||");

	for(int l = 0; l < 10; l++){
		int MAX;
		
		
		if(tab[b] > MAX){
			
			printf("Le plus grand est :%d  ",tab[b]);
		MAX = tab[b];
		}
		
	
	}
}


}
}

printf("\n");








return EXIT_SUCCESS;
}
