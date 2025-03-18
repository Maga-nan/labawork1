package example.lab1.service;

import example.lab1.dao.DateDAO;
import org.springframework.stereotype.Service;


@Service
public class DateService {
    private static DateDAO dateDAO;

    public static String getDateInCurrentTimeZone(long timestamp) {
        return DateDAO.getDateInCurrentTimeZone(timestamp);
    }
     @GetMapping("/convertDate")
    public ResponseEntity<?> convertDate(@RequestParam("timestamp") String timestamp) {
        try {
            long timestampLong = Long.parseLong(timestamp);


            if (timestampLong < 0) {
                return ResponseEntity.badRequest().body("Invalid timestamp value");
            }
    public static String getDateInGMT(long timestamp) {
        return dateDAO.getDateInGMT(timestamp);
    }
}
