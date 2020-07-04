package com.company;

public class Main {
    int B[];
    public int[] solution(int[] A, int K) {
        B=new int[A.length];
        for(int x = 0; x <= A.length-1; x++){
            B[(x+K) % A.length ] = A[x];//b[3]=3 ,b[4]=8,b[0]=9,b[1]=7,b[2]=6
        }
        return B;

    }
    public static void main(String[] args) {
	// write your code here

    }
}
