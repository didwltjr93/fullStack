package gwaje_file;

class Nation_Mahan_child extends Nation_Jin_parent {
        
    private String naraName;
    public int naraArea;
    public int naraIngu;
    static String planet;

    int a=1;

    @Override
    public String toString(){

        return  "행성이름 : "  + Nation_Jin_parent.planet +"\n" 
                +"나라이름 : " + this.setnaraName() + "국\n" 
                +"나라면적 : " + this.setnaraArea() + "km²\n" 
                +"나라인구 : " + this.setnaraIngu() + "명\n" 
                ;
    }

    String setnaraName(){
        return naraName = "마한";
    }

    void getnaraName(){
        String naraName;
    }

    int setnaraArea(){
        return naraArea = 56000;
    }

    void getnaraArea(){
        int naraArea;
    }

    int setnaraIngu(){
        return naraIngu = 1250000;
    }

    void getnaraIngu(){
        int naraIngu;
    }

    void conquest() {
        for (int i = 1 ; i <= 2 ; i++) {
            if(a == 1) {
                System.out.println("마한이 정복을 시작했습니다.");
                this.naraArea += 1000;
                this.naraIngu -= 1000;
                System.out.println(     "나라면적 : "+this.naraArea + "km²"
                                        +"\n나라인구 : "+this.naraIngu + "명"
                                    );
                this.a = 2;
            }else if(a == 2 ) {
                System.out.println("마한이 정복을 그만두었습니다.");
            }
        } 
    }


}
