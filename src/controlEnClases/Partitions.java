package controlEnClases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partitions {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		List<Object> partitions = new ArrayList<Object>();
		List<Integer> eachPartition = new ArrayList<Integer>();
		int N = reader.nextInt();
		int current = N;
		System.out.printf("%d\n", N);
		eachPartition.add(current-1, 1);
		current = current - 1;
		partitions.add(eachPartition);
		while (current > 1){
			current = eachPartition.get(0);
			current = current -1;
			eachPartition.remove(0);
			eachPartition.add(1);
			eachPartition.add(current);
			partitions.add(eachPartition);
			
		}
		
		
		
		
		
		
		
		reader.close();
	}

}
