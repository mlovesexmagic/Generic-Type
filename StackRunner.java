/*Zhipeng (Adrian) Mei
  Sept 28, 2016 
  Purpose: Call the Stack class
  Inputs: Take in any input variable type
  Output: Output last in first out
 */
public class StackRunner {

    public static void main(String[] args) {
//        Stack<Integer> stk1 = new Stack();
//        stk1.push(1);
//        stk1.push(2);
//        stk1.push(3);
//        stk1.push(4);
//        while (!stk1.empty()) {
//            System.out.println(stk1.pop());
//        }

        Stack<Character> stk2 = new Stack();
        stk2.push('A');
        stk2.push('B');
        stk2.push('C');
        stk2.push('D');
        while (!stk2.empty()) {
            System.out.println(stk2.pop());
        }
    }
}
