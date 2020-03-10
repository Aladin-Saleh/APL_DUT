#include<stdio.h>
#include<stdlib.h>
#define NB_COLONNE 4
#define NB_LIGNE 1



int main(void){

int t1[NB_LIGNE][NB_COLONNE];
int l;
for(int i = 0,l = 0  ; i < 5, l < 2;i++, l++){

	t1[l][i] = l+1 && i +1;
	printf("%d ",t1[l][i]);	

}



printf("\n");

printf("%d",t1[1][3]);

return EXIT_SUCCESS;
}
