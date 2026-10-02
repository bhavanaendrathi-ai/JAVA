public class DataTypesOperators {
  static int totalBillsGenerated = 0;
  int a = 28;

  public static void main(String[] args) {

    // byte i = 10;
    // short j = 245;

    int itemcount = 4;
    long bill_id = 1009823456L;

    double priceperitem = 250.00;
    float taxrate = 0.05f;

    char currencysymbol = '$';

    boolean ismember = true;
    boolean needApproval = false;

    System.out.println("---------- Primitive Datatypes ----------");
    System.out.println("Bill ID : " + bill_id + " Curreny : " + currencysymbol);

    int discountFlag = 1;
    System.out.println("Inside block -> discount Flag = " + discountFlag);

    double subtotal = itemcount * priceperitem;
    double remainder = itemcount % 3;

    System.out.println("Subtotal = " + subtotal + ", Itemcount % 3 = " + remainder);

    System.out.println("\n---------- Relational Operations ----------");
    System.out.println("Subtotal > 500" + (subtotal > 500));
    System.out.println("Itemcount == 4" + (itemcount == 4));

    boolean EligibleForDiscount = ismember || (subtotal > 500);

    System.out.println("\n---------- Logical Operations ----------");
    System.out.println("Eligible for discount : " + EligibleForDiscount);
    System.out.println("Need Apporoval : " + needApproval);

    int a = 6, b = 3;

    System.out.println("\n---------- Bitwise Operators ----------");
    System.out.println("a & b = " + (a & b));
    System.out.println("a | b = " + (a | b));
    System.out.println("a ^ b = " + (a ^ b));
    System.out.println("a << 1 = " + (a << 1));

    double total = subtotal;
    total += subtotal * taxrate;

    if(EligibleForDiscount) {
      total -= 50;
    }

    System.out.println("\n---------- Assignment Operators ----------");
    System.out.println("Final Total after tax/discount = " + total);

    int wholeunits = 10;
    double widenedunits = wholeunits;

    System.out.println("\n---------- Implicit Type Conversion ----------");
    System.out.println("whole units : " + wholeunits);
    System.out.println("widened to double : " + widenedunits);

    int roundedTotal = (int) total;

    System.out.println("\n---------- Explicit Casting ----------");
    System.out.println("total = " + total);
    System.out.println("Cast to int : " + roundedTotal);

    int precedenceResult = 5 + 3 * 2 - (4 / 2);

    System.out.println("\n---------- Operator Precedence ----------");
    System.out.println("5 + 3 * 2 - (4 / 2) = " + precedenceResult);

    totalBillsGenerated++;

    System.out.println("\nTotal Bills Generated so far = " + totalBillsGenerated);
  }
}
