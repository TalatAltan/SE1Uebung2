
public class Sort {
	private static String[][] sequenceOrder = new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }};

	 public static boolean isWellSorted(String[] sequence)
     {
         if (sequence == null)
         {
             return false;
         }

         for (int x = sequence.length - 1; x > 0; x--)
         {
             for (int y = x - 1; y >= 0; y--)
             {
                 String[] pair = new String[] { sequence[y], sequence[x] };
                 if (!isWellSortedPair(pair))
                 {
                     return false;
                 }
             }
         }
         return true;
     }

     private static boolean isWellSortedPair(String[] pair)
     {
         for (int i = 0; i < sequenceOrder.length; i++)
         {
             if (pair[0] == sequenceOrder[i][0] && pair[1] == sequenceOrder[i][1])
             {
                 return true;
             }
         }

         for (int i = 0; i < sequenceOrder.length; i++)
         {
             if (pair[0] == sequenceOrder[i][1])
             {
                 if (pair[1] == sequenceOrder[i][0])
                 {
                     return false;
                 }
                 else
                 {
                     if (!isWellSortedPair(new String[] { pair[0], sequenceOrder[i][0]})){
                         return false;
                     }
                 }
             }
         }

         return true;
     }
	
}
