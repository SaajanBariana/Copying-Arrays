import java.util.ArrayList;

/**
 * This class runs through a list and makes sure no duplicates are added
 * 
 * @author Saajan Bariana
 */
public class ArrayOps
{
    /**
    *This method goes through the given array of integers,
    yielding a new ArrayList from the array that contains the
    elements of the original array, with duplicates removed.
     * @param anArray is an array proved by a user
     * @return returns the list of integers that weren't duplicated
     */
    public static ArrayList<Integer> copyArray(int[] anArray)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(anArray.length > 0)
        {
            for(int x : anArray)
            {
                if (!list.contains(x))
                {
                    list.add(x);
                }
            }
        }

        return list;
    }

    /**
    This method goes through the given array list of integers,
    yielding a new array from the array list that contains the
    elements of the original array list, with duplicates removed.
    @param theArrayList, an array list of integer
    @return the new array

     */
    public static int[] copyArrayList(ArrayList<Integer> anArrayList)
    {
        ArrayList<Integer> words = new ArrayList<Integer>();
        if(anArrayList.size() > 0)
        {
            for(Integer x : anArrayList)
            {
                if (!words.contains(x))
                {
                    words.add(x);
                }
            }
        }
        int [] numbers = new int[words.size()];
        for (int i = 0; i < words.size(); i ++)
        {
            numbers[i] = words.get(i);
        }
        
        return numbers;
    }
}