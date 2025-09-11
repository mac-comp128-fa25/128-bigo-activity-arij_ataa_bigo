package orderNotationActivity;

import java.util.Random;

// Activity Readme can be found here:
// https://docs.google.com/document/d/1UTI-1HLoBwvOo67ZwsHYjArW6qgxBYbsyiaDNri2tA0/edit?usp=sharing

public class BigODrill {

    /**
     * (1)
     * Demonstrates an algorithm with a constant run time, O(1)
     * @param numArr - an int array numArr
     * @return the last element of the array numArr
     */
    public static int constantTime(int[] numArr) {
        //TODO: Add the code that returns the last element of the input array with O(1) run time
        return numArr[-1]; // Placeholder to make it compile. Replace me with the correct value.
    }


    /**
     * (2)
     * Demonstrates an algorithm with a linear run time, O(n)
     * @param numArr - an integer array
     * @return the input array where each element of the array is multiplied with itself
     */
    public static int[] linearTime(int[] numArr) {
        //TODO: Add the code to modify and return the input array with each element squared
        // which performs in O(n)
        for (int i = 0; i < numArr.length;i++){
            numArr[i] = numArr[i] * numArr[i]; 


        }

        return numArr;
    }
    // this is an algorithm with a runtime of O(N), as we ar iterating through the array once and changing every element.

    /**
     * (3)
     * Demonstrates an algorithm with TODO: What is O( ? ) of the following code?
     * @param numArr - an integer array
     */
    public static int[] puzzle03(int[] numArr) {
        //TODO: What does the following code do?
        int index2 = 0;
        int[] tempArr = new int[numArr.length];
        for(int index = 1; index < numArr.length; index = index * 2) {
            tempArr[index2] = numArr[index];
            index2++;
        }
        return tempArr;
    }

    //The big O notation of this algorithm is O(Log(n)), as this function increases the index by an amount suited to powers to 2
    //Log2(1000) would be 10, and a Log2(1000,1000) would be twice as much with 20.
 
    /**
     * (4)
     * Demonstrates an algorithm with TODO: What is the O( ? ) of the following code?
     * @param numArr -  a two dimensional rectangular integer array a.k.a 2D matrix
     * @return a double that represents the sparsity of numArr
     */
    public static double sparsity(int[][] numArr) {
        //TODO: Write the code that calculates and returns the sparsity of the input
        // rectangular integer array numArr
        int totalRow = numArr.length;
        int totaCol = numArr[0].length;
        int total = totalRow * totaCol;
        int zeroCounter = 0;
        for (int x= 0; x < totalRow; x++){
            for (int y = 0; y < totaCol; y++){
                if (numArr[x][y] == 0){
                    zeroCounter++;
                }
            }

        }
        return (zeroCounter / total); // Placeholder to make it compile.

    }
    //Both in the case of 1000 elements and in the case of 1,000,000 elements, the big O notation would be o(N) as we would iterate through the entire array regardless
    //A sparse matrix used to represent the dietary needs of respective animals

    /**
     * (5)
     * Demonstrates an algorithm with TODO: What is the O( ? ) of the following code?
     * @param numArr - two dimensional rectangular integer array a.k.a 2D matrix
     * @param sparsityValue - 0.0-1.0 representing sparsity to make the matrix.
     * @return - numArray overwritten as a sparse matrix with a sparsity of sparsityValue
     */
    public static int[][] sparseMatrix(int[][] numArr, double sparsityValue) {
        assert(sparsityValue >= 0.0 && sparsityValue <= 1.0);
        Random randGenerator = new Random();


        //TODO: Write the code to overwrite the numArr such that it is a sparse matrix
        // with a sparsity of %75

        return numArr;
    }


    public static void main (String[] args){
        //TODO: Write code to run your methods

    }
}
