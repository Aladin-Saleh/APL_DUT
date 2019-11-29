#include<stdio.h>
#include<stdlib.h>

typedef struct 
{
	char a;
	char b;
	char c;
	
}tailles;

typedef struct 
{
	char x;
	int y;
	char z;
}tailles2;

typedef struct 
{
	int d;
	char f;
	char g;


}tailles3;



	
int main(int argc, char const *argv[])
{

	tailles a;
	tailles2 b;
	tailles3 c;


	printf("%zu octets \n",sizeof(a) );
	printf("%zu octets \n",sizeof(b) );
	printf("%zu octets \n",sizeof(c) );
	return 0;
}