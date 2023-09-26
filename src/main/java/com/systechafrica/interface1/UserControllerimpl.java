package com.systechafrica.interface1;

import java.util.UUID;

public class UserControllerimpl implements UserController {

    @Override
    public User createUser(User user) {
      user.setId(UUID.randomUUID().toString());
        return user;
    }
    
}
