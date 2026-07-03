class Solution {

    Map<String, Map<String, Double>> graph = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        for (int i = 0; i < equations.size(); i++) {

            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);

            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            graph.get(a).put(b, values[i]);
            graph.get(b).put(a, 1.0 / values[i]);
        }

        double[] ans = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {

            String src = queries.get(i).get(0);
            String dest = queries.get(i).get(1);

            if (!graph.containsKey(src) || !graph.containsKey(dest)) {
                ans[i] = -1.0;
            } else {
                Set<String> visited = new HashSet<>();
                ans[i] = dfs(src, dest, visited);
            }
        }

        return ans;
    }

    private double dfs(String src, String dest, Set<String> visited) {

        if (src.equals(dest))
            return 1.0;

        visited.add(src);

        for (String neighbor : graph.get(src).keySet()) {

            if (!visited.contains(neighbor)) {

                double result = dfs(neighbor, dest, visited);

                if (result != -1.0) {
                    return graph.get(src).get(neighbor) * result;
                }
            }
        }

        return -1.0;
    }
}