public class SmallIntegerException extends Exception {
    private int totalException = 0;

    // Konstruktor
    public SmallIntegerException(String msg) {
        super(msg);
    }

    public void prnt(int value) throws SmallIntegerException {
        if (value > 9) {
            totalException++;
            throw new SmallIntegerException("Nilai lebih besar dari 9");
        } else if (value < 0) {
            totalException++;
            throw new SmallIntegerException("Nilai lebih kecil dari 0");
        } else {
            System.out.println("nilai benar");
        }
    }

    public int getTotal() {
        return totalException;
    }
}