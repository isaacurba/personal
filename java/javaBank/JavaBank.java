public class JavaBank {
   
    public static boolean emailValidator(String email){
        if (email == null)return false;
        if (email.length() < 8) return false;
        if (!email.contains("@")) return false;
        if (email.startsWith("@") && email.endsWith("@")) return false;

    
        return true;
    }
}
