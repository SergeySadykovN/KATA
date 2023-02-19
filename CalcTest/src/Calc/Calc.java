package Calc;

//      собственно калькулятор с проверкой на наличие оператора

public class Calc {

    public static int calcul(int frstDig, String oper, int secDig) {
        int rslt = 0;

        if (oper.equals("+")) {
            rslt = frstDig + secDig;
        }
        if (oper.equals("-")) {
            rslt = frstDig - secDig;
        }
        if (oper.equals("*")) {
            rslt = frstDig * secDig;
        }
        if (oper.equals("/")) {
            rslt = frstDig / secDig;
        }

        return rslt;

    }

}

