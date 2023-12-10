package org.leombprojects.user.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.leombprojects.models.swagger.api.UserValidationInputDto;
import org.leombprojects.models.swagger.api.UserValidationOutputDto;
import org.leombprojects.models.swagger.model.UserApiDelegate;
import org.leombprojects.user.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController implements UserApiDelegate {

    private final UserService userService;

    @Override
    public ResponseEntity<UserValidationOutputDto> validateUser(UserValidationInputDto userValidationInputDto) {
        return ResponseEntity.ok(userService.validateAccess(userValidationInputDto));
    }
}
