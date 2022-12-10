package Homeworks;

public class Homework4 {
    
}

// Task 1
// http://joxi.ru/l2ZGMYzilJxnjA

class Solution {
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                } else {
                    matrix[i][j] = m + n;
                }
            }
        }

        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();

                for (int[] dir : dirs) {
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];

                    if (x < 0 || x >= m || y < 0 || y >= n) continue;
                    if (visited[x][y]) continue;

                    matrix[x][y] = step;
                    visited[x][y] = true;
                    queue.offer(new int[]{x, y});
                }
            }

            step++;
        }

        return matrix;
    }
}

//Task2
//http://joxi.ru/gmvDOVMceOP3GA

class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
 
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
 
    public void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
 
    public int pop() {
        if (s1.isEmpty()) {
            throw new IllegalArgumentException("The queue is empty!");
        }
 
        return s1.pop();
    }
 
    public int peek() {
        if (s1.isEmpty()) {
            throw new IllegalArgumentException("The queue is empty!");
        }
 
        return s1.peek();
    }
 
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

//Task3
//http://joxi.ru/52a9yeWUlj75V2

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stk = new ArrayDeque<>();
        for (String s : path.split("/")) {
            if ("".equals(s) || ".".equals(s)) {
                continue;
            }
            if ("..".equals(s)) {
                stk.pollLast();
            } else {
                stk.offerLast(s);
            }
        }
        return "/" + String.join("/", stk);
    }
}


http://joxi.ru/l2ZGMYzilJxnjA
http://joxi.ru/gmvDOVMceOP3GA
http://joxi.ru/52a9yeWUlj75V2