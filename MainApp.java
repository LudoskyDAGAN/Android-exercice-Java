class Salaires {
    public static void main (string[] args) {
        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Larx","Travail",45,"1995", 30000));
        p.ajouterEmploye(new Representant("Pierre","VendTout",25,"2001", 20000));
        p.ajouterEmploye(new Technicien("Yves","Bosseur",28,"1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne","StockeTout",32,"1998", 2000));
        p.ajouterEmploye(new TechnARisque("Jean","Flippe",28,"2000", 1000));
        p.ajouterEmploye(new ManutArisque("Al","Abordage",30,"2001", 45));

        p.afficherSalaires();

        System.out.println("Le salaire moyen dans l'entreprise est de " +p.salaireMoyen() + "francs.");
      
        
        
    }
}