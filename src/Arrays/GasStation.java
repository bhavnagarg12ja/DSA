package Arrays;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        int index = 0;
        int total = 0;
        for(int i = 0; i < gas.length; i++){
            sumGas += gas[i];
            sumCost += cost[i];
        }
        if(sumGas < sumCost) return -1;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                index = i + 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] gas = { 1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int result = canCompleteCircuit(gas, cost);
        System.out.println(result);
    }
}
