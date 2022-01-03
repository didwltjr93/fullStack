package helloWorld.src.gwaje_file.Nation;

public class Nation_Main {
    public static void main(String[] args) {
        Nation_Jin_parent jinguk = new Nation_Jin_parent();
        Nation_Mahan_child mahan = new Nation_Mahan_child();
        Nation_Jinhan_child jinhan = new Nation_Jinhan_child();
        Nation_Byeonhan_child byeonhan = new Nation_Byeonhan_child();

        
        
        //진국
        System.out.println("멸망한 옛 나라의 정보는 아래와 같습니다.\n"
                            +jinguk.toString()
                            +"\n===================="
                            );

        //마한
        System.out.println("새로운 나라 마한의 정보는 아래와 같습니다.\n"
                            +mahan.toString()
                            +"\n===================="
                            );
        mahan.conquest();
        System.out.println("\n====================");

        //진한
        System.out.println("새로운 나라 진한의 정보는 아래와 같습니다.\n"
                            +jinhan.toString()
                            +"\n===================="
                            );
        jinhan.conquest();
        System.out.println("\n====================");

        //변한
        System.out.println("새로운 나라 변한의 정보는 아래와 같습니다.\n"
                            +byeonhan.toString()
                            +"\n===================="
                            );
        byeonhan.conquest();
        System.out.println("\n====================");
        
        

        }
}
