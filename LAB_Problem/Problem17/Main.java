public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReportGenerator<String> pdfReport = new PDFReportGenerator<>();
        pdfReport.generateReport();

        ReportGenerator<java.util.List<Integer>> csvReport = new CSVReportGenerator<>();
        csvReport.generateReport();
    }
}