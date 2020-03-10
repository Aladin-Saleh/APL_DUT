#include<stdio.h>
#include<stdlib.h>




int main(void) {
	  long long int n = 4614256656552045848LL;
	    double* p = (double*) &n;


	    printf("π = %f\n", *(p)*2);

	    return EXIT_SUCCESS;
}
