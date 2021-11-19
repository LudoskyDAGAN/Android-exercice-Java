public abstract class AbstractclassCommercial {  abstract class Commercial extends Employe{
    private double chiffreAffaire;

    Public Commercial (String prenom, String nom,int age, String date, double chiffreAffaire){

     super(prenom,nom,age,date);
     this.chiffreAffaire= chiffreAffaire;

    }
    public double getChiffreAffaire()
    {
        return chiffreAffaire;
    }

}
    
}
