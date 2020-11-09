class Solution {
    public double average(int[] salary) {
        int max = salary[0], min = salary[0];
        long sum = 0;
        for(int i = 0 ;i < salary.length; i ++){
            sum = sum + salary[i];
            max = Math.max(salary[i], max);
            min = Math.min(salary[i], min);
        }
        sum = sum - max - min;
        return 1.0 * sum / (salary.length - 2);     
    }
}