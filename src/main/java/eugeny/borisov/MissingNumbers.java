package eugeny.borisov;

public class MissingNumbers {

    //The condition of the problem does not indicate whether it is necessary to search for the missing number
    //if the input array is already arranged in order. To enable/disable this function, add a special flag
    //to the method arguments
    public int findMissingNumber(int[] numbersArray, boolean addNumberInLastPosition) { //you don't need the second param for this task
        int result = -1;
        int n = numbersArray.length;

        //if the input array of numbers is empty, return -1 as a result
        if (n < 1) { //it will be better if n<2
            return result;
        }

        //To find the missing number, use the Gaussian summation formula to calculate the sum of the progression
        //using the length of the array
        int progressionSum = (n * (n + 1)) / 2;

        //To find the lost number, we need to find the sum of all the numbers in the array.
        int numbersSum = 0;

        //The numbers in the array do not always start from '0', you need to bring them to a common form with
        //a progression. To do this, in addition to the sum of all the numbers in the array, we find the minimal
        //number in the array that will need to be subtracted from each array value
        int min = Integer.MAX_VALUE;

        for (int number : numbersArray) {
            if (number < min) {
                min = number;
            }
            numbersSum += number;
        }

        //If the flag is true, it is necessary to check if there is a missing number in the specified array.
        //To do this, we need to divide the sum of the numbers in the array by the length of the array.
        //If the remainder of the division is 0 or 5, there are no missing numbers, return '-1'.
        if (addNumberInLastPosition) {
            double checkMissingNumbers = (double) numbersSum / n;

            if (checkMissingNumbers % 1 == 0.0 || checkMissingNumbers % 1 == 0.5) {
                return result;
            }
            //if array without a missing number return -1 
        }

        //At the end, the result is given to the order of numbers in the original array.
        //if in the input array all the numbers are already in order (, we consider that the number that is
        //in the last position of the array is missing
        result = progressionSum - (numbersSum - (min * (n))) + min;

        return result;
    }

    //In this algorithm time complexity is O(n), space complexity is O(1).
}
