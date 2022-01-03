package gwaje_file.Computer;

public class Computer_Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Cooler cooler = new Cooler();
        Ram ram = new Ram();
        cpu.setCpu("Ryzen 5900x");
        cpu.cpuPlus();
        cooler.setCooler("기본쿨러");
        cooler.coolerPlus();
        ram.setRam("PC4-25600 16GB");
        ram.ramPlus();
        //... 등등등
        
        //System.out.println(cpu.getCpu());
        if(cpu.getCpu()==null || cooler.getCooler()==null || ram.getRam()==null) {
            System.out.println("조립여부 : 부품 상태를 확인해 주십시오.");
        }else{
            System.out.println("조립여부 : 조립완료");
        }
    }
}
