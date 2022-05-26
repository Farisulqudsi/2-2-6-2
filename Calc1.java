import java.util.Scanner;

public class Calc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пример: ");
        System.out.print(calc(input.nextLine()));
    }

    public static String calc(String input) {
        int a = 0, b = 0, answer = 0;
        String[] inputStr = new String[3];
        inputStr = input.split(" ");
        if (inputStr.length > 3) {
            System.out.println("Система не принимает длинные примеры");
            System.exit(0);
        }
        try {
            a = Integer.parseInt(inputStr[0]);
            b = Integer.parseInt(inputStr[2]);
            if (a > 10 || b > 10 || a < 1 || b < 1) {
                System.out.println("Не удовлетворяет условиям калька");
                System.exit(0);
            }

            switch (inputStr[1]) {
                case "+":
                    answer = a + b;
                    break;
                case "-":
                    answer = a - b;
                    break;
                case "*":
                    answer = a * b;
                    break;
                case "/":
                    answer = a / b;
                    break;
                default:
                    System.out.println("Не удовлетворяет условиям калька");
                    System.exit(0);
            }
            input = String.valueOf(answer);
        } catch (NumberFormatException e) {
            Ura Number1 = Ura.valueOf(inputStr[0]);
            Ura Number2 = Ura.valueOf(inputStr[2]);
            a = Number1.ordinal();
            b = Number2.ordinal();
            switch (inputStr[1]) {
                case "+":
                    answer = a + b;
                    break;
                case "-":
                    answer = a - b;
                    break;
                case "*":
                    answer = a * b;
                    break;
                case "/":
                    answer = a / b;
                    break;
                default:
                    System.out.println("Не удовлетворяет условиям калька");
                    System.exit(0);
                    break;
            } Ura Rima = Ura.values()[answer];
            input = Rima.name();
        } catch (IllegalArgumentException v) {
            System.out.println("Calc принимает только целые числа одной системы счисления");
            System.exit(0);
        }
        if (a > 10 || b > 10 || a < 1 || b < 1) {
            System.out.println("Будьте вежливы, не перегибайте палку...");
            System.exit(0);
        }
        if (answer < 1) {
            System.out.println("Римских отрицательных не бывает");
            System.exit(0);
        }
        System.out.print("Ответ: ");
        return input;
    }
}
enum Ura {
    K(0), I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), XI(11), XII(12), XIII(13), XIV(14), XV(15), XVI(16), XVII(17), XVIII(18), XIX(19), XX(20), XXI(21), XXII(22), XXIII(23), XXIV(24), XXV(25), XXVI(26), XXVII(27), XXVIII(28), XXIX(29), XXX(30), XXXI(31), XXXII(32), XXXIII(33), XXXIV(34), XXXV(35), XXXVI(36), XXXVII(37), XXXVIII(38), XXXIX(39), XL(40), XLI(41), XLII(42), XLIII(43), XLIV(44), XLV(45), XLVI(46), XLVII(47), XLVIII(48), XLIX(49), L(50), LI(51), LII(52), LIII(53), LIV(54), LV(55), LVI(56), LVII(57), LVIII(58), LIX(59), LX(60), LXI(61), LXII(62), LXIII(63), LXIV(64), LXV(65), LXVI(66), LXVII(67), LXVIII(68), LXIX(69), LXX(70), LXXI(71), LXXII(72), LXXIII(73), LXXIV(74), LXXV(75), LXXVI(76), LXXVII(77), LXXVIII(78), LXXIX(79), LXXX(80), LXXXI(81), LXXXII(82), LXXXIII(83), LXXXIV(84), LXXXV(85), LXXXVI(86), LXXXVII(87), LXXXVIII(88), LXXXIX(89), XC(90), XCI(91), XCII(92), XCIII(93), XCIV(94), XCV(95), XCVI(96), XCVII(97), XCVIII(98), XCIX(99), C(100);
    Ura(int bus) { }
}