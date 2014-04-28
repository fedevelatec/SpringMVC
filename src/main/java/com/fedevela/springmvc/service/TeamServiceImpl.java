package com.fedevela.springmvc.service;

/**
 * Created by fvelazquez on 28/04/14.
 */
import java.util.List;

import com.fedevela.springmvc.dao.TeamDAO;
import com.fedevela.springmvc.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{
    @Autowired
    private TeamDAO teamDAO;

    public void addTeam(Team team) {
        teamDAO.addTeam(team);
    }

    public void updateTeam(Team team) {
        teamDAO.updateTeam(team);
    }

    public Team getTeam(int id) {
        return teamDAO.getTeam(id);
    }

    public void deleteTeam(int id) {
        teamDAO.deleteTeam(id);
    }

    public List<Team> getTeams() {
        return teamDAO.getTeams();
    }
}
