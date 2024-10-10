package tasks;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Dummy {
    public static void main(String[] args) {
        String result = "5 + 10 - 3 * 6 / 1 % 8";

        // Create a ScriptEngineManager to evaluate the expression
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        // Check if the JavaScript engine is available
        if (engine == null) {
            System.out.println("JavaScript engine not available. Please check your Java version.");
            return;
        }

        try {
            // Evaluate the expression and print the result
            Object evaluatedResult = engine.eval(result);
            System.out.println("The result of the expression is: " + evaluatedResult);
        } catch (ScriptException e) {
            System.out.println("Invalid expression");
            e.printStackTrace();
        }
    }
}
