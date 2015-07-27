
public class TrackingItem {
	Range range;
	char status;
	int code;
	boolean valid;
	
	public TrackingItem() {
		range = new Range();
		range.lo = 0;
		range.hi = 0;
		status = 'I';
		code = 0;
		valid = false;
	}

	public TrackingItem(int start, int end, char status, int code) {
		range = new Range();
		range.lo = start;
		range.hi = end;
		this.status = status;
		this.code = code;
		valid = true;
	}
	
}