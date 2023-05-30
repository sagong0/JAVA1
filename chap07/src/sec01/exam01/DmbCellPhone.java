package sec01.exam01;

//부모의 public, protected 상속가능
public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
//		this.model = model;
//		this.color = color;
//		부모가 명시적으로 매개값을 받는 생성자가 있을 경우 자식 클래스를 작성할 때 super()로 부모 생성자를
//		호출할 때 파라미터에 맞게 올바르게 호출할 수 있도록 만둘어 주지않으면 컴파일 에러 발생
		super(model, color);
		this.channel = channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
