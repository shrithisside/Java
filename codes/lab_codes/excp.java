class excp{
    public static void main(String args[])
    {
        try{
            int[] array = {2,4,5};

            System.out.println(array[5]);
        }
        catch(Exception e){
            System.out.println("Exception class = "+e.getClass());
        }
        finally{
            System.out.println("This block will always be executed");
        }
    }
}