class Solution {
    public int totalMoney(int n) {
      int days = n % 7; // 6
      int weeks = n/7; // 2
      int totalDays = 0;
      int dayCount = weeks;
      for(int i = 0; i<days;i++)
      {
        totalDays +=++dayCount;
      }
      if(weeks==0) return totalDays;

      // Amount for x week = (21 + (x * 7))!
      int totalWeeks = 0;
      while(weeks>0)
      {
        totalWeeks += 21 + (weeks--*7);
      }
      return totalDays + totalWeeks;
    }
}