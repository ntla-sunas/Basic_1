import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.time.format.DateTimeFormatter;


public class DateTime_Example {
    public static void main (String[] args) {
        // 1. Lấy ngày và giờ hiện tại
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime.format(formatter));
        // 2. Tạo ngày/thời gian cụ thể
        LocalDate date = LocalDate.of(2025, 07, 10);
        LocalDate newDate = date.withDayOfMonth(31);
        LocalDate newDate1 = date.withDayOfYear(32);

        System.out.println("New Date (day of month 31): " + newDate);
        System.out.println("New Date (day of year 32): " + newDate1);

        // 3. Parse từ chuỗi
        LocalDateTime dateTime1 = LocalDateTime.parse("2025-07-10T17:50");
        System.out.println(("Parsed Datetime: " + dateTime1.format(formatter)));
        System.out.println();

        // 4. Format ngày giờ
        DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Short Date: " + fmt.format(currentDate));

        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Medium Date: " + fmt.format(currentDate));

        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Long Date: " + fmt.format(currentDate));

        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(String.format("Full Date: " + fmt.format(currentDate)));
        System.out.println();

        // 5. Định dạng với ngôn ngữ khác
        DateTimeFormatter fmtLocale = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.JAPAN);
        System.out.println("Japan locale: " + fmtLocale.format(currentDate));

        // 6. Làm việc với Zone
        ZonedDateTime date1 = ZonedDateTime.parse("2025-07-10T18:00:00+09:00[Asia/Tokyo]");
        System.out.println("Zoned Date: "+ date1.format(formatter));

        ZoneId id = ZoneId.of("Asia/Tokyo");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Current System Zone: " + currentZone);
        System.out.println();

        // 7. Tính toán khoảng thời gian
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next Week: " + nextWeek);

        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next Month: " + nextMonth);

        Period period = Period.between(nextMonth, today);
        System.out.println("Period between next month and today: " + period);
        System.out.println();

        // 8. Duration (chênh lệch giờ)
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.plusHours(2);
        Duration duration = Duration.between(time1, time2);
        System.out.println("Now: " + time1);
        System.out.println("After: " + time2);
        System.out.println("Duration: " + duration);
    }
}
