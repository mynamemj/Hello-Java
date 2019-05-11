package pjt_small;

import java.util.ArrayList;
import java.util.HashMap;

public class Packet {
	private ArrayList<Item> packet=new ArrayList<Item>();
	private HashMap<String, Item> nameAccess = new HashMap<String,Item>();
	
	public void addItem(Item i) {
		packet.add(i);
		if(nameAccess.containsKey(i.getName())) {
			throw new RuntimeException(
					"Duplicated item name:["+i.getName()+"]");
		}
		nameAccess.put(i.getName(),i);
	}
	public Item getItem(String name) {
		return nameAccess.get(name);
	}
	public String raw() {
		StringBuffer b=new StringBuffer();
		for(Item i:packet) {
			b.append(i.getValue());
		};
		return b.toString();
	}
	
	public void parse(String data) {
		//data="940707 부산 해운대구 어쩌고"
		byte[] bdata = data.getBytes();
		int pos=0;
		for(Item i:packet) {
			//아이템:생일, 주소
			byte[] token=new byte[i.getLen()];
			System.arraycopy(bdata, pos, token, 0, token.length);
			i.setValue(new String(token));
			pos+=token.length;
		}
	}
}
