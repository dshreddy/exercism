import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("M/d/y H:m:s");
        return LocalDateTime.parse(appointmentDateDescription, pattern);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        return appointmentDate.isBefore(now);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >=12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {

        String dayOfWeek = appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String month = appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int dayOfMonth = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear() ;
        int minutes = appointmentDate.getMinute();

        int hour = appointmentDate.getHour();
        String suffix = (hour >= 12) ? ("PM") : ("AM");
        if(hour >= 13) hour -= 12;

        return "You have an appointment on "
                + dayOfWeek + ", "
                + month + " "
                + dayOfMonth + ", "
                + year + ", at "
                + hour + ":"
                + ((minutes < 10) ? ("0" + minutes):(minutes)) + " "
                + suffix
                + ".";
    }

    public LocalDate getAnniversaryDate() {
       return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
