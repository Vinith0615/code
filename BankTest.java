//Exercise(interface & packages
interface Bank {
    double rateOfInterest();  
}

class SBI implements Bank {
    public double rateOfInterest() {
        return 6.5;  
    }
}


class HDFC implements Bank {
    public double rateOfInterest() {
        return 7.2;  
    }
}


public class BankTest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.rateOfInterest() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.rateOfInterest() + "%");
    }
}