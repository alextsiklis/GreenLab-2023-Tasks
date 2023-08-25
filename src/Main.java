public class Main {
    public static boolean isPalindrom(String str){
        String new_str = str.replaceAll("\\s","");
        int i = 0;
        int j = new_str.length() - 1;
        while (j > i) {
            if (new_str.charAt(i) != new_str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("palindrom palindrom"));
        System.out.println(isPalindrom("palindrom mordnilap"));
        Number number = new Number(5, 6);
        number.swapFunc();
        System.out.println(number.getFirst());
        System.out.println(number.getSecond());
        }
    }