package edu.swjtuhc.demo.model;

public class SysUser {
	    int Id;
		String username;
		String passwrod;
		String name;
		int age;
		String gender;
		String avatar;
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return passwrod;
		}
		public void setPassword(String password) {
			this.passwrod = passwrod;
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
			return "SysUser [Id=" + Id + ", username=" + username + ", passname=" + passwrod + ", name=" + name
					+ ", age=" + age + ", gender=" + gender + ", avatar=" + avatar + "]";
		}
		
	
}
