import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {
    private SimpleDateFormat dataFormatter = new SimpleDateFormat("dd/MM/yyyy");
    public String getTodaysDate() { 
        var today = new Date();
        var result = dataFormatter.format(today);
        return result.toString();
    }
}
