public class Parse {
    private long a = 0;
    private long b = 0;
    private String operation;
    private static boolean isInArr(char[] arr, char g) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == g) {
                return true;
            }
        }
        return false;
    }
    private static String[] getFragments(String str) throws WrongFormateException {
        String res[] = {" ", " ", " "};
        int k = 0;
        char[] operations = {'+','-', '*', '/'};
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) < '0')||(str.charAt(i) > '9')&&(isInArr(operations, str.charAt(i)))) {
                throw new WrongFormateException();
            }
            else {
                if ((str.charAt(i) >= '0')&&(str.charAt(i) <= '9')) {
                    res[k]+=str.charAt(i);
                }
                else {
                    res[++k] += str.charAt(i);
                    k++;
                }
            }
        }
        if (k > 2) {
            throw new WrongFormateException();
        }
        return res;
    }
    public Parse(String str) throws WrongFormateException {
        String[] Frag = getFragments(str);
        this.a = Long.parseLong(Frag[0]);
        this.b = Long.parseLong(Frag[2]);
        this.operation = Frag[1];
        if ((this.operation == "/")&&(this.b == 0)) {
            throw new ArithmeticException();
        }
    }
    public long getA() {
        return this.a;
    }
    public long getB() {
        return this.b;
    }
}
