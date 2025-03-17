package example.lab1.service;

import example.lab1.dao.DateDAO;
import org.springframework.stereotype.Service;


@Service
public class DateService {
    private static DateDAO dateDAO;

    public static String getDateInCurrentTimeZone(long timestamp) {
        return DateDAO.getDateInCurrentTimeZone(timestamp);
    }

    public static String getDateInGMT(long timestamp) {
        return dateDAO.getDateInGMT(timestamp);
    }
}