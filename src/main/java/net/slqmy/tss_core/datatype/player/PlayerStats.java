package net.slqmy.tss_core.datatype.player;

public class PlayerStats {

  private int joinCount;

  public PlayerStats() {

  }

  public int getJoinCount() {
	return joinCount;
  }

  public void setJoinCount(int joinCount) {
	this.joinCount = joinCount;
  }

  public void incrementJoinCount() {
	joinCount++;
  }
}
