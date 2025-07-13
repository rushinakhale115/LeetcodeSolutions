class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int m=players.length;
        int n=trainers.length;
        int i=0; 
        int j=0;
        int count=0;
        while(i<m && j<n)
        if(players[i]<=trainers[j]){
            i++;
            j++;
            count++;
        }
        else{
            j++;
        }

        return count++;
    }
}