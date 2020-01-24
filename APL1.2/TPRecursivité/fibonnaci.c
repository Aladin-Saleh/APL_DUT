#include<stdio.h>
#include<stdlib.h>


unsigned int fib(unsigned int n){
	if (n < 2)
		return n;
	else
		return fib(n-1) + fib(n-2);
}



void affiche(unsigned int m)
{


	m--;
	if(m != 0){
		printf(": %d\n", fib(m));
		affiche(m);
	}
}
int main(unsigned int argc, char const *argv[])
{
	unsigned int m, n;



	scanf("%d",&m);

	affiche(m);

	return 0;
}