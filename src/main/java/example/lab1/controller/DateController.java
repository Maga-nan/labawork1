package example.lab1.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@RestController
public class DateController {

    @GetMapping("/convertDate")
    public ResponseEntity<?> convertDate(@RequestParam("timestamp") String timestamp) {
        try {
            long timestampLong = Long.parseLong(timestamp);


            if (timestampLong < 0) {
                return ResponseEntity.badRequest().body("Invalid timestamp value");
            }

            // Используем OffsetDateTime для работы со смещением
            OffsetDateTime dateTime = Instant.ofEpochMilli(timestampLong)
                    .atZone(ZoneId.systemDefault())
                    .toOffsetDateTime();
            String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
            return ResponseEntity.ok(formattedDateTime);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected server error" + e.getMessage());
        }
        //catch (NumberFormatException e) {
          //  return ResponseEntity.badRequest().body("Invalid timestamp format");
        //}
    }
}