class PDFReportGenerator<T> extends ReportGenerator<T> {
    @Override
    protected void initializeReport() throws InterruptedException {
        System.out.println("Initializing PDF Report...");
        Thread.sleep(1000);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected T fetchData() throws InterruptedException {
        System.out.println("Fetching Data: Sales Data");
        Thread.sleep(1000);
        return (T) "Sales Data";
    }

    @Override
    protected void processData(T data) throws InterruptedException {
        System.out.println("Processing Data...");
        Thread.sleep(1000);
    }

    @Override
    protected void generateOutput(T data) throws InterruptedException {
        System.out.println("Generating PDF Report...");
        Thread.sleep(1000);
    }

    @Override
    protected void closeReport() throws InterruptedException {
        System.out.println("Closing PDF Report...\n");
        Thread.sleep(1000);
    }
}