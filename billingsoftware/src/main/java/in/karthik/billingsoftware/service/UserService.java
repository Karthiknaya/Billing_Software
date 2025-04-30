package in.karthik.billingsoftware.service;

import in.karthik.billingsoftware.io.UserRequest;
import in.karthik.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
