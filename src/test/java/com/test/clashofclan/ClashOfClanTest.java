package com.test.clashofclan;

import org.junit.Assert;
import org.junit.Test;

import com.clashofclan.Army;

public class ClashOfClanTest {

	@Test
	public void shouldSetDefenceProperties(){
		double hitPoints = 390.0;
		double damagePerHit = 10.0;
		Army defence = new Army("Defence", damagePerHit, hitPoints, 1);
		Assert.assertEquals(defence.getDamagePerHit(),damagePerHit,0.1);
		Assert.assertEquals(defence.getHitPoints(),hitPoints,0.1);
	}

	@Test
	public void shouldAttackDefense(){
		Army defense = new Army("Defence", 10, 390, 1);
		Army troops = new Army("Barbarian", 8, 45, 1);
		Assert.assertTrue(defense.attack(troops).contains("Defence"));

	}

	@Test
	public void shouldAttackDefenseWithStrength(){
		Army defense = new Army("Defence", 10, 390, 1);
		Army troops = new Army("Barbarian", 8, 45, 10);
		Assert.assertTrue(defense.attack(troops).contains("Barbarian"));

	}

}
