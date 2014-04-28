package com.fedevela.springmvc.dao;

/**
 * Created by fvelazquez on 28/04/14.
 */
import java.util.List;

import com.fedevela.springmvc.model.Team;

public interface  TeamDAO {
    public void addTeam(Team team);
    public void updateTeam(Team team);
    public Team getTeam(int id);
    public void deleteTeam(int id);
    public List<Team> getTeams();
}
