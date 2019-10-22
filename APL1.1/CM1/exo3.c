#include<stdio.h>
#include<stdlib.h>
#include<time.h>


int main(void){

int rdm;
int tab[19];

srand(time(NULL));

for(int i = 0; i < 20;i++){
	rdm = rand()%21;
		if(rdm < 10){
			int rdm2 = rand()%2;
				if(rdm2 == 1){
					rdm = -rdm;
				}
	
		}
		
for(int p = 0;p < 1;p++){
	int tab[19]={rdm};
	if(rdm < 0){
	printf("_ ");
	}else{
	printf("%d ",tab[p]);
	}
}
}
printf("\n");



return EXIT_SUCCESS;
}
