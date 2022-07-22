package model;

public class Personne {
	private String prenom;
	private int age;
	private String nom;

	public Personne(String prenom, int age, String nom) {
		super();
		this.prenom = prenom;
		this.age = age;
		this.nom = nom;
	}


	public Personne(String prenom, int age) {
		super();
		this.prenom = prenom;
		this.age = age ;
	}
	

	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setNom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return prenom;
	}

}
