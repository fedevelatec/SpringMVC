package com.fedevela.springmvc.dao;

/**
 * Created by Federico on 30/04/14.
 */
import java.util.List;
import com.fedevela.springmvc.model.Strategy;

public interface StrategyDAO {

    public void addStrategy(Strategy strategy);
    public Strategy getStrategy(int id);
    public void updateStrategy(Strategy strategy);
    public void deleteStrategy(int id);
    public List<Strategy> getStrategies();

}
