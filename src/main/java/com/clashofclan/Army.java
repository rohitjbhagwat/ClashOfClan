package com.clashofclan;

public class Army {

	private double damagePerHit;

	private double hitPoints;

	private String name;

	private double strength;

	public Army(String name,double damagePerHit, double hitPoints, double strength){
		this.name = name;
		this.damagePerHit = damagePerHit;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String attack(Army troops){
		double result_1 = 0, result_2 = 0;
		result_1  = Math.ceil(troops.getHitPoints()/ damagePerHit) * troops.getStrength();
		result_2  = Math.ceil(hitPoints / troops.getDamagePerHit()) * strength;
		if(result_1 > result_2){
			return troops.getName() +" wins";
		}else {
			return name + " wins";
		}
	}

	public double getDamagePerHit() {
		return damagePerHit;
	}

	public void setDamagePerHit(double damagePerHit) {
		this.damagePerHit = damagePerHit;
	}

	public double getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(double hitPoints) {
		this.hitPoints = hitPoints;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

}
