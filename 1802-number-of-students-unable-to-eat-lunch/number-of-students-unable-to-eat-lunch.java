class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> que = new LinkedList<>();

        for(int i=sandwiches.length-1;i>=0;i--) st.push(sandwiches[i]);
        for(int i=0;i<students.length;i++) que.add(students[i]);

        //1 int student = que.poll();
        //2 int sandwich = st.peek();
        //3 student != sandwich
        //3.1 que.add(student)
        //4 student == sandwich
        //4.1 st.pop();
        //5. !que.isEmpty() && skipCnt != que.size()
        int skipCnt = 0;
        while(!que.isEmpty() && skipCnt!=que.size()){
            int student = que.poll();
            if(student == st.peek()){
                int sand = st.pop();
                skipCnt = 0;
            }else{
                que.add(student);
                skipCnt++;
            }
        }

        return que.size();
    }
}