package jakester.jakester.auth.service;

import jakester.jakester.auth.entity.User;
import jakester.jakester.auth.payload.LoginDto;
import jakester.jakester.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
