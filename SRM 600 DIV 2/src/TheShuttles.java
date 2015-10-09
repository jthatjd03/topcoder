public class TheShuttles {

    public int getLeastCost(int[] cnt, int baseCost, int seatCost) {
        int maxNumberInArray = 0;
        for (int count : cnt) {
            if (maxNumberInArray < count) {
                maxNumberInArray = count;
            }
        }
        int minCost = Integer.MAX_VALUE;
        for (int numSeatsInBus = 1; numSeatsInBus <= maxNumberInArray; numSeatsInBus++) {
            int max = 0;
            for (int count : cnt) {
                int numBuses = count % numSeatsInBus == 0 ? count / numSeatsInBus : count / numSeatsInBus + 1;
                int cost = baseCost + numSeatsInBus * seatCost;
                int indexCost = numBuses * cost;
                max += indexCost;
            }

            minCost = Math.min(max, minCost);
        }
        return minCost;
    }
}
