import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalQueries;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import edu.nycenet.hsaps.utils.Utility;
import edu.nycenet.sems.datastructure.MarkTwainTalentRecord;
import edu.nycenet.sems.utils.CalendarUtility;

public class DateChecker {
	private final String formatter = "EEEE',' MMMM dd',' yyyy[',' h[h]:mm a]";
	/*	private TemporalAccessor parse(String v) {
        return formatter.parseBest(v,
                                   ZonedDateTime::from,
                                   LocalDateTime::from,
                                   LocalDate::from);
    }	*/
	@Test
	public void test1() throws ParseException {
		List<String> list = Arrays.asList("","","Saturday, November 04, 2017, 8:30 AM","Wednesday, October 25, 2017","","Saturday, November 04, 2017, 8:30 AM","Saturday, November 04, 2017","","Saturday, November 04, 2017, 8:30 AM","Wednesday, October 25, 2017","Sunday, October 29, 2017, 8:30 AM","Sunday, October 29, 2017, 8:30 AM","Wednesday, October 25, 2017","","Saturday, November 04, 2017, 8:30 AM","","","Saturday, November 04, 2017, 8:30 AM","","","Saturday, November 04, 2017, 8:30 AM","Wednesday, October 25, 2017","","Saturday, November 04, 2017, 8:30 AM","Wednesday, October 25, 2017","","Saturday, November 04, 2017, 8:30 AM","","","Sunday, October 29, 2017, 8:30 AM","","","Sunday, October 29, 2017, 8:30 AM","Wednesday, October 25, 2017","Sunday, October 29, 2017, 8:30 AM","Sunday, October 29, 2017, 8:30 AM","","Saturday, November 04, 2017, 8:30 AM","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","");
		Collections.sort(list, new MyComparer());
		System.out.println(list);
	}
}
class MyComparer implements Comparator<String> {
	public int compareDates (String date1, String date2, String formatterStr) throws ParseException {
		if((Utility.isEmpty(date1) && Utility.isEmpty(date2)) || Utility.areStringsEqual(date1, date2, true)) {
			return 0;
		}
		if(Utility.isEmpty(date1)){
			return 1;
		}
		if(Utility.isEmpty(date2)) {
			return -1;
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatterStr);  	
		LocalDate d1 = formatter.parse(date1).query(TemporalQueries.localDate());
		LocalDate d2 = formatter.parse(date2).query(TemporalQueries.localDate());

		int result = d1.compareTo(d2);

		if(result == 0) {
			LocalTime	t1 = formatter.parse(date1).query(TemporalQueries.localTime());
			LocalTime	t2 = formatter.parse(date2).query(TemporalQueries.localTime());
			if(Utility.isEmpty(t1)) {
				t1 =LocalTime.of(0,0);
			}
			if(Utility.isEmpty(t2)) {
				t2 =LocalTime.of(0,0);
			}
			result = t1.compareTo(t2);
		}
		return result;	
	}

	@Override
	public int compare(String o1, String o2) {
		try {
			return compareDates(o1, o2, "EEEE',' MMMM dd',' yyyy[',' h[h]:mm a]");
		} catch (ParseException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int compare(MarkTwainTalentRecord o1, MarkTwainTalentRecord o2) {
		String testTime1 = o1.getTestTime();
		String testTime2 = o2.getTestTime();
		Date o1Date = null;
		Date o2Date = null;

		if (Utility.isNotEmpty(o1.getTestDate())) {
			o1Date = o1.getTestDate();
		}
		if (Utility.isNotEmpty(o2.getTestDate())) {
			o2Date = o2.getTestDate();
		}
		if (null == o2Date) {
			return -1;
		}
		if (null == o1Date) {
			return 1;
		}
		int result = o1Date.compareTo(o2Date);
		if (result == 0) {
			return compareTestStartTime(
							testTime1.replaceAll(" ", "").split("-")[0],
							testTime2.replaceAll(" ", "").split("-")[0]);
		}
		return result;
	}


	private int compareTestStartTime(String testStartTime1,
			String testStartTime2) {
		String startTimeDateFormat = "h:mma";
		int compareValue = 0;
		Calendar cal1 = null;
		Calendar cal2 = null;
		try {
			cal1 =
					CalendarUtility.convertStringToCalendar(testStartTime1,
							startTimeDateFormat);
			cal2 =
					CalendarUtility.convertStringToCalendar(testStartTime2,
							startTimeDateFormat);
			compareValue = cal1.compareTo(cal2);
		} catch (ParseException pex) {
			pex.printStackTrace();
		}
		return compareValue;
	}
}
