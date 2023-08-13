public class Solution {
public List<List<Integer>> subsets(int[] S) {
    Arrays.sort(S);
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    LinkedList<Integer> current = new LinkedList<Integer>();
    subsets(result, S, current, 0);
    return result;
}

private void subsets(List<List<Integer>> result, int[] S, LinkedList<Integer> current, int idx) {
    if (idx == S.length) {
        result.add(new LinkedList<Integer>(current));
        return;
    } 
    current.addLast(S[idx]);
    subsets(result, S, current, idx+1);
    current.removeLast();
    subsets(result, S, current, idx+1);
}
}