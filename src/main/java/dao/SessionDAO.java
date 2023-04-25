package dao;

import java.util.List;

import entities.Session;

public interface SessionDAO {
    public List<Session> getAllSession();
    public Session getSessionById(String session_id);
    public void addSession(Session session);
    public void updateSession(Session session);
} 