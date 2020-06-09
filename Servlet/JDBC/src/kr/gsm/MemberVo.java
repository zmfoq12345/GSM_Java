package kr.gsm;

public class MemberVo {

	private String id;
	private String pw;
	private int age;
	
	public MemberVo(String id2, String pw2, int age2) {
		this.id = id2;
		this.pw = pw2;
		this.age = age2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPwd(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pw=" + pw + ", age=" + age + "]";
	}

}
