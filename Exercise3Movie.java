package Homework3;

public class Exercise3Movie {
    //Создаю поля для класса Movie

    String year;

    String nameFilm;

    double ratingFilm;

    String genre;

    String location;

    boolean oscarPresence;
    //сам сгенерил конструктор)))) спасибо за подсказку)))
    public Exercise3Movie(String year,String nameFilm, double ratingFilm, String genre, String location, boolean oscarPresence) {
        this.year = year;
        this.nameFilm = nameFilm;
        this.ratingFilm = ratingFilm;
        this.genre = genre;
        this.location = location;
        this.oscarPresence = oscarPresence;

    }
    //подготовливаю данные для вывода
    public void infoOfFilms() {
        System.out.println(year + " - " + nameFilm + " - " + genre + " - " + ratingFilm);
    }
}
