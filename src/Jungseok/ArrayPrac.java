package Jungseok;

public class ArrayPrac {
    // 16진수를 2진수로 변환
    public void hex2binary(){
        char[] hex = { '5', 'A', 'B', 'C', 'D', 'E', 'F'};
        String[] binary = { "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "0001", "1010", "1011",
                "1100", "1101", "1110", "1111",};

        String result="";

        for ( int h : hex )
        {
            if ( h >= '0' && h <= '9'){
                result+= binary[h-'0'];
            }
            else {
                result += binary[h-'A'+10]; //ASCII 코드 변환
            }
            result += " ";
        }

        System.out.println("hex:" + new String(hex));
        System.out.println("binary:" + result);
    }

    // char<->String 변환
    public void convertCharAndString(){
        String src = "ABCDE";

        // String -> char(charAt사용)
        for ( int i = 0; i < src.length(); i++){
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"):" + ch);
        }
        System.out.println();

        // String -> char(toCharArray사용)
        char[] chArr = src.toCharArray();
        System.out.println(chArr);
        System.out.println();

        // char -> String
        char[] chArr2 = {'Z', 'X', 'C', 'V', 'B'};
        String newStr = new String(chArr2);

        System.out.println(newStr);
    }

    public void printArgs(String[] args){
        for ( int i = 0; i < args.length; ++i){
            System.out.println("args["+i+"] = " + args[i]);
        }
    }

    public static void main(String[] args) {
        ArrayPrac a = new ArrayPrac();
        a.hex2binary();
        System.out.println();
        a.convertCharAndString();
        System.out.println();
        a.printArgs(args);
    }
}
