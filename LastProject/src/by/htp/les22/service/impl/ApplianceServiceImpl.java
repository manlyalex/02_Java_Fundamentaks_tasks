package by.htp.les22.service.impl;

import by.htp.les22.dao.ApplianceDao;
import by.htp.les22.dao.DaoProvider;
import by.htp.les22.dao.impl.DaoException;
import by.htp.les22.entity.ex.ApplianceProductLaptop;
import by.htp.les22.service.ApplianceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public boolean checkFileExistence(String filePath) throws ServiceException {
        DaoProvider provider = DaoProvider.getInstance();
        ApplianceDao applianceDao = provider.getApplianceDao();
        boolean results;
        try {
            results = applianceDao.check(filePath);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return results;
    }


    @Override
    public List<ApplianceProductLaptop> find(String key, String value) {
        DaoProvider provider = DaoProvider.getInstance();
        ApplianceDao applianceDao = provider.getApplianceDao();
        List<ApplianceProductLaptop> results = new ArrayList<ApplianceProductLaptop>();
        try {
            results = applianceDao.filter(key, value);
            return results;
        } catch (DaoException e) {
            e.printStackTrace();
        }
        return results;
    }

    @Override
    public void save(String type, Map<Object, Object> params) {

    }
}
