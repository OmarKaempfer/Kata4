package Kata4.view;

import Kata4.model.Histogram;
import Kata4.model.Mail;

import java.util.Iterator;
import java.util.List;

public class MailHistogramBuilder {
    public Histogram<String> build(List<Mail> mailList) {
        Histogram mailHistogram = new Histogram<Mail>();
        Iterator mailIterator = mailList.iterator();

        while(mailIterator.hasNext()) {
            mailHistogram.increment(((Mail)mailIterator.next()).getDomain());
        }

        return mailHistogram;
    }
}
