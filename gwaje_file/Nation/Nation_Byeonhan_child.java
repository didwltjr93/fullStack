package helloWorld.src.gwaje_file.Nation;

public class Nation_Byeonhan_child extends Nation_Jin_parent {

    private String naraName;
    public int naraArea;
    public int naraIngu;
    static String planet;

    int a=1;

    @Override
    public String toString(){

        this.setnaraName("");
        this.setnaraArea();
        this.setnaraIngu();

        return  "행성이름 : "  + Nation_Jin_parent.planet +"\n" 
                +"나라이름 : " + this.getnaraName() + "국\n" 
                +"나라면적 : " + this.getnaraArea() + "km²\n" 
                +"나라인구 : " + this.getnaraIngu() + "명\n" 
                ;
                
    }

    void setnaraName(String naraName){
        this.naraName = "변한";
    }

    String getnaraName(){
        return naraName;
    }

    void setnaraArea(){
        this.naraArea = 22400;
    }

    int getnaraArea(){
        return naraArea;
    }

    void setnaraIngu(){
        this.naraIngu = 500000;
    }

    int getnaraIngu(){
        return naraIngu;
    }

    void conquest() {
        for (int i = 1 ; i <= 2 ; i++) {
            if(a == 1) {
                System.out.println("변한이 정복을 시작했습니다.");
                this.naraArea += 1000;
                this.naraIngu -= 1000;
                System.out.println(     "나라면적 : "+this.naraArea + "km²"
                                        +"\n나라인구 : "+this.naraIngu + "명"
                                    );
                this.a = 2;
            }else if(a == 2 ) {
                System.out.println("변한이 정복을 그만두었습니다.");
            }
        } 
    }
}
