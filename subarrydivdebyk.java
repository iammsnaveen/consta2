
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         int[] mods = new int[k]; // Create an array to count the frequency of each mod value
    mods[0] = 1; // Initialize mods[0] to 1 to handle the case when the entire subarray is divisible by B
    int sum = 0, count = 0;
    for (int num : nums) {
        sum = (sum + num) % k; // Calculate the current mod value
        if (sum < 0) { // Handle negative mod values
            sum += k;
        }
        count += mods[sum]; // Add the frequency of the current mod value to the count
        mods[sum]++; // Increment the frequency of the current mod value
    }
    return count;
    }
}



public static int subarraysDivByB(int[] A, int B) {
    int[] mods = new int[B]; // Create an array to count the frequency of each mod value
    mods[0] = 1; // Initialize mods[0] to 1 to handle the case when the entire subarray is divisible by B
    int sum = 0, count = 0;
    for (int num : A) {
        sum = (sum + num) % B; // Calculate the current mod value
        if (sum < 0) { // Handle negative mod values
            sum += B;
        }
        count += mods[sum]; // Add the frequency of the current mod value to the count
        mods[sum]++; // Increment the frequency of the current mod value
    }
    return count;
}
