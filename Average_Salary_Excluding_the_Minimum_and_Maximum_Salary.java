class Solution {
    public double average(int[] salary) {
        double maxSalary,minSalary;
        if(salary[0]>salary[1]){
            maxSalary= salary[0];
            minSalary= salary[1];
        } else {
            maxSalary= salary[1];
            minSalary= salary[0];
        }
        for(int i=2;i<salary.length;i++){
            if(salary[i]>maxSalary)
                maxSalary=salary[i];
            else if(salary[i]<minSalary)
                minSalary=salary[i];
        }
        double sum=0;
        int count=0;
        for(double x:salary){
            if(x!=minSalary && x!=maxSalary){
                sum+=x;
                count++;
            }
        }
        return sum/count;
    }
}
