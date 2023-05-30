package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("model : " +dmbCellPhone.model);
		System.out.println("color : " +dmbCellPhone.color);
		System.out.println("channel  : " +dmbCellPhone.channel);
		
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoicd("여보세요");
		dmbCellPhone.receivveVoice("안녕하세요! 저는 이철의 인데요! ");
		dmbCellPhone.sendVoicd("아 반갑습니다 ~");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
