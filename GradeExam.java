// GradeExam.java
// Page 241-242

public class GradeExam {
   // Main method

   public static void main( String args[] )
   {
    
      // Students' answers to the questions
      char[][] answers = 
     {
	//[0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]  [9]
        { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },	// Row 0
        { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },	// Row 1
        { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },	// Row 2
        { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },	// Row 3
        { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },	// Row 4
        { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },	// Row 5
        { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },	// Row 6
        { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }	// Row 7
     };

      // Key to the questions
	//	     [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]  [9]		
      char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
   
      // Grade all answers
      for ( int i = 0; i < answers.length; i++ ) {		// row [i] loop: answers.length = 8 rows
         // Grade one student
         int correctCount = 0;
         for ( int j = 0; j < answers[i].length; j++) {		// column [j] loop: answers.length = 10 columns
           if (answers[i][j] == keys[j])
             correctCount++;     
         }  // end j

         System.out.println("Student " + i + "'s correct count is " +
           correctCount);
       }  // end i

   }
}

