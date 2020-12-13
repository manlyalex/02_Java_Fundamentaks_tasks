package by.htp.les22.service;

import by.htp.les22.entity.ex.ApplianceProductLaptop;
import by.htp.les22.service.impl.ServiceException;

import java.util.List;
import java.util.Map;

public interface ApplianceService {
    boolean checkFileExistence(String pathFile) throws ServiceException;


    List<ApplianceProductLaptop> find(String key, String value) throws ServiceException;//название параметра, значение параметра

    void save(ApplianceProductLaptop applianceProductLaptop, String filePath) throws ServiceException;//сохранение нового электроприбора (параметры для его сохранения)
}
