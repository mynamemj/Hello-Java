package pjt_small;

public class MainClass {
	public static void main(String[]args) {
		Item item1=new Item("�̸�","ȫ���",10);
		Item item2=new Item("��ȭ��ȣ","01088880000",11);
		Packet packet=new Packet();
		packet.addItem(item1);
		packet.addItem(item2);
		System.out.printf("[%s]\n",packet.raw() );
		
		Packet recvPacket= new Packet();
		recvPacket.addItem(new Item("����",null,8));
		recvPacket.addItem(new Item("�ּ�",null,30));
		recvPacket.parse("19801215����� ���ı� ��ǵ� 123-3    ");
		System.out.println(recvPacket.getItem("�ּ�").getValue()
				);
		
		
		
	}
//	ȫ�浿    01099990000 �̷������� ��
}
