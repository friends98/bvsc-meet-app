package interface;

import java.util.List;

import entities.Candidate;


public interface CandidateDAO {
    public List<Candidate> getAllCandidate();
    public Candidate getCandidateById(String id);
    public void addCandidate(Candidate candidate);
    public void updateCandidate(Candidate candidate);
    public void deleteCandidate(Candidate candidate);
}