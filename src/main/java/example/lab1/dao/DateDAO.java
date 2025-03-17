package example.lab1.dao;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateDAO {
    public static String getDateInCurrentTimeZone(long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());

        return zonedDateTime.toString();
    }

    public String getDateInGMT(long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("GMT"));

        return zonedDateTime.toString();
    }
}