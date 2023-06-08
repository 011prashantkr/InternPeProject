
class Namedloop {
    public static void main(String args[]) {
        outer:
        //label
        for (int i = 1;i <= 5;i++) {
            inner:
            //label
            for(int j = 1;j<=i; j++) {
                System.out.print(j+"");
                if (j == 5)
                    break inner;
            }
            System.out.println("");
            continue outer;
        }
    }
}

/* revised te code
public class NamedLoop {
    public static void main(String[] args) {
        //Named loop

        outer:
        //label
        for (int i = 1; i <= 3; i++) {
            inner:
            //label
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ "");
                if (j == 3)
                    break inner;
                {
                    System.out.println("");
                    continue outer;
                }
            }
        }
    }
}*/