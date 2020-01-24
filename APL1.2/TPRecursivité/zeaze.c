#include <stdio.h>
#include <stdlib.h>

unsigned fibonacci(unsigned m, unsigned u0, unsigned u1) {
  if(m >= 1)
    fibonacci(m-1, u1, u0 + u1);
  else
    return u1;
}

void affibonacci(unsigned m){
  if(m!=0){
    m--;
    int x=fibonacci(m,1,0);
    printf("* %d\n",x);
    affibonacci(m);
  }
}

int main(void) {
  int m=0;
  int res=0;
  printf("Terme a calculer: ");
  scanf("%d", &m);
  res = fibonacci(m,1,0);
  printf("Le %dème terme de la suite de fibonacci est : %d\n ", m, res);
  printf("\n-> Jusuq'au 15eme terme\n");
  affibonacci(m);
  return 0;
}