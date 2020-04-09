public class firstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println("Weight: " + notebook.weight + "   Price: " + notebook.price + "   Production year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.discountConditions();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        System.out.println("Weight: " + heavyNotebook.weight + "   Price: " + heavyNotebook.price + "   Production year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.discountConditions();

        Notebook oldNotebook = new Notebook (1200, 500, 2016);
        System.out.println("Weight: " + oldNotebook.weight + "   Price: " + oldNotebook.price + "   Production year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.discountConditions();

        Notebook fancyNotebook = new Notebook (1200, 1000, 2018);
        System.out.println("Weight: " + fancyNotebook.weight + "   Price: " + fancyNotebook.price + "   Production year: " + fancyNotebook.year);
        fancyNotebook.checkPrice();
        fancyNotebook.checkWeight();
        fancyNotebook.discountConditions();

        Notebook gamingNotebook = new Notebook (1200, 2500, 2020);
        System.out.println("Weight: " + gamingNotebook.weight + "   Price: " + gamingNotebook.price + "   Production year: " + gamingNotebook.year);
        gamingNotebook.checkPrice();
        gamingNotebook.checkWeight();
        gamingNotebook.discountConditions();

        Notebook officeNotebook = new Notebook (1200, 850, 2018);
        System.out.println("Weight: " + officeNotebook.weight + "   Price: " + officeNotebook.price + "   Production year: " + officeNotebook.year);
        officeNotebook.checkPrice();
        officeNotebook.checkWeight();
        officeNotebook.discountConditions();
    }
}