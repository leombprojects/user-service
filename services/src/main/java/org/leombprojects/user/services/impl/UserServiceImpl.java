package org.leombprojects.user.services.impl;

import lombok.RequiredArgsConstructor;
import org.leombprojects.models.swagger.api.UserValidationInputDto;
import org.leombprojects.models.swagger.api.UserValidationOutputDto;
import org.leombprojects.user.models.UsersModel;
import org.leombprojects.user.repositories.UserRepository;
import org.leombprojects.user.services.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserValidationOutputDto validateAccess(UserValidationInputDto userValidationInputDto) {

        UsersModel usersModel = userRepository.findByUserAndPassword(userValidationInputDto.getUser(), userValidationInputDto.getPassword());

        return UserValidationOutputDto.builder().validUser(usersModel != null).build();
    }
}
