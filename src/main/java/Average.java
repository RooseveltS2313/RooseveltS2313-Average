
public class Average {
    /**
     * Now that we can get the sum of all numbers in an array, we could also figure out how to get the average of an
     * array. The return type of this method double, so a decimal value is expected (as is common in averages).
     *
     * Part of the challenge is that the method recieves an array of ints, which do not produce decimal values
     * even in operations where they should! (eg: 3/2=1 if 3 is of type int.)
     *
     * So, before you divide the sum of all numbers by the amount of numbers in order to produce the average,
     * you'll need do convert the sum to type double. How can we do that?
     *
     * One of the best resources for answering technical questions is StackOverflow. You should familiarize yourself
     * with that site. Here is someone asking how an int might be converted into a double, with several
     * answers to her question: https://stackoverflow.com/questions/13252903/i-need-to-convert-an-int-variable-to-double
     *
     * @param nums an array to be manipulated.
     * @return the average of all the values of nums.
     */
    public double getAvg(int[] nums){
        double sum = 0;
        int size = nums.length;
        // Reading implies that casting the input int values to a double is the only way implicitly or otherwise
        // Since variable 'sum' is already a double, the operation is double sum.0 / int size which casts the result to the numerator which is a double
        for (int i = 0; i < size; i++){ sum += nums[i];}
        return sum/size;
    }
}
