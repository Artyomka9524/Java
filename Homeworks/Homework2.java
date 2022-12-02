package Homeworks;

public class Homework2 {
    
}

// Task1
//http://joxi.ru/DmB54RKcq7a3ar

class Solution {
    private int[][] grid;
    private int m;
    private int n;

    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        this.grid = grid;
        int ans = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, dfs(i, j));
                }
            }
        }
        return ans;
    }

    private int dfs(int i, int j) {
        grid[i][j] = 0;
        int[] dirs = {-1, 0, 1, 0, -1};
        int ans = 1;
        for (int k = 0; k < 4; ++k) {
            int x = i + dirs[k];
            int y = j + dirs[k + 1];
            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                ans += dfs(x, y);
            }
        }
        return ans;
    }
}

// Task2
//http://joxi.ru/krDW4kaIGDRVYA

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sr, sc});
        int oc = image[sr][sc];
        image[sr][sc] = newColor;
        int[] dirs = {-1, 0, 1, 0, -1};
        while (!q.isEmpty()) {
            int[] p = q.poll();
            int i = p[0], j = p[1];
            for (int k = 0; k < 4; ++k) {
                int x = i + dirs[k], y = j + dirs[k + 1];
                if (x >= 0 && x < image.length && y >= 0 && y < image[0].length
                        && image[x][y] == oc) {
                    q.offer(new int[]{x, y});
                    image[x][y] = newColor;
                }
            }
        }
        return image;
    }
}

//Task3
//http://joxi.ru/1A501JEH4M98N2

/**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        private List<String> ans;
        private List<String> t;

        public List<String> binaryTreePaths(TreeNode root) {
            ans = new ArrayList<>();
            t = new ArrayList<>();
            dfs(root);
            return ans;
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            t.add(root.val + "");
            if (root.left == null && root.right == null) {
                ans.add(String.join("->", t));
            }
            dfs(root.left);
            dfs(root.right);
            t.remove(t.size() - 1);
        }
    }

    //Task4
    //http://joxi.ru/l2ZGMYzilo0j0A

      /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == q) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            Deque<TreeNode> q1 = new ArrayDeque<>();
            Deque<TreeNode> q2 = new ArrayDeque<>();
            q1.offer(p);
            q2.offer(q);
            while (!q1.isEmpty() && !q2.isEmpty()) {
                p = q1.poll();
                q = q2.poll();
                if (p.val != q.val) {
                    return false;
                }
                TreeNode la = p.left, ra = p.right;
                TreeNode lb = q.left, rb = q.right;
                if ((la != null && lb == null) || (lb != null && la == null)) {
                    return false;
                }
                if ((ra != null && rb == null) || (rb != null && ra == null)) {
                    return false;
                }
                if (la != null) {
                    q1.offer(la);
                    q2.offer(lb);
                }
                if (ra != null) {
                    q1.offer(ra);
                    q2.offer(rb);
                }
            }
            return true;
        }
    }


