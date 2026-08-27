class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] commands = path.split("/");
        String simplifiedPath = "/";
        for(int i=0;i<commands.length;i++){
            if(commands[i].equals("..") && !stack.isEmpty()){ stack.pollLast(); 
                    System.out.println("popped" + stack);
                                                            }
            else if(commands[i].equals(".")){}
            else if(commands[i].equals("")){}
            else if(commands[i].equals("..")){}
            else{ stack.addLast(commands[i]); }
        }

        simplifiedPath += String.join("/", stack);
        
        return simplifiedPath;
    }
}