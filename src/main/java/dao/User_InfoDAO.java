package dao;

import java.util.List;

import entities.User_Info;

public interface User_InfoDAO {
    public List<User_Info> getAllUser_Infos();
    public User_Info getUser_InfoById(String id);
    public void addUser_Info(User_Info user_Info);
    public void updateUser_Info(User_Info user_Info);
    public void deleteUser_Info(User_Info user_Info);
    
}