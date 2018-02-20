package SingleArray;

public class ArrayClassDemo {
    static void min(int arr[] )
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
               // System.out.println(min);
            }
            System.out.println(min);
        }

    }
    public static void main(String[] args) {
        //int arr[]=new int [5];
        //int arr[]= new int[]{56, 32, 48, 98, 26};
        int arr[]=new int[]{33,3,4,5};
        try {
            min(arr);
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }

    }
}
