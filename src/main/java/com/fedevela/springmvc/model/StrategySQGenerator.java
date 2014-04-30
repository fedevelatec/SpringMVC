package com.fedevela.springmvc.model;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Created by fvelazquez on 30/04/14.
 */
public class StrategySQGenerator implements IdentifierGenerator {
    private static Logger log = LoggerFactory.getLogger(StrategySQGenerator.class);

    public Serializable generate(SessionImplementor session, Object object)
            throws HibernateException {
        String prefix = "M";//Este se ocupa cuando el Id lleva algun prefijo
        Connection connection = session.connection();
        try {
            PreparedStatement ps = connection
                    .prepareStatement("SELECT fvelazquez.strategy_SQ.nextval as nextval from dual");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("nextval");
                //String code = prefix + StringUtils.leftPad("" + id,3, '0'); Aqui se da formato si fuera algun codigo especial
                Integer code =  id;
                log.info("Generated Stock Code: " + code);
                return code;
            }
        }catch (SQLException e) {
            log.error(e.getMessage());
            throw new HibernateException(
                    "Unable to generate Stock Code Sequence");
        }
        return null;
    }
}
