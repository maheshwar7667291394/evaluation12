package com.masai;

public class Gym {
	
	private Integer gym_id;
	private String gym_name ;
	private int monthly_fee;
	
	public Gym() {}

	public Gym(Integer gym_id, String gym_name, int monthly_fee) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
	}

	public Integer getGym_id() {
		return gym_id;
	}

	public void setGym_id(Integer gym_id) {
		this.gym_id = gym_id;
	}

	public String getGym_name() {
		return gym_name;
	}

	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}

	public int getMonthly_fee() {
		return monthly_fee;
	}

	public void setMonthly_fee(int monthly_fee) {
		this.monthly_fee = monthly_fee;
	}

	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + "]";
	}
	
	

}
