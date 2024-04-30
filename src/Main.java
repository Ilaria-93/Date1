/* Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni */

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String dateStringInFull = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println("The date in full is: " + dateStringInFull);

        String dateStringInMedium = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("The date in medium is: " + dateStringInMedium);

        String dateStringInShort = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("The date in short is: " + dateStringInShort);
    }
}