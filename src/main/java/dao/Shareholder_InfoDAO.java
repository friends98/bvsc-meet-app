package dao;

import java.util.List;

import entities.Shareholders_Info;

public interface Shareholder_InfoDAO {
    public List<Shareholders_Info> getAllShareholder_Infos();
    public Shareholders_Info getShareholder_InfoById(String id);
    public void findShareholder_InfoByIdentityCard(String indentity_card);
    public void findShareholder_InfoByIdName(String name);
    public void addShareholder_Info(Shareholders_Info shareholders_Info);
    public void updateShareholder_Info(Shareholders_Info shareholders_Info);
    public void deleteShareholder_Info(Shareholders_Info shareholders_Info);
}