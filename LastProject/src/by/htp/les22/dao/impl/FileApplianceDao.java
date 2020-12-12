package by.htp.les22.dao.impl;

import by.htp.les22.dao.ApplianceDao;
import by.htp.les22.entity.ex.ApplianceProductLaptop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FileApplianceDao implements ApplianceDao {

    @Override
    public boolean check(String filePath) throws DaoException {
        FileReader reader;
        try {
            reader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new DaoException(e);
        }
        return false;
    }

    public List<ApplianceProductLaptop> applianceProductLaptops;

    private static List<ApplianceProductLaptop> filterByField(Function<ApplianceProductLaptop, String> func, String value, List<ApplianceProductLaptop> applianceProducts) {
        List<ApplianceProductLaptop> result = new ArrayList<ApplianceProductLaptop>();
        for (ApplianceProductLaptop applianceProduct : applianceProducts) {
            if (func.apply(applianceProduct).equals(value)) {
                result.add(applianceProduct);
            }
        }
        return result;
    }

    private List<ApplianceProductLaptop> filterByType(String type, List<ApplianceProductLaptop> applianceProducts) throws DaoException {
        Function<ApplianceProductLaptop, String> getProductName = e -> e.getNameProduct();
        return this.filterByField(getProductName, type, applianceProducts);
    }

    private List<ApplianceProductLaptop> filterByKeyValue(String key, String value) {
        List<ApplianceProductLaptop> result = new ArrayList<ApplianceProductLaptop>();
        for (ApplianceProductLaptop applianceProduct : this.applianceProductLaptops) {
            if (applianceProduct.isExist(key, value) == true) {
                result.add(applianceProduct);
            }
        }
        return result;
    }




    @Override
    public List<ApplianceProductLaptop> filter(String key, String value) throws DaoException {
        List<ApplianceProductLaptop> results = null;
        String path = "E:\\Courses-Java\\IDEA\\Last_Project\\resourses\\appliances.txt";
        try {
            applianceProductLaptops = ProductParser.parseProductTxt(path);
            results = this.filterByKeyValue(key,value);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return results;
    }

    @Override
    public String toString() {
        return applianceProductLaptops + "";
    }

    @Override
    public void save(String type, Map<Object, Object> params) { // Метод для сохранения электроприбора в файл

    }
}
