class Solution {
    static class Node {
        public int x;
        public int y;
        public Node (int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
            ArrayList<Node> list = new ArrayList<>(R * C);

            for(int i = 0; i < R; i ++){
                for(int j = 0; j < C; j ++){
                    Node node = new Node(i, j);
                    list.add(node);
                }
            }
            list.sort((a, b) -> {

                Integer a1 = Math.abs(a.x - r0) + Math.abs(a.y - c0);

                Integer a2 = Math.abs(b.x - r0) + Math.abs(b.y - c0);

                return a1.compareTo(a2);

            });

            int[][] result = new int[R * C][2];

            for(int i = 0; i < list.size(); i ++){
                result[i][0] = list.get(i).x;
                result[i][1] = list.get(i).y;
            }
            return result;
    }
}