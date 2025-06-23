package mvc.regex;

public class CheckRegexStudent {
    public static boolean checkClasName(String className){
        String regexClasName = "^C((0[1-9])|(1[0-2]))\\d{2}[GL][1-9]-JV10[13]$";
        return  className.matches(regexClasName);
    }
}
