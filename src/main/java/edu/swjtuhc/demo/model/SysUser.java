package edu.swjtuhc.demo.model;

public class SysUser {
	    int UId;
		String username;
		String passname;
		String name;
		int age;
		String gender;
		String avatar;
		
		public int getUId() {
			return UId;
		}
		public void setUId(int uId) {
			UId = uId;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassname() {
			return passname;
		}
		public void setPassname(String passname) {
			this.passname = passname;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAvatar() {
			return avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		@Override
		public String toString() {
			return "SysUser [username=" + username + ", passname=" + passname + ", name=" + name + ", age=" + age
					+ ", gender=" + gender + ", avatar=" + avatar + "]";
		}
}
