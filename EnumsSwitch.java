enum Result1{
    PASS, FAIL, NR;
}

public class EnumsSwitch {
    public static void main(String[] args) {
        Result1 rs = Result1.PASS;

        switch (rs) {
            case PASS:
                System.out.println("passed");
                break;
            case FAIL:
                System.out.println("failed");
                break;
            case NR:
                System.out.println("No Result");
        }
    }
}
