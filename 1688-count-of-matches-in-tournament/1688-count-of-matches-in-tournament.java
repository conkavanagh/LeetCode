class Solution {
    public int numberOfMatches(int n) {
        int numberOfTeams = n;
        int numberOfMatches = 0;
        while (numberOfTeams >1)
        {
            if(numberOfTeams % 2 == 0) // Even
            {
                numberOfTeams /=2;
                numberOfMatches += numberOfTeams;
            }
            else
            {
               numberOfTeams /=2;
               numberOfMatches += numberOfTeams++;
            }
        }
        return numberOfMatches;
    }
}