package example.lab1.service;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Service
public class DateService {

    public String convertTimestampToDate(long timestamp) {
        OffsetDateTime dateTime = Instant.ofEpochMilli(timestamp)
                .atZone(ZoneId.systemDefault())
                .toOffsetDateTime();
        String currentZoneDateTime = dateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        OffsetDateTime gmtDateTime = Instant.ofEpochMilli(timestamp)
                .atZone(ZoneId.of("GMT"))
                .toOffsetDateTime();
        String gmtDateTimeStr = gmtDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        return "{\"currentZoneDateTime\":\"" + currentZoneDateTime + "\", \"gmtDateTime\":\"" + gmtDateTimeStr + "\"}";
    }
    
}
