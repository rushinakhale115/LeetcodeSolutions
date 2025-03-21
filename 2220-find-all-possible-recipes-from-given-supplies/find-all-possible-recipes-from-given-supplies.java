
class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> ans = new ArrayList<>();
        
        // Step 1: Convert supplies to a HashSet for quick lookup
        Set<String> available = new HashSet<>(Arrays.asList(supplies));

        // Step 2: Create a graph (ingredient -> recipes that depend on it)
        Map<String, List<String>> adjList = new HashMap<>();
        Map<String, Integer> inDegree = new HashMap<>();

        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            inDegree.put(recipe, ingredients.get(i).size()); // Track required ingredients
            
            for (String ing : ingredients.get(i)) {
                adjList.computeIfAbsent(ing, k -> new ArrayList<>()).add(recipe);
            }
        }

        // Step 3: Use a queue for topological sorting (start with initial supplies)
        Queue<String> queue = new LinkedList<>(available);

        while (!queue.isEmpty()) {
            String item = queue.poll();

            // If item is a recipe, add it to the result
            if (inDegree.containsKey(item)) {
                ans.add(item);
            }

            // Reduce the dependency count for recipes that use this ingredient
            if (adjList.containsKey(item)) {
                for (String dependent : adjList.get(item)) {
                    inDegree.put(dependent, inDegree.get(dependent) - 1);
                    
                    // If all ingredients are available, add the recipe to the queue
                    if (inDegree.get(dependent) == 0) {
                        queue.offer(dependent);
                    }
                }
            }
        }

        return ans;
    }
}