package helloWorld.src.gwaje_file.soccer_game;

public class soccer_game {

    private String teamName="팀 이름을 입력해주세요.";
    public String manName="닉네임을 입력해주세요.";
    public int overRall=00;
    

    @Override
    public String toString(){
        return  "팀이름 : "+teamName+" 입니다\n"
               +"선수명 : "+manName+" 입니다\n"
               +"능력치 : "+overRall+" 입니다\n";

    }
}

class soccer_team extends soccer_game{
    
    int round;
    

    void vs (){
        
        /*if( soccer_player01.getScore() > soccer_player02.getScore() ) {
            System.out.println("승리하였습니다.");
        }else{
            System.out.println("패배하였습니다.");
        }*/
    }
}

class soccer_player01 extends soccer_team{

    private String teamName;
    public String manName;
    public int overRall;
    public int fight_score;

    @Override
    public String toString(){

        this.setTeamName("");
        this.setManName("");
        this.setOverRall(00);
        this.setScore(00);

        return  "팀이름 : "+teamName+" 입니다.\n"
               +"선수명 : "+manName+" 입니다.\n"
               +"능력치 : "+overRall+" 입니다.\n"
               +"득점 : "+fight_score+" 입니다.\n";

    }

    void setTeamName(String teamName){
        this.teamName = "수원FC";
    }
    
    String getTeamName () {
        return teamName;
    }

    void setManName(String manName){
        this.manName = "정치하면던짐";
    }

    String getManName() {
        return manName;
    }

    void setOverRall(int overRall) {
        this.overRall = 69;
    }

    int getOverRall() {
        return overRall;
    }

    void setScore(int fight_score) {
        this.fight_score = (int)(Math.random()*10);
    }

    int getScore() {
        return fight_score;
    }
}

class soccer_player02 extends soccer_team{

    private String teamName;
    public String manName;
    public int overRall;
    public int fight_score;

    @Override
    public String toString(){

        this.setTeamName("");
        this.setManName("");
        this.setOverRall(00);
        this.setScore(00);

        return  "팀이름 : "+teamName+" 입니다\n"
               +"선수명 : "+manName+" 입니다\n"
               +"능력치 : "+overRall+" 입니다\n"
               +"득점 : "+fight_score+" 입니다.\n";

    }

    void setTeamName(String teamName){
        this.teamName = "울산 현대";
    }
    
    String getTeamName () {
        return teamName;
    }

    void setManName(String manName){
        this.manName = "노빠꾸레게노";
    }

    String getManName() {
        return manName;
    }

    void setOverRall(int overRall) {
        this.overRall = 85;
    }

    int getOverRall() {
        return overRall;
    }

    void setScore(int fight_score) {
        this.fight_score = (int)(Math.random()*10);
    }

    int getScore() {
        return fight_score;
    }
}