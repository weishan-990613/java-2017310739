package pack1;

public class PC {
	HardDisk HD;
	CPU cpu;
	void setcpu(CPU cpu){
		this.cpu = cpu;
	}
	void setHardDisk(HardDisk HD){
		this.HD = HD;
	}
	void show(){
	System.out.println(cpu.getspeed());
	System.out.println(HD.getAmount());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
