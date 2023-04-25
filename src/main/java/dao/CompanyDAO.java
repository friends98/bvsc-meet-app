package dao;

import java.util.List;

import entities.Company;

public interface CompanyDAO {
    public List<Company> getAllCompanies();
    public Company getCompanyById(String id);
    public void addCompany(Company company);
    public void updateCompany(Company company);
    public void deleteCompany(Company company);
}