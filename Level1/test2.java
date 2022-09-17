package Level1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        
        for(int i=0; i<a; i++) {
        	for(int j=0; j<i+1; j++) {
        		sb.append("*");
        	}
        	sb.append("\n");
        }

        System.out.println(sb);
    }
}
