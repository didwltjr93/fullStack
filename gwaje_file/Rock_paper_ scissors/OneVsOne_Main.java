package gwaje_file.OneVsOne;

public class OneVsOne_Main {
    public static void main(String[] args) {
        firstMan fm = new firstMan();
        secondMan sm = new secondMan();

        if( fm.num == 0 ) {
            fm.setString("가위");
        }else if( fm.num == 1 ) {
            fm.setString("바위");
        }else if (fm.num == 2) {
            fm.setString("보");
        }

        if( sm.num == 0 ) {
            sm.setString("가위");
        }else if( sm.num == 1 ) {
            sm.setString("바위");
        }else if (sm.num == 2) {
            sm.setString("보");
        }

        System.out.println("첫번째 선수가 낸 것은 : "+fm.getsString());
        System.out.println("두번째 선수가 낸 것은 : "+sm.getsString());

        fm.setName("");
        sm.setName("");
        
            if ((sm.num == 0 && fm.num == 1)
             || (sm.num == 1 && fm.num == 2)
             || (sm.num == 2 && fm.num == 0) ) {
                System.out.println("승자는 "+fm.getName()+"님 입니다.");
            }else if ((sm.num == 1 && fm.num == 0)
            || (sm.num == 2 && fm.num == 1)
            || (sm.num == 0 && fm.num == 2) ) {
                System.out.println("승자는 "+sm.getName()+"님 입니다.");
            }else{
                System.out.println("무승부 입니다.");
            }
    }
}

class sunsoo {

    String name;
    String str;

    int num = (int)(Math.random()*3);
}

class firstMan extends sunsoo {

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name = "'첫번째 선수'";
    }

    public String getsString() {
        return str;
    }

    public String setString(String str) {
        this.str = str;
        return str;
    }
}

class secondMan extends sunsoo {

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name = "'두번째 선수'";
    }

    public String getsString() {
        return str;
    }

    public String setString(String str) {
        this.str = str;
        return str;
    }
}
