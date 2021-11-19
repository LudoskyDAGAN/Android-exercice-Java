public class ManutARisque {class ManutARisque extends Manutentionnaire implements ARisque{
    public ManutARisque( String prenom, String nom, int age, int heures){
        super(prenom,nom,age,date,heures);
    }
    public double calculerSalaire(){
        return super.calculerSalaire() +PRIME;
    }
}
    
}
