import java.util.Arrays;

public class ArraysEqualsMethod {
public static void main(String[] args){

int[] A = new int[] {1,2,3};
int[] B = new int[] {1,2,3};
int[] C = new int[] {3,2,1};

int[][] A2D = { { 1, 2 }, { 3, 4 } };
int[][] B2D = { { 1, 2 }, { 3, 4 } };
int[][] C2D = { { 2, 1 }, { 3, 4 } };

// compares the contents of the arrays
System.out.println("A, B are equal: " + Arrays.equals(A, B));
System.out.println("A, C are equal: " + Arrays.equals(A, C));

// Array equals method only works for 1D array
System.out.println("A2D, B2D are equal: " + Arrays.equals(A2D, B2D));
System.out.println("A2D, C2D are equal: " + Arrays.equals(A2D, C2D));
}
}