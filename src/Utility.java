import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

public class Utility {
	public static final String TIMEZONE_EST = "America/New_York";
	public static final String DATE_FORMAT_EASTERN_TIME =
		        "MM/dd/yyyy hh:mm:ss a zzz";
	 public static boolean isEmpty(Object object) {
	        boolean returnCode = false;

	        if (object instanceof Collection) {
	            returnCode = isEmpty((Collection) object);
	        } else if (object instanceof String) {
	            returnCode = isEmpty((String) object);
	        } else {
	            returnCode = (object == null);
	        }

	        return returnCode;
	    }
	    public static boolean isNotEmpty(Object object) {
	        return !isEmpty(object);
	    }

	    protected static boolean isEmpty(String stringObject) {
	        boolean returnCode = true;

	        if ((stringObject != null) && (stringObject.trim().length() > 0)) {
	            returnCode = false;
	        }

	        return returnCode;
	    }
	
	 public static long compareDates(Date d1, Date d2) {
	        long diff = 0L;
	        if (Utility.isNotEmpty(d1) && Utility.isNotEmpty(d2)) {
	          diff = d1.getTime() - d2.getTime();
	        } else if (!Utility.isEmpty(d2)) {
	          diff = 0 - d2.getTime();
	        } else if (!Utility.isEmpty(d1)) {
	          diff = d1.getTime();
	        }
	        return (diff / (1000));
	    }
	  public static String getCurrentDateInEasternTimeFormat() {
	        return getDateInEasternTimeFormat(new Date());
	    }
	    public static String getDateInEasternTimeFormat(Date date) {
	        // Set to current date if it is null
	        if (null == date) {
	            date = new Date();
	        }
	        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_EASTERN_TIME);
	        dateFormat.setTimeZone(TimeZone.getTimeZone(TIMEZONE_EST));
	        return (dateFormat.format(date));
	    }
	    public static int compareBoolean(boolean obj1, boolean obj2) {
	    	if(obj1 == obj2) {
	    		return 0;
	    	}
	    	if(obj1) {
	    		return -1;
	    	}
	    	if(obj2) {
	    		return 1;
	    	}
	    	System.out.println("Printing");
	    	return 0;
	    }
}
