package streamTask;

import java.util.Objects;

public class Member {
	private String name;
	private String hobby;
	private String introduce;
	private int id;
	
	public Member() {;}

	public Member(String name, String hobby, String introduce) {
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

	public Member(String name, String hobby, String introduce, int id) {
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id;
	}
}
