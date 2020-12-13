package by.htp.les22.dao;

import by.htp.les22.dao.impl.DaoException;
import by.htp.les22.entity.ex.ApplianceProductLaptop;

import java.util.List;
import java.util.Map;

public interface ApplianceDao {

    boolean check(String pathFile) throws DaoException;

    List<ApplianceProductLaptop> filter(String key, String value) throws DaoException; //название параметра, значение параметра

    void save(ApplianceProductLaptop applianceProductLaptop, String filePath) throws DaoException; //сохранение нового электроприбора (параметры для его сохранения)

}
