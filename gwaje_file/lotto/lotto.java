package helloWorld.src.gwaje_file.lotto;

import java.util.*;

public class lotto {
    public static void main(String[] args) {
        Arrangement argm = new Arrangement();
        argm.recommendation();
    }
}

class Arrangement {

    void recommendation () {                                //반환받으면 귀찮으니까 보이드로 메소드 생성

        int[] bAll = new int[6];                            //로또는 6개 구슬로 한다함.
        for (int x = 0 ; x < bAll.length ; x++) {           //배열로 구슬 6개 반복문 지정
            bAll[x] = (int)(Math.random()*45)+1;            //배열에 매스랜덤 45개

            for(int y = 0 ; y < bAll.length ; y ++) {       //중첩포문으로 유효성 체크
                if(bAll[x] == bAll[y]) {                    //중복 숫자 브레이크
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(bAll));          //어레이즈.투스트링(배열명) = 배열객체의 내용물을 스트링화 시켜서 보여줌.
    }
}
