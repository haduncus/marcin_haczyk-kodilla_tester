public class FirstClass {
    public static void main(String[] args) {

        // Zadanie "Rozbudowa kodu"

        printNotebookData(1, 600, 1000, 2015);
        printNotebookData(2, 2000, 1500, 2019);
        printNotebookData(3, 1200, 500, 2016);
        printNotebookData(4, 1200, 1000, 2018);
        printNotebookData(5, 1200, 2500, 2020);
        printNotebookData(6, 1200, 850, 2018);

        // Zadanie "Rok przestępny"

        LeapYear firstTest = new LeapYear(1581); //dopisać warunek brzegowy dolny
        System.out.print(firstTest.yearNo + ": ");
        if (firstTest.yearNo >= 1582) {
            if (firstTest.leapCheck) {
                System.out.println("This is a leap year");
            } else {
                System.out.println("This is not a leap year");
            }
        }else{
            System.out.println("Date lower than 1582 is prohibited");
        }

        // Zadanie: ćwiczymy pętle (2.)

        RandomNumbers randomNumber = new RandomNumbers();
        int result = randomNumber.countRandomNumbers();
        System.out.println();
        System.out.println(result);

    }

    private static void printNotebookData(int i, int i2, int i3, int i4) {
        Notebook notebook = new Notebook(i, i2, i3, i4);
        System.out.println("Weight: " + notebook.weight + "   Price: " + notebook.price + "   Production year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.discountConditions();
        int notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);
    }
}