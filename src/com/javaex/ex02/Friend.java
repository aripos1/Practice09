package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;
	
    public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getHp() {
		return hp;
	}

	public final void setHp(String hp) {
		this.hp = hp;
	}

	public final String getSchool() {
		return school;
	}

	public final void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}

}
