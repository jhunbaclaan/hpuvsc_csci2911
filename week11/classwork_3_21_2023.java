package week11;

public class classwork_3_21_2023 {
    public static void main(String[] args)
    {
        Pet j = new Pet();
    
        j.setName("j");
        j.setBreed("husky");
        j.setAge(3);
        System.out.println(j.toString());

        Pet k = new Pet("k", "labrador", 4);
        System.out.println(k.toString());
    }
}
