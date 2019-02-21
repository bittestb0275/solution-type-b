package problem04;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		boolean[] bridge = new boolean[20];
		String[] outputBridge = new String[20];
		
		Random randomGenerator = new Random();
		
	    for (int idx = 1; idx <= 20; idx++){
	      boolean randomBool = randomGenerator.nextBoolean();
	      bridge[idx-1] = randomBool;
	      if(bridge[idx-1]) outputBridge[idx-1] = "O";
	      else outputBridge[idx-1] = "#";
	    }
	    System.out.println(Arrays.toString(outputBridge));
	    boolean flag = true;
	    int standNum = -1;
	    
	    do {
	    	Scanner input = new Scanner(System.in);
		    int num = input.nextInt();
		    standNum += num;
		    if(!bridge[standNum]){
		    	flag = false;
		    	System.out.println("실패");
		    }
		    else {
		    	if(standNum >= 20) {System.out.println("건너기 성공");}
		    	else{
		    		System.out.println(Arrays.toString(outputBridge));
		    		System.out.println("현재 위치 :" + (standNum+1));
		    	}
		    }
		    
	    }while(flag);
	    		
	}

	
}