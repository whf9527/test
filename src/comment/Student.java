package comment;

public class Student {
	private Integer stuNo;
	private String name;
	private String clas;
	private String sex;
	private Integer age;
	private Integer score;
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	



	public Student(Integer stuNo, String name, String clas, String sex, Integer age, Integer score) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.clas = clas;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}




	public Integer getStuNo() {
		return stuNo;
	}
	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

}
