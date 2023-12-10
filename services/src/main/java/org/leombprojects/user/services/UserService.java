package org.leombprojects.user.services;

import org.leombprojects.models.swagger.api.UserValidationInputDto;
import org.leombprojects.models.swagger.api.UserValidationOutputDto;

public interface UserService {
    UserValidationOutputDto validateAccess(UserValidationInputDto userValidationInputDto);

}
