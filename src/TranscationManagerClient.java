public class TranscationManagerClient {
    public static void main(String[] args){
        TransactionManager tm = new TransactionManager();
        Range r = new Range(1, 100000);
        Transaction t = new Transaction(r, 'A', '1');
    }
}
