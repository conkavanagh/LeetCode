class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        List<String> temp;
        if (ruleKey.equals("type"))
        {
            for(int i=0; i<items.size(); i++)
            {
                temp = items.get(i);
                if(temp.get(0).equals(ruleValue)) count++;
            }
        }
        else if (ruleKey.equals("color"))
        {
            for(int i=0; i<items.size(); i++)
            {
                temp = items.get(i);
                if(temp.get(1).equals(ruleValue)) count++;
            }
        }
        else if (ruleKey.equals("name"))
        {
            for(int i=0; i<items.size(); i++)
            {
                temp = items.get(i);
                if(temp.get(2).equals(ruleValue)) count++;
            }
        }
        return count;
    }
}