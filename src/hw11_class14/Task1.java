package hw11_class14;

public class Task1 {

    void helloSelectedLang(String country) {
        switch (country) {
            case "Belarus":
                System.out.println("Добры дзень");
                ;
                break;
            case "Mexico":
                System.out.println("Hola");
                break;
            case "Ukraine":
                System.out.println("Привіт");
                break;
            case "Germany":
                System.out.println("Hallo");
                break;
            case "Italy":
                System.out.println("Ciao");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Unavailable country");
                break;
        }
    }

    public static void main(String[] args) {

        Task1 obj = new Task1();

        obj.helloSelectedLang("Belarus");
    }
}
