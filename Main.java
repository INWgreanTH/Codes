public class Main {
    public static void main(String[] args) {
        DataCallback callback1 = new DataCallback() {
            @Override
            public void onDataProcessed(int result){
                System.out.println("Result: " + result);
            }
        };
        DataProcessor processor = new DataProcessor(callback1);
        processor.processData(5);
    }
}
