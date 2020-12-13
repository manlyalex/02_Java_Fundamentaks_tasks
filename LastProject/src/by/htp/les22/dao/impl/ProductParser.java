package by.htp.les22.dao.impl;

import by.htp.les22.entity.ex.ApplianceProductLaptop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductParser {

    private static String productPattern = "(\\w*) : BATTERY_CAPACITY=([0-9]*\\.?[0-9]*), OS=(\\w*), " +
            "MEMORY_ROM=(\\d*), SYSTEM_MEMORY=(\\d*), CPU=([0-9]*\\.?[0-9]*), DISPLAY_INCHS=([0-9]*)";

    public static List<ApplianceProductLaptop> parseProductTxt(String filePath) throws IOException {

        List<ApplianceProductLaptop> products = new ArrayList<ApplianceProductLaptop>();
        List<String> fileLines = Files.readAllLines(Paths.get(filePath));
        for (String fileLine : fileLines) {
            try {
                products.add(ProductParser.parseProduct(fileLine));

            } catch (Throwable t) {
            }
        }
        System.out.println(products);
        return products;
    }

    public static ApplianceProductLaptop parseProduct(String rawString) {

        Pattern pattern = Pattern.compile(productPattern);
        Matcher matcher = pattern.matcher(rawString);
        matcher.find();

        String name = matcher.group(1);
        float batteryCapacity = Float.parseFloat(matcher.group(2));
        String OS = matcher.group(3);
        int memoryRom = Integer.parseInt(matcher.group(4));
        int systemMemory = Integer.parseInt(matcher.group(5));
        float CPU = Float.parseFloat(matcher.group(6));
        int displayInches = Integer.parseInt(matcher.group(7));


        ApplianceProductLaptop applianceProduct = new ApplianceProductLaptop(name, batteryCapacity, OS,
                memoryRom, systemMemory, CPU, displayInches);

        return applianceProduct;
    }


}
