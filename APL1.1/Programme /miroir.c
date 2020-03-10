    #include <stdio.h>
    #include <time.h>
    #include <stdlib.h>

    int main(void) {
    	srand(time(0));

    	printf("Avant inversion : ");

    	int tab[10];
    	for (int i = 0; i < 10; i++) {
    		tab[i] = rand()%100-50;
    	}
    	printf("+----+----+----+----+----+----+----+----+----+----+\n|");
    	for (int i = 0; i < 10; i++) {
    		printf("%4d|", tab[i]);
    	}
    	printf("\n+----+----+----+----+----+----+----+----+----+----+");

    	printf("Apres inversion : ");

    	int tmp;
    	for(int i = 0; i < 5; i++) {
    		tmp = tab[i];
    		tab[i] = tab[9-i];
    		tab[9-i] = tmp;
    	}


    	printf("+----+----+----+----+----+----+----+----+----+----+\n|");
    	for (int i = 0; i < 10; i++) {
    		printf("%4d|", tab[i]);
    	}
    	printf("\n+----+----+----+----+----+----+----+----+----+----+");

    	return 0;
    }
