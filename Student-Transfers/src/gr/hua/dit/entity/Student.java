package gr.hua.dit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Student")
@Entity
@Table(name = "students")
public class Student implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5469500810808512646L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int student_id;

	@Column(name = "student_first_name")
	private String student_first_name;

	@Column(name = "student_last_name")
	private String student_last_name;

	@Column(name = "student_mail")
	private String student_mail;

	@Column(name = "student_password")
	private String student_password;
	
	@Column(name = "student_uni")
	private String student_uni;
	
	@Column(name = "first_choice")
	private String first_choice;
	
	@Column(name = "second_choice")
	private String second_choice;
	
	@Column(name = "same_city_siblings")
	private int same_city_siblings;
	
	@Column(name = "underaged_siblings")
	private int underaged_siblings;
	
	@Column(name = "family_income")
	private int family_income;
	
	@Column(name = "same_city")
	private boolean same_city;

	@Column(name = "student_points")
	private int student_points;
	
	@Column(name = "e1_verified")
	private boolean e1_verified;
	
	@Column(name = "police_identity_verified")
	private boolean police_identity_verified;
	
	@Column(name = "student_identity_verified")
	private boolean student_identity_verified;
	
	@Column(name = "ekkatharistiko_verified")
	private boolean ekkatharistiko_verified;

	public Student() {

	}

	public Student(int student_id, String student_first_name, String student_last_name, String student_mail,
			String student_password, String student_uni, String first_choice, String second_choice,
			int same_city_siblings, int underaged_siblings, int family_income, boolean same_city, int student_points,
			boolean e1_verified, boolean police_identity_verified, boolean student_identity_verified,
			boolean ekkatharistiko_verified) {
		super();
		this.student_id = student_id;
		this.student_first_name = student_first_name;
		this.student_last_name = student_last_name;
		this.student_mail = student_mail;
		this.student_password = student_password;
		this.student_uni = student_uni;
		this.first_choice = first_choice;
		this.second_choice = second_choice;
		this.same_city_siblings = same_city_siblings;
		this.underaged_siblings = underaged_siblings;
		this.family_income = family_income;
		this.same_city = same_city;
		this.student_points = student_points;
		this.e1_verified = e1_verified;
		this.police_identity_verified = police_identity_verified;
		this.student_identity_verified = student_identity_verified;
		this.ekkatharistiko_verified = ekkatharistiko_verified;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_first_name() {
		return student_first_name;
	}

	public void setStudent_first_name(String student_first_name) {
		this.student_first_name = student_first_name;
	}

	public String getStudent_last_name() {
		return student_last_name;
	}

	public void setStudent_last_name(String student_last_name) {
		this.student_last_name = student_last_name;
	}

	public String getStudent_mail() {
		return student_mail;
	}

	public void setStudent_mail(String student_mail) {
		this.student_mail = student_mail;
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}

	public String getStudent_uni() {
		return student_uni;
	}

	public void setStudent_uni(String student_uni) {
		this.student_uni = student_uni;
	}

	public String getFirst_choice() {
		return first_choice;
	}

	public void setFirst_choice(String first_choice) {
		this.first_choice = first_choice;
	}

	public String getSecond_choice() {
		return second_choice;
	}

	public void setSecond_choice(String second_choice) {
		this.second_choice = second_choice;
	}

	public int getSame_city_siblings() {
		return same_city_siblings;
	}

	public void setSame_city_siblings(int same_city_siblings) {
		this.same_city_siblings = same_city_siblings;
	}

	public int getUnderaged_siblings() {
		return underaged_siblings;
	}

	public void setUnderaged_siblings(int underaged_siblings) {
		this.underaged_siblings = underaged_siblings;
	}

	public int getFamily_income() {
		return family_income;
	}

	public void setFamily_income(int family_income) {
		this.family_income = family_income;
	}

	public boolean isSame_city() {
		return same_city;
	}

	public void setSame_city(boolean same_city) {
		this.same_city = same_city;
	}

	public int getStudent_points() {
		return student_points;
	}

	public void setStudent_points(int student_points) {
		this.student_points = student_points;
	}

	public boolean isE1_verified() {
		return e1_verified;
	}

	public void setE1_verified(boolean e1_verified) {
		this.e1_verified = e1_verified;
	}

	public boolean isPolice_identity_verified() {
		return police_identity_verified;
	}

	public void setPolice_identity_verified(boolean police_identity_verified) {
		this.police_identity_verified = police_identity_verified;
	}

	public boolean isStudent_identity_verified() {
		return student_identity_verified;
	}

	public void setStudent_identity_verified(boolean student_identity_verified) {
		this.student_identity_verified = student_identity_verified;
	}

	public boolean isEkkatharistiko_verified() {
		return ekkatharistiko_verified;
	}

	public void setEkkatharistiko_verified(boolean ekkatharistiko_verified) {
		this.ekkatharistiko_verified = ekkatharistiko_verified;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_first_name=" + student_first_name
				+ ", student_last_name=" + student_last_name + ", student_mail=" + student_mail + ", student_password="
				+ student_password + ", student_uni=" + student_uni + ", first_choice=" + first_choice
				+ ", second_choice=" + second_choice + ", same_city_siblings=" + same_city_siblings
				+ ", underaged_siblings=" + underaged_siblings + ", family_income=" + family_income + ", same_city="
				+ same_city + ", student_points=" + student_points + ", e1_verified=" + e1_verified
				+ ", police_identity_verified=" + police_identity_verified + ", student_identity_verified="
				+ student_identity_verified + ", ekkatharistiko_verified=" + ekkatharistiko_verified + "]";
	}

	

	
	
}
