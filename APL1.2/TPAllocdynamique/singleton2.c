#include<stdio.h>
#include<stdlib.h>


int main(int argc, char *argv[])

{

    int nbrReel = 0, i = 0, test = 0;

    int* reel = NULL; 

    printf("Combien de reel voulez-vous :  ? ");

    scanf("%d", &nbrReel);


    if (nbrReel > 0) 

    {

        reel = malloc(nbrReel * sizeof(int)); 

        if (reel == NULL) 

        {

            exit(0);

        }


        

        for (i = 0 ; i < nbrReel ; i++)

        {

            printf("Quel est le reel N° %d ? ", i + 1);

            scanf("%d", &reel[i]);

        }

        for (int i = 0; i < nbrReel; ++i)
        {
            for(int j = 0;j < nbrReel;j++){

                if (i != j)
                {



                  if (reel[j] == reel[i] )
                  {
                     test = 1;
                 }
             }


         }
         if (test == 0 )
         {
          printf("Voici votre reel N° %d qui vaut : %d \n",i + 1, reel[i] );
      }

      test = 0; 

  }

}


return 0;
}