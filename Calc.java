import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int a = 0, b = 0, sum = 0;
        String input = new String();
        String[] uwaga = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пример: ");
        input = scanner.nextLine();
        uwaga = input.split(" ");
        if (uwaga.length>3) {
            System.out.println("Не грузи меня, щаник");
            System.exit(0);
        }
        try {
            a = Integer.parseInt(uwaga[0]);
            b = Integer.parseInt(uwaga[2]);
            if (a>10 || b>10 || a<1 || b<1) {
                System.out.println("Аккуратнее ...");
                System.exit(0);
            }
            switch (uwaga[1]) {
                case "+" : sum = a + b;
                    break;
                case "-" : sum = a - b;
                    break;
                case "*" : sum = a * b;
                    break;
                case "/" : sum = a / b;
                    break;
                default:
                    System.out.println("Иди нах");
                    System.exit(0);
                    break;
            }
            System.out.println(sum);

        } catch (NumberFormatException e) {
            try {
                Slambus Number1 = Slambus.valueOf(uwaga[0]);
                Slambus Number2 = Slambus.valueOf(uwaga[2]);
                a = Number1.ordinal();
                b = Number2.ordinal();
            } catch (IllegalArgumentException v) {
                System.out.println("Calc принимает только целые числа одной системы счисления");
                System.exit(0);
            }
            if (a>10 || b>10 || a<1 || b<1) {
                System.out.println("Будьте вежливы, не перегибайте палку...");
                System.exit(0);
            } switch (uwaga[1]) {
                case "+" : sum = a + b;
                    break;
                case "-" : sum = a - b;
                    break;
                case "*" : sum = a * b;
                    break;
                case "/" : sum = a / b;
                    break;
                default:
                    System.out.println("Иди нах");
                    System.exit(0);
                    break;
            } if (sum<1) {
                System.out.println("Римских отрицательных не бывает");
                System.exit(0);
            } Slambus Rima = Slambus.values()[sum];
            System.out.println(Rima);
        }
    }
}
enum Slambus {
    K(0), I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), XI(11), XII(12), XIII(13), XIV(14), XV(15), XVI(16), XVII(17), XVIII(18), XIX(19), XX(20), XXI(21), XXII(22), XXIII(23), XXIV(24), XXV(25), XXVI(26), XXVII(27), XXVIII(28), XXIX(29), XXX(30), XXXI(31), XXXII(32), XXXIII(33), XXXIV(34), XXXV(35), XXXVI(36), XXXVII(37), XXXVIII(38), XXXIX(39), XL(40), XLI(41), XLII(42), XLIII(43), XLIV(44), XLV(45), XLVI(46), XLVII(47), XLVIII(48), XLIX(49), L(50), LI(51), LII(52), LIII(53), LIV(54), LV(55), LVI(56), LVII(57), LVIII(58), LIX(59), LX(60), LXI(61), LXII(62), LXIII(63), LXIV(64), LXV(65), LXVI(66), LXVII(67), LXVIII(68), LXIX(69), LXX(70), LXXI(71), LXXII(72), LXXIII(73), LXXIV(74), LXXV(75), LXXVI(76), LXXVII(77), LXXVIII(78), LXXIX(79), LXXX(80), LXXXI(81), LXXXII(82), LXXXIII(83), LXXXIV(84), LXXXV(85), LXXXVI(86), LXXXVII(87), LXXXVIII(88), LXXXIX(89), XC(90), XCI(91), XCII(92), XCIII(93), XCIV(94), XCV(95), XCVI(96), XCVII(97), XCVIII(98), XCIX(99), C(100);
    Slambus(int bus) {
    }
}

