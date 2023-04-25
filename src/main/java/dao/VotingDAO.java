package dao;

import java.util.List;

import entities.Voting;

public interface VotingDAO {
    public List<Voting> getAllVoting();
    public Voting getVotingById(String id);
    public void addVoting(Voting voting);
    public void updateVoting(Voting voting);
    public void deleteVoting(Voting voting);
}