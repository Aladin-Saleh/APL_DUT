#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void){

int d1;
int stk1,stk2,stk3;
int rp; 			//J'ai essayé de mettre une variable contenue dans un signed char mais ça na pas marché :/
srand(time(NULL));

for(int l = 0;l < 3; l++){
for(int i = 0;i < 3; i++){
	d1 = rand()%7;
	if(d1 == 0){
		d1 = d1 + 1; 
			
	}
		if(i ==0){
			stk1 = d1;
		
		}

		if(i ==1){
			stk2 = d1;
		
		}


		if(i ==2){
			stk3 = d1;
		}
	printf(" [%d] ",d1);

}
printf("relancez  [1=oui 0=non] ?  \n ");
scanf("%d",&rp);



if(rp == 1 ){
}else{
	break;
}
}

if(stk1+stk2+stk3 == 7){
	printf("Vous avez gagné ! \n");
}else{
	printf("Vous avez perdu ! \n");
}


return EXIT_SUCCESS;
}



