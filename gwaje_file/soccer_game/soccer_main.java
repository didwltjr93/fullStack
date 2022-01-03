package helloWorld.src.gwaje_file.soccer_game;

public class soccer_main {
    public static void main(String[] args) {
        soccer_game sg = new soccer_game();
        soccer_team st = new soccer_team();
        soccer_player01 player01 = new soccer_player01();
        soccer_player02 player02 = new soccer_player02();

        //사커게임
        System.out.println(sg.toString());
        
        //사커팀
        System.out.println(st.toString());

        //플레이어01
        System.out.println(player01.toString());

        //플레이어02
        System.out.println(player02.toString());

        if(player01.getScore() < player02.getScore()) {
            System.out.println("정치하면던짐 : "+player01.getScore()+" / 노빠꾸레게노 : "+player02.getScore());
            System.out.println("노빠꾸레게노님이 승리하셨습니다.");
        }else if(player01.getScore() > player02.getScore()) {
            System.out.println("정치하면던짐 : "+player01.getScore()+" / 노빠꾸레게노 :  "+player02.getScore());
            System.out.println("정치하면던짐님이 승리하셨습니다.");
        }else{
            System.out.println("정치하면던짐 : "+player01.getScore()+" / 노빠꾸레게노 :  "+player02.getScore());
            System.out.println("무승부입니다.");
        }
    }
}
