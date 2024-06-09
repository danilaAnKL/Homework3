package Homework3;

public class Exercise3Films {
    public static void main(String[] args) {
        //создаю массив films

        Exercise3Movie [] films = new Exercise3Movie [3];

        //вношу фильмы в массив
        films[0] = new Exercise3Movie("2022", "Три тысячи лет желаний", 7.2, "Фэнтези","Австралия", false);
        films[1] = new Exercise3Movie("2023", "Мастер и маргарита", 7.8,"драма","Россия",false);
        films[2] = new Exercise3Movie("2001", "Властелин колец:Братство кольца", 8.6,"фэнтези", "Новая Зеландия",true);

        //использую цикл for для вывода информации

        for (Exercise3Movie film : films){
            film.infoOfFilms();
        }

        //ВОПРОС ДЛЯ КОНСУЛЬТАЦИИ!!!!
        //так как в классе movie, у меня присутствуют разные типы данных,c помощью гугла я узнал, что есть тип массива Object,
        // который может содержать в себе разные типы данных сначала вместо  Exercise3Movie [] films = new Exercise3Movie [3]; был Object[] films = new Object[3];
        //но при составлении цикла у меня вылетала ошибка ошибка java: incompatible types: java.lang.Object cannot be converted to Homework3.Exercise3Movie
        //покопался и понял, что я хочу в object поместить данные из класса Exercise3Movie. После исправлений код заработал, но немного непонятно почему не поддерживает object мой класс



    }
}
