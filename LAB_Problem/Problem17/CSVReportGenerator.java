class CSVReportGenerator<T> extends ReportGenerator<T> {
    @Override
    protected void initializeReport() throws InterruptedException {
        System.out.println("Initializing CSV Report...");
        Thread.sleep(1000);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected T fetchData() {
        System.out.println("Fetching Data: [10, 20, 30, 40]");
        return (T) java.util.Arrays.asList(10, 20, 30, 40);
    }

    @Override
    protected void processData(T data) throws InterruptedException {
        System.out.println("Processing Data...");
        Thread.sleep(1000);
    }

    @Override
    protected void generateOutput(T data) throws InterruptedException {
        System.out.println("Generating CSV Report...");
        Thread.sleep(1000);
    }

    @Override
    protected void closeReport() {
        System.out.println("Closing CSV Report...\n");
    }
}