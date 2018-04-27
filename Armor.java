package learn_for_java;

public class Armor extends Item{
	int ac;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Armor quiltedArmor=new Armor();
		quiltedArmor.name="布甲";
		quiltedArmor.price=300;
		quiltedArmor.ac=15;
		
		Armor huberk=new Armor();
		huberk.name="锁子甲";
		huberk.price=500;
		huberk.ac=40;

	}

}
