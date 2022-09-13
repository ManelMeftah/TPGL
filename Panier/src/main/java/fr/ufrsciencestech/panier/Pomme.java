package fr.ufrsciencestech.panier;

/**
 *
 * @author Manel
 */
public class Pomme {
    private double prix;
    private String origine;
	
    public Pomme() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Pomme(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Pomme de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 pommes sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Pomme p = (Pomme) o;
            return (prix == p.prix && origine.equals(p.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une pomme a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
    
    Pomme p1 = new Pomme();
	System.out.println("premier test Pomme ");
	System.out.println(o1.toString());
	
	Pomme p2 = new Pomme(-7, "France");
	System.out.println("Avant :  p2 = " + p2.toString() + " et p1 = " + p1.toString());
	o1.setOrigine(p2.getOrigine());
    System.out.println("p1 = " + p1.toString());

   }
}
