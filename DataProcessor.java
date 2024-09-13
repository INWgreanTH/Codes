public abstract class DataProcessor {
    private DataCallback callback;

    public DataProcessor(DataCallback callback){
        this.callback = callback;
    }
    public void processData(int data){
        int result = data * 2;

        if(callback != null){
            callback.onDataProcessed(result);
        }
    }
    
}
