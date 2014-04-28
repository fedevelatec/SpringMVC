package com.fedevela.springmvc.service;

/**
 * Created by fvelazquez on 28/04/14.
 */
import com.fedevela.springmvc.model.Team;

import java.util.List;

public interface TeamService {
    public void addTeam(Team team);
    public void updateTeam(Team team);
    public Team getTeam(int id);
    public void deleteTeam(int id);
    public List<Team> getTeams();
}
