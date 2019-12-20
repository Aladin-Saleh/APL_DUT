     #include<stdlib.h>
        #include<graph.h>
        #include<stdio.h>
        #include<time.h>

            #define CYCLE 10000L
            #define TIMER 1000000L
            #define SCORE 1000000L


static  int x=400;
static int y=290;
static int test =0;
static char t[50];
static char tscrs[50];
static int nscrs = 0;
static int n = 0; 
static unsigned long suivant;
static unsigned long suivanttime;
static unsigned long suivantscore;
static int i;
static int positionSerpent[50][50];
static int on = 0;
static int off = 0;
static int dplmt;
static int pommeon = 0;
static int j;
static int z;
static int onpomme = 1;
static int xp,yp;
static int xpmax = 600;
static int xpmin = 100;
static int ypmax = 480;
static int ypmin = 100;
            //J'ai creer une fonction qui creer et affiche la fenetre dans laquelle on joue //
void creationFenetre(void)
{
 couleur couleurChoisie;
 couleur couleurFond;

 CreerFenetre(0,0,800,600);
 couleurChoisie=CouleurParNom("black");
 EffacerEcran(couleurChoisie);
 couleurFond=CouleurParComposante(90,180,79);
 ChoisirCouleurDessin(couleurFond);
 RemplirRectangle(100,100,600,400);
}




void Pommes(void)
{

  couleur couleurPommes;

  for(i =0;i < 5;++i){
    for(j = 0;j < 1; j++){
      xp = (rand()%(xpmax - xpmin ));
          yp = (rand()%(ypmax - ypmin )); //Creer deux fonction, une pour l'affichage et l'autre pour generer les positions des pommes 
          if (xp < 100 )
          {
            xp = xp + 100;
          }
          if (yp < 90 )
          {
            yp = yp + 100;
          }

        }
      }
    }


    void PommesAffichage(void){
        couleur couleurPommes;

      for (z = 0; z < 1; ++z)
      {
            /*printf("coord pomme x et y : %d %d \n",xp,yp );*/
        couleurPommes=CouleurParNom("red");
        ChoisirCouleurDessin(couleurPommes);
        RemplirRectangle(xp,yp,10,10);

      }

    }


    


            //Fonction que j'enleverais à la fin, il m'aide juste a verifer que tout est bien "cadriller",il me sera utile des que je commencerais les pommes//
    void grillage(void)
    {
     couleur couleurTrait;
     int i;
     int x=100;
     int xx=700;
     int y=100;
     int yy=500;
     int colonne=x;
     int ligne=y;

     couleurTrait=CouleurParNom("black");
     ChoisirCouleurDessin(couleurTrait);

     for(i=1;i<60;i++)
     {
      colonne=colonne+10;
      DessinerSegment(colonne,y,colonne,yy);
    }

    for(i=1;i<40;i++)
    {
      ligne=ligne+10;
      DessinerSegment(x,ligne,xx,ligne);
    }

  }

            /*Fait apparaitre le temps et le score sur la fenetre*/ 

  void initialiserTempsScore()
  {
   couleur c;
   c=CouleurParNom("black");


   n++;
   sprintf(t,"time=%3d",n);
   ChoisirCouleurDessin(CouleurParNom("black"));
   RemplirRectangle(90,530,100,100);
   ChoisirCouleurDessin(CouleurParNom("white"));
   EcrireTexte(30,565,t,2);
   suivanttime=Microsecondes()+TIMER;
   printf("(%d)\n",n );



   nscrs = 0;
   sprintf(tscrs,"Score=%3d",nscrs);
   ChoisirCouleurDessin(CouleurParNom("black"));
   RemplirRectangle(700,530,100,100);
   ChoisirCouleurDessin(CouleurParNom("white"));
   EcrireTexte(550,565,tscrs,2);
   suivantscore=Microsecondes()+SCORE;




 }





 int Collision(void)
 {



  if (x == 100)
  {
   test++;
   printf("test collisions :%d\n",test );
   FermerGraphique();

 }
 else if (x == 690)
 {
   test++;
   printf("test collisions :%d\n",test );
   FermerGraphique();


 }
 else if (y == 100)
 {
   test++;
   printf("test collisions :%d\n",test );
   FermerGraphique();


 }

 else if (y == 490)
 {
  test++;
  printf("test collisions : %d\n",test );
  FermerGraphique();


}



return test;
}



