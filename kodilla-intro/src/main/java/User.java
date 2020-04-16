// Utwórz klasę User, zawierającą imię oraz wiek użytkownika. W metodzie main utwórz tablicę obiektów typu User
// i wypełnij ją dowolnymi obiektami. W pętli for wyświetl imiona użytkowników, których wiek jest poniżej średniej wieku.

public class User {

    String userName;
    int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public static void main(String[] args) {

        // Users data
        User maciek = new User("Maciek", 35);
        User kasia = new User("Kasia", 18);
        User ania = new User("Ania", 26);
        User ola = new User("Ola", 30);
        User piotrek = new User("Piotrek", 19);
        User grzesiek = new User("Grzesiek", 50);
        User asia = new User("Asia", 49);
        User bartek = new User("Bartek", 38);

        // Users data array
        User[] userData = new User[]{maciek, kasia, ania, ola, piotrek, grzesiek, asia, bartek};

        // Average users age
        double userAgeTemp = 0;
        for (int i = 0; i < userData.length; i++) {
            userAgeTemp += userData[i].userAge;
        }
        System.out.print(userAgeTemp + " / " + userData.length + " = ");
        double averageUserAge = userAgeTemp / userData.length;
        System.out.println(averageUserAge);

        // Users aged lower than average

        for (int i = 0; i < userData.length; i++) {
            if(userData[i].userAge <= averageUserAge) {
                System.out.println(userData[i].userName);
            }
        }
    }
}
