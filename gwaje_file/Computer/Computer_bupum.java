package gwaje_file.Computer;

public class Computer_bupum {
    
    String cpu;
    String cooler;
    String ram;
    String board;
    String gpu;
    String nvme;
    String ssd;
    String hdd;
    String power;
    String cAse;
    String keyboard;
    String mOuse;
    String moniTor;

}


class Cpu extends Computer_bupum {

    String getCpu() {
        return cpu;
    }

    void setCpu(String cpu) {
        this.cpu = "Ryzen 5900x";
    }
    
    void cpuPlus() {
        if(this.getCpu()=="Ryzen 5900x") {
            System.out.println("CPU장착 여부 : CPU 장착 완료");
        }else{
            System.err.println("CPU장착 여부 : CPU를 장착해주세요.");
        }
    }
}

class Cooler extends Computer_bupum {

    String getCooler(){
        return cooler;
    }

    void setCooler(String cooler){
        this.cooler = "기본쿨러";
    }
    
    void coolerPlus() {
        if(this.getCooler()=="기본쿨러") {
            System.out.println("쿨러 장착 여부 : 쿨러 장착 완료");
        }else{
            System.err.println("쿨러장착 여부 : 쿨러를 장착해주세요.");
        }
    }
}

class Ram extends Computer_bupum {

    String getRam() {
        return ram;
    }

    void setRam(String ram){
        this.ram = "PC4-25600 16GB";
    }

    void ramPlus (){
        if(this.getRam()=="PC4-25600 16GB") {
            System.out.println("램 장착 여부 : 램 장착 완료");
        }else{
            System.err.println("램 장착 여부 : 램를 장착해주세요.");
        }
    }
}