package com.bv.model;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Registration extends ActionSupport {

	private String username;
	private String password;
	private String confirmpassword;
	private String gender;
	private int age;
	private Date dob;
	private String mobileno;
	private String occupation;
	private String role;
	private String expertise;
	private String[] skills;
	private String aboutyourself;
	private String email;
	private String hobbies;
	private double percentage;

	private File userImage;
	private String userImageContentType;
	private String userImageFileName;

	public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

	public String getUserImageContentType() {
		return userImageContentType;
	}

	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}

	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}

	private String destPath;

	public String getDestPath() {
		return destPath;
	}

	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// @RequiredStringValidator(message = "Please select gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getAboutyourself() {
		return aboutyourself;
	}

	public void setAboutyourself(String aboutyourself) {
		this.aboutyourself = aboutyourself;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public void validate() { if(username.equals("sai")&& password.equals("pass"))
	 * { addActionMessage("Valid User"); } else {
	 * addActionError("Invalid Credential"); } }
	 */

	/*
	 * public void validate() {
	 * 
	 * if(username == null || username.equals("")) { addFieldError("username",
	 * "The name is required"); }
	 */

	/*
	 * if(age < 18 || age > 65) { addFieldError("age",
	 * "Age must be between 18 and 65"); }
	 * 
	 * if(!(password.contains("@") || password.contains("#") ||
	 * password.contains("&") || password.contains("$"))) {
	 * addFieldError("password", "Please use alphanumeric character"); }
	 * if(password.length() < 6 && password.length() > 10) {
	 * addFieldError("password", "Length should be between 6 and 10"); }
	 * 
	 * 
	 * 
	 * if(UserValidation.validate(username, password)) {
	 * addActionMessage("Valid User"); } else {
	 * addActionError("Invalid Credential"); } }
	 */

	public String execute() throws Exception {

		if (username.equals("John")) {
			try {

				String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("userimages");

				System.out.println("Image Location:" + filePath);// see the server console for actual location
				File fileToCreate = new File(filePath, userImageFileName);
				FileUtils.copyFile(userImage, fileToCreate);// copying source file to new file

				/*
				 * destPath = "C:\\apache-tomcat-9.0.21\\work"; File destfile = new
				 * File(destPath , filename); FileUtils.copyDirectory(myFile, destfile);
				 */
				addActionMessage("Valid User");

			} catch (Exception e) {
				System.out.println(e);
			}
			return SUCCESS;
		} else {
			return ERROR;
		}

	}
}
