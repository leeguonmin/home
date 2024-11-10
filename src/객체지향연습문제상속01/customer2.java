package 객체지향연습문제상속01;

public class customer2 extends Person {
	// 필드 선언 // 네임이랑 전화번호는 엄마 클래스에 있으니까 여기에는 고객 번호랑 포인트점수만
	int cNo;
	int point;
	
	public customer2(String name, String hp, int cNo,int point) {
		super(name,hp);
		this.cNo=cNo;
		this.point=point;
	}
	
	public int getCNo() {
		return cNo;
	}
	
	public void setCNo(int cNo) {
		this.cNo=cNo;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int ponit) {
		this.point=point;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("#이름:%s, #핸드폰:%s, #고객번호:%d, #포인트점수:%d%n"+name,hp,cNo,point);
		
	}
	

}

