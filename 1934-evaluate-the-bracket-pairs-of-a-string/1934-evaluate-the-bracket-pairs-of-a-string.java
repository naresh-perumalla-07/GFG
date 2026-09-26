class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for(List<String> st : knowledge) {
            map.put(st.get(0),st.get(1));
        }

        StringBuilder key = new StringBuilder();
        StringBuilder res = new StringBuilder();
        boolean flag = false;

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                flag = true;
            }
            else if(ch == ')') {
                if(map.containsKey(key.toString())) {
                    res.append(map.get(key.toString()));
                }
                else {
                    res.append("?");
                }
                flag = false;
                key.setLength(0);
            }
            else if(flag) {
                key.append(ch);
            }
            else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna