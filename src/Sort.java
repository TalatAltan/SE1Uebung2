public class Sort {
	private static String[][] sequenceOrder = new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }};

	   public static boolean isWellSorted(String[] sequence)
       {
           if (sequence == null)
           {
               return false;
           }

           for(int x = sequence.length -1; x >= 0; x--)
           {
               for (int y = 0; y < sequenceOrder.length; y++)
               {
                   if (sequence[x] == sequenceOrder[y][1])
                   {
                       if(!containsDependence(sequence, x, sequenceOrder[y][0]))
                       {
                           return false;
                       }
                   }
               }
           }

           return true;
       }

       private static boolean containsDependence(String[] sequence, int index, String req)
       {
           for (int i = index - 1; i >= 0; i--)
           {
               if (sequence[i] == req)
               {
                   return true;
               }
           }

           return false;
       }
}
