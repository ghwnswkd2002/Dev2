package dev2.springboot.groupware.Main.Service;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public String loginCheck(String id, String pass) {
        return id;
    }
}
