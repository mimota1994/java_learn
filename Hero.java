package learn_for_java;

public class Hero {

	String name;
	float hp;
	float armor;
	int moveSpeed;
	int deaths;
	int kill_nums;
	int assists;
	int money;
	int last_few;
	int attackcount;
	String killwword;
	String bekilledword;
	
	void keng(){
		System.out.println("坑队友！！！");
	}
	
	float getArmor(){
		return armor;
	}
	
	void addSpeed(int speed){
		moveSpeed=moveSpeed+speed;
	}
	
	void legendary(){
		System.out.println("超神");
	}
	
	float getHp(){
		return hp;
	}
	
	void recovery(float blood){
		hp=hp+blood;
	}
	
	
	public static void main(String[] args) {
		Hero garen=new Hero();
		garen.name="盖伦";
		garen.hp=616.28f;
		garen.armor=27.536f;
		garen.moveSpeed=350;
		garen.addSpeed(100);
		
		
		Hero teemo=new Hero();
		teemo.name="提莫";
		teemo.hp=383f;
		teemo.armor=14f;
		teemo.moveSpeed=330;
				
	}

}
