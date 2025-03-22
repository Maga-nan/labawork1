package example.lab1.controller;


import example.lab1.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    @Autowired
    private DateService dateService;

    @GetMapping("/convertDate")
    public ResponseEntity<?> convertDate(@RequestParam("timestamp") long timestamp) {
        try {
            return ResponseEntity.ok(dateService.convertTimestampToDate(timestamp));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("Invalid timestamp format");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected server error: " + e.getMessage());
        }
    }
}
