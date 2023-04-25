package dao;

import java.util.List;

import entities.Shareholders_Meeting;

public interface Shareholder_MeetingDAO {
    public List<Shareholders_Meeting> getAllMeetings();
    public Shareholders_Meeting getMeetingById(String id);
    public void addMeeting(Shareholders_Meeting meeting);
    public void updateMeeting(Shareholders_Meeting meeting);
    public void deleteMeeting(Shareholders_Meeting meeting);
}