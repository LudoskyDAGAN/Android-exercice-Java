public class Personnel { Class personnel{
    private Employe[] staff;
    private int nbreEmploye;
    private final static int MAXEMPLOYE =200;

    public personnel(){
        staff=new Employe[MAXEMPLOYE];
        nbreEmploye= 0;
    }
    public void ajouterEmploye(Employe e) {
        ++nbreEmploye;
       }
       if(nbreEmploye<=MAXEMPLOYE){
           staff[nbreEmploye -1]= e;

       }else{
           system.out.println("Pas plus de" + MAXEMPLOYE +"employés");
       }
}
        public double salaireMoyen(){
            double somme =0.0;
             for(int i = 0; i< nbreEmploye; i++){
                  somme += staff[i].calculerSalaire();
             }
              return somme/ nbreEmploye;
        }
        public void afficherSalaire(){
            for(int i=0; i< nbreEmploye; i++){
                System.out.println(staff[i].getNom() +"gagne" + staff[i].calculersalaire()+ "francs.");
            }
        }
        
   }
    
}
