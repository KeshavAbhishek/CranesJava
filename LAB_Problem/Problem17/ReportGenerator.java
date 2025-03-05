abstract class ReportGenerator<T> {
    // Template method
    public final void generateReport() throws InterruptedException {
        initializeReport();
        T data = fetchData();
        processData(data);
        generateOutput(data);
        closeReport();
    }

    protected abstract void initializeReport() throws InterruptedException;
    protected abstract T fetchData() throws InterruptedException;
    protected abstract void processData(T data) throws InterruptedException;
    protected abstract void generateOutput(T data) throws InterruptedException;
    protected abstract void closeReport() throws InterruptedException;
}