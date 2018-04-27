package learn_for_java;

public class Support extends Hero{
	
	public void heal(){
		
	}
	public void heal(Hero h){
		
	}
	public void heal(Hero h,int hp){
		h.recovery(hp);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen=new Hero();
		garen.name="盖伦";
		garen.hp=616.28f;
		garen.armor=27.536f;
		garen.moveSpeed=350;
		garen.addSpeed(100);
		
		Support taranda=new Support();
		taranda.heal(garen, 100);
		System.out.println(garen.hp);

	}

}
