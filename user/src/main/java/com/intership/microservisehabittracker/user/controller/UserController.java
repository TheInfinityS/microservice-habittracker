package com.intership.microservisehabittracker.user.controller;

import com.intership.microservisehabittracker.user.entity.User;
import com.intership.microservisehabittracker.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping("/activate/changePassword")
//    public User activateChangePassword(@RequestHeader(name="Authorization") String authorizationHeader){
//        User user=userService.getFromAuthentication(authorizationHeader);
//        return userService.activateChangePassword(user);
//    }
//
//    @GetMapping("/activate/{code}")
//    public ResponseEntity<?> activeChangePassword(@PathVariable String code){
//        User user=userService.getByActivationCode(code);
//        return userService.activeChangePassword(user);
//    }
//
//    @PostMapping("/changePassword/{code}")
//    public ResponseEntity<?> changePassword(@RequestBody String newPassword,@PathVariable String code){
//        System.out.println(newPassword);
//        String password=authService.encryptPassword(newPassword);
//        User user=userService.getByActivationCode(code);
//        return userService.changePassword(password,user);
//    }

//    @PutMapping("/update")
//    public User update(@RequestParam(value = "file",required = false) MultipartFile file,
//                       @RequestParam(value = "username",required = false) String username,
//                       @RequestHeader(name="Authorization") String authorizationHeader) throws IOException {
//        User user=userService.getFromAuthentication(authorizationHeader);
//        return userService.update(file,username,user);
//    }
}
