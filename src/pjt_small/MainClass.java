package pjt_small;

public class MainClass {
	public static void main(String[]args) {
		Item item1=new Item("이름","홍길등",10);
		Item item2=new Item("전화번호","01088880000",11);
		Packet packet=new Packet();
		packet.addItem(item1);
		packet.addItem(item2);
		System.out.printf("[%s]\n",packet.raw() );
		
		Packet recvPacket= new Packet();
		recvPacket.addItem(new Item("생일",null,8));
		recvPacket.addItem(new Item("주소",null,30));
		recvPacket.parse("19801215서울시 송파구 잠실동 123-3    ");
		System.out.println(recvPacket.getItem("주소").getValue()
				);
		
		
		
	}
//	홍길동    01099990000 이런식으로 출
}
