class Solution {
    public boolean isValid(String s) {
        if ("".equals(s)) {
            return true;
        }
        Map<Character, Integer> left = new HashMap<>();
        left.put('{', 1);
        left.put('[', 2);
        left.put('(', 3);

        Map<Character, Integer>  right = new HashMap<>();
        right.put('}', 1);
        right.put(']', 2);
        right.put(')', 3);

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (left.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                Character pop = stack.pop();

                if (left.get(pop) != right.get(c)){
                    return false;
                }

            }
        }


        return stack.isEmpty();


    }
}