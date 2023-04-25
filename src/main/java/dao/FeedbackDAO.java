package dao;

import java.util.List;

import entities.Feedback;

public interface FeedbackDAO {
    public List<Feedback> getAllFeedback();
    public Feedback getFeedbackById(String Id);
    public void addFeedback(Feedback feedback);
    public void updateFeedback(Feedback feedback);
    public void deleteFeedback(Feedback feedback);
}