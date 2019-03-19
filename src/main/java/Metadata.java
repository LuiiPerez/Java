import com.google.gson.annotations.SerializedName;

public class Metadata {
	@SerializedName("1. Information")
	private String information;
	@SerializedName("2. Symbol")
	private String symbol;
	@SerializedName("3. Last Refreshed")
	private String lastRefresh;
	@SerializedName("4. Interval")
	private String interval;
	@SerializedName("5. Output Size")
	private String size;
	@SerializedName("6. Time Zone")
	private String timeZone;
	
	public Metadata() {}
	public Metadata(String information, String symbol,String lastRefresh, String interval, String size, String timeZone) {
		this.information = information;
		this.symbol = symbol;
		this.lastRefresh = lastRefresh;
		this.interval = interval;
		this.size = size;
		this.timeZone = timeZone;
	}
	
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getLastRefresh() {
		return lastRefresh;
	}
	public void setLastRefresh(String lastRefresh) {
		this.lastRefresh = lastRefresh;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}	
}
