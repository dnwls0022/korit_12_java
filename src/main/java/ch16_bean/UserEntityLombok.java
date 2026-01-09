package ch16_bean;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@AllArgsConstructor
@ToString

public class UserEntityLombok {
    private  int username;
    @Setter
    private  int password;
    @NonNull
    private  String email ;
    @NonNull
    private  String name;
}
