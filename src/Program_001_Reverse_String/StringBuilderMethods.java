package Program_001_Reverse_String;
// 🔧 Full List of StringBuilder Useful Methods
//Method	        What it does	                         Example
//append()	   Adds text	                                sb.append("Test")
//insert()	   Adds text at a position                  	sb.insert(2, "Java")
//replace()	   Replace characters	                        sb.replace(0, 4, "Hi")
//delete()	   Remove characters	                        sb.delete(0, 2)
//reverse()	   Flip text	                                sb.reverse()
//toString()   Get final result	                            sb.toString()


public class StringBuilderMethods {
    public static void main(String[] args) {
        // Start with a simple string
        StringBuilder sb = new StringBuilder("Ankit");
        System.out.println("InitialString: " +sb);

        // 1. append() - Add something at the end
        sb.append(" is a QA Engineer");
        System.out.println("After append(): "+sb);

        // 2. insert() - Insert text at a position (6th index = after 'Ankit')
        sb.insert(6," is having experience in both manual and automation testing ");
        System.out.println("After insert(): "+sb);

        // 3. delete() - Delete characters from index 6 to 66
        sb.delete(6,66);
        System.out.println("After delete():"+sb);

        // 4. replace() - Replace characters from index 6 to 66 with "is a good boy !"
        sb.replace(6,66, "is a good boy ! ");
        System.out.println("After replace(): " +sb);

        // 5. reverse() - Reverse the entire string "Ankit is a good boy ! "
        sb.reverse();
        System.out.println("After reverse(): "+sb);
    }
}
