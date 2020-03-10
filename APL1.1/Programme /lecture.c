#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(void){
int b = 1;
int c;
char mdp[26] = "azerty123";

printf("Entrez votre mot de passe : \n");

int i =0;
while((c = getchar()) != '\n' ){

	if(c == mdp[i]){
		i=i+1;
		
	}else{
		b = 0;
		break;
		

}
	
}

if(b == 0 ){
printf("Mot de passe incorrect \n");
}
else if((b == 1) && (i == strlen(mdp))){
printf("Mot de passe réussie \n");

}

return 0;
}
