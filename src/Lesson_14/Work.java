package Lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Work {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void calculate () throws IOException {

        String string = br.readLine();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for ( int i = 0; i < string.length(); i++ ) {
            Integer n = map.get( string.charAt(i));
            if ( n == null ){
                map.put( string.charAt(i), 1 );
            }
            else{
                map.put( string.charAt(i), ++n );
            }
        }
        System.out.println(map);
    }
}

