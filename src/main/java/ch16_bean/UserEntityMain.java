package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
         UserEntity userEntity1 =new UserEntity();
         userEntity1.setName("우진");
         userEntity1.setEmail("a@test.com");
         userEntity1.setPassword(9876);
         userEntity1.setUsername(1);
         System.out.println(userEntity1);
        System.out.println(userEntity1.getName());

        UserEntityLombok user2 = new UserEntityLombok();
        UserEntityLombok user3 = new UserEntityLombok();

    }
}
