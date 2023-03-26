import java.util.Scanner;
public class condicional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" *====== Calculadora Hacker ======* ");
        System.out.println(" _____         _               _             _                      _                   _               \n" +
                "/  __ \\       | |             | |           | |                    | |                 | |              \n" +
                "| /  \\/  __ _ | |  ___  _   _ | |  __ _   __| |  ___   _ __  __ _  | |__    __ _   ___ | | __ ___  _ __ \n" +
                "| |     / _` || | / __|| | | || | / _` | / _` | / _ \\ | '__|/ _` | | '_ \\  / _` | / __|| |/ // _ \\| '__|\n" +
                "| \\__/\\| (_| || || (__ | |_| || || (_| || (_| || (_) || |  | (_| | | | | || (_| || (__ |   <|  __/| |   \n" +
                " \\____/ \\__,_||_| \\___| \\__,_||_| \\__,_| \\__,_| \\___/ |_|   \\__,_| |_| |_| \\__,_| \\___||_|\\_\\\\___||_|   \n" +
                "                                                                                                        \n" +
                "                                                                                                        ");
        System.out.println("   :::!~!!!!!:.\n" +
                "                  .xUHWH!! !!?M88WHX:.\n" +
                "                .X*#M@$!!  !X!M$$$$$$WWx:.\n" +
                "               :!!!!!!?H! :!$!$$$$$$$$$$8X:\n" +
                "              !!~  ~:~!! :~!$!#$$$$$$$$$$8X:\n" +
                "             :!~::!H!<   ~.U$X!?R$$$$$$$$MM!\n" +
                "             ~!~!!!!~~ .:XW$$$U!!?$$$$$$RMM!\n" +
                "               !:~~~ .:!M\"T#$$$$WX??#MRRMMM!\n" +
                "               ~?WuxiW*`   `\"#$$$$8!!!!??!!!\n" +
                "             :X- M$$$$       `\"T#$T~!8$WUXU~\n" +
                "            :%`  ~#$$$m:        ~!~ ?$$$$$$\n" +
                "          :!`.-   ~T$$$$8xx.  .xWW- ~\"\"##*\"\n" +
                ".....   -~~:<` !    ~?T#$$@@W@*?$$      /`\n" +
                "W$@@M!!! .!~~ !!     .:XUW$W!~ `\"~:    :\n" +
                "#\"~~`.:x%`!!  !H:   !WM$$$$Ti.: .!WUn+!`\n" +
                ":::~:!!`:X~ .: ?H.!u \"$$$B$$$!W:U!T$$M~\n" +
                ".~~   :X@!.-~   ?@WTWo(\"*$$$W$TH$! `\n" +
                "Wi.~!X$?!-~    : ?$$$B$Wu(\"**$RM!\n" +
                "$R@i.~~ !     :   ~$$$$$B$$en:``\n" +
                "?MXT@Wx.~    :     ~\"##*$$$$M~\n");
                System.out.println("--* Seja muito bem vindo meu chefia! --* ︎︎" );
                System.out.println("### Siga o manual de instruções logo abaixo" );
                System.out.println("* ==-== M A N U A L ==-== *" );
                System.out.println("- Digite 1 para somar " );
                System.out.println("- Digite 2 para subtrair " );
                System.out.println("- Digite 3 para multiplicar " );
                System.out.println("- Digite 4 para dividir " );
                System.out.println("* =-=-=-=-=-=-=-=-=-=-=-= *");

                String escolha = scan.nextLine();

        String palavra = escolha;

        soma(palavra);
    }

    static void soma(String palav) {

        Scanner scan = new Scanner(System.in);
        if (palav.equals("1")) {
            System.out.println("Digite um número:");
            int n1 = Integer.parseInt(scan.nextLine());
            System.out.println("+");
            int n2 = Integer.parseInt(scan.nextLine());

            Number res = n1 + n2;

            System.out.println("O resultado é: " + res);
        } else if(palav.equals("2")) {
            System.out.println("Digite um número:");
            int n1 = Integer.parseInt(scan.nextLine());
            System.out.println("-");
            int n2 = Integer.parseInt(scan.nextLine());

            Number res = n1 - n2;

            System.out.println("O resultado é: " + res);
        } else if(palav.equals("3")) {
            System.out.println("Digite um número:");
            int n1 = Integer.parseInt(scan.nextLine());
            System.out.println("X");
            int n2 = Integer.parseInt(scan.nextLine());

            Number res = n1 * n2;

            System.out.println("O resultado é: " + res);
        }
    }
}
