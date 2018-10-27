package Kata4.main;

import Kata4.model.Histogram;
import Kata4.view.HistogramDisplay;
import Kata4.view.MailHistogramBuilder;
import Kata4.view.MailListReader;

import java.io.IOException;

public class Kata4 {
    public static void main(String[] args) throws IOException {
        MailListReader mailListReader = new MailListReader();
        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();

        Histogram histogram = mailHistogramBuilder.build(mailListReader.read("email.txt"));

        new HistogramDisplay(histogram).execute();
    }
}
