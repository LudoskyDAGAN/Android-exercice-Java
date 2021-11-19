public abstract class Abstract {
    abstract class Employe{
        private String nom;
        private string prenom;
        private int age;
        private string date;
          
           public Employe(String prenom,String nom,int age,string date){
                this.nom=nom;
                this.prenom=prenom;
                this.age=age;
                this.date=date;
           }
             public abstract double calculersalaire();
             public string getTitre()
             {
                 return "L'employé";
      
             }
             public String getNom() {
                   return getTitre() +prenom + "" +nom;
             }
      }
    
}