int main(int argc, char const *argv[])
{

 couleur couleurChoisie;
 couleur couleurFond;
 couleur c;
 srand(time(NULL));



 InitialiserGraphique();

 creationFenetre();


 sprintf(t,"time=%3d",n);
 EffacerEcran(CouleurParNom("black"));
 EcrireTexte(30,565,t,2);




 while(1)
 {
                //Ici on c'est le code qui detecte les collisions avec les bordures //




              //ici je re-affiche le rectangle vert pour effacer les bandes rouges laisser par le serpent,c'est pas trop pratique parce que sa sacade :/ //
  couleurFond=CouleurParComposante(90,180,79);
  ChoisirCouleurDessin(couleurFond);
  RemplirRectangle(100,100,600,400);
                //Ici je crée le serpent et je "sauvegarde" ses position x et y dans un tableau appeler positionSerpent//
  if (on == 0 )
  {
    couleurChoisie=CouleurParNom("yellow");
    ChoisirCouleurDessin(couleurChoisie);

    for(i=0;i<10;i++)
    {
     y=y-10;
     RemplirRectangle(x,y,10,10);
     positionSerpent[i][0]=x;
     positionSerpent[i][1]=y;
     on=1;

   }
 }

if (onpomme = 1)
  {
    Pommes();
    onpomme = 0;


  }

  
 while(1){


  

  PommesAffichage(); 

  if (Microsecondes()>suivant){
    if (x == xp+2 )
  {
    onpomme = 1;
  }

   if (Microsecondes()>suivanttime)
   {
    initialiserTempsScore();       

  }

       Collision();//Appelle de la fonction Collision qui verfie que les coordonnees x ou y ne soit pas en bordure //
       if (ToucheEnAttente())
       {
         dplmt = Touche();
         couleurFond=CouleurParComposante(90,180,79);
         ChoisirCouleurDessin(couleurFond);
         RemplirRectangle(100,100,600,400);

         




         
       }

       if (dplmt == XK_Up)
         { y=y-1;//Remplacer 10 par entier et le faire varier en fonction des points du joueur //
          couleurChoisie=CouleurParNom("yellow");
          ChoisirCouleurDessin(couleurChoisie);
          for (int i = 0; i < 10; ++i)
          {


           RemplirRectangle(x,y,10,10);
           positionSerpent[i][0]=x;
           positionSerpent[i][1]=y;
         }
       }
       if (dplmt == XK_Down)
         { y=y+1;
          couleurChoisie=CouleurParNom("yellow");
          ChoisirCouleurDessin(couleurChoisie);



          RemplirRectangle(x,y,10,10);
          positionSerpent[i][0]=x;
          positionSerpent[i][1]=y;

        }
        if (dplmt == XK_Left)
        { 
          couleurChoisie=CouleurParNom("yellow");
          ChoisirCouleurDessin(couleurChoisie);


          x=x-1;


          RemplirRectangle(x,y,10,10);
          positionSerpent[i][0]=x;
          positionSerpent[i][1]=y;

        }
        if (dplmt == XK_Right)
         { x=x+1;
          couleurChoisie=CouleurParNom("yellow");
          ChoisirCouleurDessin(couleurChoisie);


          RemplirRectangle(x,y,10,10);
          positionSerpent[i][0]=x;
          positionSerpent[i][1]=y;

        }



               printf("x : %d\n  y : %d\n ",x,y);//Affiche les positions x et y du serpent //
               suivant= Microsecondes()+CYCLE;
             }
             

           }


            //Permet de fermer la fenetre de jeu avec la touche Echap //
           if (Touche() == XK_Escape)
           {
            break;
          }




        }


            //Je fais appelle à la fonction initialiserTempsScore,mais j'hesite à la remplacer par un sprintf :/ //

            //Des que je quitte la boucle qui "maintient" la fenetre de jeu alors je ferme la fenetre //
        FermerGraphique();
        return 0;
      }
