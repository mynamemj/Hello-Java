package pjt_small;

/**
 * @author MJ
 *
 */
public class Item {
	private String name;
	private String value;
	private int len;

	public Item(String name, String value, int len) {
		this.name = name;
		this.len = len;
		//setValue는 len을 참조함.
		this.setValue(value);
		
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public int getLen() {
		return len;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		if(value==null) {this.value=value;}
		else {
		StringBuffer padded= new StringBuffer(value);
		while(padded.toString().getBytes().length<this.len) {
			padded.append(' ');
		}
		
		this.value=padded.toString();
		}
	}

	public void setLen(int len) {
		this.len = len;
	}
	
	
}
