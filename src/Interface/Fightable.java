package Interface;

public interface Fightable {
	public int melee();
	public int doMelee();
	public int range();
	public int doRange();
	public int dodge();
	public int doDodge();
	public int block();
	public int takeDamage(int dmg);
	public int dotakeDamage();
	public int dead();
}
