public class Main {
    public static void main(String[] args) {
        boolean condition = Data.checkData("Wv56h_aal","1993_qwer","1993_qwer");
        if(condition) {
            System.out.println("Введенные данные логина и пароля корректны");
        } else {
            System.out.println("Введенные данные логина и пароля некорректны");
        }
    }
}