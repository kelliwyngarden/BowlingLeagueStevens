package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teamId")
	private int id;
	@Column(name = "teamName")
	private String teamName;
	@Column(name="teamType")
	private String teamType;
	@Column(name="preferredNight")
	private String preferredNight;
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int id, String teamName, String teamType, String preferredNight) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.teamType = teamType;
		this.preferredNight = preferredNight;
	}
	
	

	public Team(String teamName, String teamType, String preferredNight) {
		super();
		this.teamName = teamName;
		this.teamType = teamType;
		this.preferredNight = preferredNight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	public String getPreferredNight() {
		return preferredNight;
	}

	public void setPreferredNight(String preferredNight) {
		this.preferredNight = preferredNight;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", teamType=" + teamType + ", preferredNight="
				+ preferredNight + "]";
	}
	
	
	
	
}
