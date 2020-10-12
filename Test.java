package pack1;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu = new CPU();
		cpu.setspeed(2200);
		HardDisk disk = new HardDisk();
		disk.setAmount(200);
		PC pc = new PC();
		pc.setcpu(cpu);
		pc.setHardDisk(disk);
		pc.show();
     
	}

}
