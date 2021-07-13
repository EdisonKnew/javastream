import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Membres {
    private List<Personne> PersonneList;

    public Membres() {
        List<Personne> PersonneList = new ArrayList<>();
        Path path = Paths.get("personnes.txt");
        try (Stream<String> streamlist = Files.lines(path)) {
            streamlist.filter(line -> !line.startsWith("PRENOM")).map(ligne -> ligne.split(","))
                    .collect(Collectors.toList()).forEach(p -> PersonneList.add(new Personne(p[0].trim(), p[1].trim(),
                            Integer.parseInt(p[2].trim()), Double.parseDouble(p[3].trim()), p[4].trim(), p[5].trim())));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.PersonneList = PersonneList;

    }

    public void apres1991() {
        PersonneList.stream().filter(p -> p.getDateNaissance() >= 1991)
                .forEach(info -> System.out.println(info.toString()));
    }

    public void annee1995() {
        PersonneList.stream().filter(p -> p.getDateNaissance() == 1995)
                .forEach(info -> System.out.println(info.getNom()));
    }

    public void avant1990() {
        PersonneList.stream().filter(p -> p.getDateNaissance() <= 1990).sorted(Comparator.comparing(Personne::getNom))
                .forEach(info -> System.out.println(info.getNom()));
    }

    public void nomPrenomDesc() {
        PersonneList.stream().sorted(Comparator.comparing(Personne::getNom).thenComparing(Personne::getPrenom))
                .forEach(info -> System.out.println(info.getNom() + " " + info.getPrenom()));
    }

    public void genreF() {
        PersonneList.stream().filter(p -> p.getGenre() == "F" && p.getNom().substring(0, 1).equalsIgnoreCase("j"))
                .forEach(info -> System.out.println(info.toString()));
    }

    public void genreLower() {
        PersonneList.stream().collect(Collectors.toList()).forEach(info -> {
            info.setGenre(info.getGenre().toLowerCase());
            System.out.println(info.toString());
        });

    }
}