package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        String formattedDay = String.format("%02d", Integer.parseInt(day));
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + formattedDay + ":not(.react-datepicker__day--outside-month)").click();
    }
}