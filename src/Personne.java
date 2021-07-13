public class Personne {
    private String nom, prenom, genre, ville;
    private int dateNaissance;
    private Double salaire;

    public Personne(String prenom, String nom, int annee_naissance, Double salaire, String genre, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.ville = ville;
        this.dateNaissance = annee_naissance;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Persone{" + "nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", genre='" + genre + '\''
                + ", ville='" + ville + '\'' + ", dateNaissance=" + dateNaissance + ", salaire=" + salaire + '}';
    }
}