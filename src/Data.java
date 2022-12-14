
public class Data {
    private static final String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIKLMNOPQRSTUVWXYZ0123456789_";

    public Data() {
    }

    private static boolean checkAllowedCharacters(String n) {
        if (n.length() > 20) {
            return true;
        }
        for (int i = 0; i < n.length(); i++) {
            if (!ALLOWED_CHARACTERS.contains(String.valueOf(n.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    private static void checkCorrectData(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {
        if (checkAllowedCharacters(login)) {
            throw new WrongLoginException("Неправильно указан логин");
        }
        if (checkAllowedCharacters(password)) {
            throw new WrongLoginException("Неправильно указан пароль");
        }
        if(!password.equals(confirmPassword)) {
            throw new WrongLoginException("Указанные пароли не совпадают");
        }
    }

    public static boolean checkData(String login, String password, String confirmPassword) {
        try {
            checkCorrectData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
