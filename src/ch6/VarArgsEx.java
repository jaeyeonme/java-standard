package ch6;

/**
 * Date   : 2021. 09. 15
 * Source : VarArgsEx.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = { "100", "200", "300" };

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(",") + "]");
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }

        return result;
    }

/*
	static String concatenate(String... args) {
		return concatenate("", args);
	}
*/
}	// class