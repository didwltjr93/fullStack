package gwaje_file;

public class Nation_Jin_parent {

    private String naraName = "진";
    public int naraArea = 112000;
    public int naraIngu = 2500000;
    static String planet = "지구";
/*
    String setnaraName(){
        return naraName = "진국";
    }

    void getnaraName() {
        String naraName;
    }

    int setnaraArea() {
        return naraArea;
    }

    void getnaraArea() {
        int naraArea = 112000;
    }

    int setnaraIngu() {
        return naraIngu;
    }

    void getnaraIngu() {
        int naraIngu = 2500000;
    }*/
    
    @Override
    public String toString(){

        return  "행성이름 : "  +planet +"\n" 
                +"나라이름 : " + naraName + "국\n" 
                +"나라면적 : " + naraArea + "km²\n" 
                +"나라인구 : " + naraIngu + "명\n" 
                ;
    }
}
