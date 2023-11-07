class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count = 0, top = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<students.length; i++) q.add(students[i]);
        int size = q.size();

        while(!q.isEmpty() && count <= size)
        {
            if(q.peek() == sandwiches[top])
            {
                q.poll();
                count=0;
                size--;
                top++;
            }
            else{
                q.add(q.poll());
                count++;
            }
        }
        return q.size();
    }
}