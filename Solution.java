import java.util.*;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        // Start form room 0
        stack.push(0);

        while(!stack.isEmpty()){
            int room = stack.pop();
            if(!visited[room]){
                visited[room] = true;   // Mark this room as visited
                // Explore all keys found in this room
                for(int key : rooms.get(room)){ // Use get() to access the list
                    if(!visited[key]){
                        stack.push(key);    // Add unvisited room to stack
                    }
                }
            }
        }

        // Check if all rooms have been visited
        for(boolean v : visited){
            if(!v){
                return false;
            }
        }
        return true;
    }
}