package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "phoneName")
	private String phoneNumber;
	@Column(name = "screenName")
	private String screenName;
	@ManyToOne
	@JoinColumn(name = "teamId")
	private Team team;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String firstName, String lastName, String phoneNumber, String screenName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.screenName = screenName;
	}

	public Player(String firstName, String lastName, String phoneNumber, String screenName, Team team) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.screenName = screenName;
		this.team = team;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	
	@Override
	public String toString() {
		return "player [playerId=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", screenName=" + screenName + ", team=" + team + ", getPlayerId()=" + getPlayerId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getScreenName()=" + getScreenName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
