package Kata4.main;

import Kata4.model.Histogram;
import Kata4.model.Mail;
import Kata4.view.HistogramDisplay;
import Kata4.view.MailHistogramBuilder;
import Kata4.view.MailListReader;

import java.io.IOException;
import java.util.List;

public class Kata4 {
    private String fileName = "email.txt";
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histogramDisplay;

    public static void main(String[] args) throws IOException {
        Kata4 kata4 = new Kata4();
        kata4.control();
    }

    public void control() {
        input();
        process();
        output();
    }

    public void input() {
        MailListReader mailListReader = new MailListReader();
        try {
            mailList = mailListReader.read(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void process() {
        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        histogram = mailHistogramBuilder.build(mailList);
    }

    public void output() {
        histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
}
