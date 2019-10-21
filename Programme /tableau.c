#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<time.h>

int main(void){

int a,b,c,t,d,e,f;
int i,o,p,z,y;



int tab[10] ={z};


srand(time(NULL));


printf("---------------------------------------------------------------------------------");
printf("\n");
for(o = 0;o < 10; o++){
	int r = rand()%51;
		if(r < 25){
			int rr = rand()%2;
				if(rr==1){
					r = -r;
				}
		}
		for(p =0; p< 1;p++){
			int tab[10]={r};

		printf(" %2d ",tab[p]);
		printf(" || ");	
		
		}	
	}

printf("\n");
printf("---------------------------------------------------------------------------------");
printf("\n");




return EXIT_SUCCESS;
}
