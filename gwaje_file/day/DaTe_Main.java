package gwaje_file.day;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DaTe_Main {
    public static void main(String[] args) {
        
        Date dt = new Date();

        SimpleDateFormat day = new SimpleDateFormat("아 오늘의 날짜는 큿흠 대략 말입니다? yyyy년 mm월 dd일 입니다만은...?\n");
        SimpleDateFormat time = new SimpleDateFormat("시간은 대략... hh시 mm분 ss초 일듯 하군요");

        System.out.println(day.format(dt)+time.format(dt));

    }    
}
