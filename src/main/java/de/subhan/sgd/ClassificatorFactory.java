package de.subhan.sgd;

import de.subhan.sgd.model.Classificator;
import de.subhan.sgd.model.Grid;
import de.subhan.sgd.model.GridPoint;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificatorFactory {


    public static Classificator createClassificator(String number) {
        try {
            String gridAlphaString = getFileContentAsString("Grid_Alpha" + number);
            return readClassificatorFile(gridAlphaString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getFileContentAsString(String fileName) throws IOException {
        Resource resource = new ClassPathResource("test_data/" + fileName + ".txt");
        InputStream resourceInputStream = resource.getInputStream();

        return readFromInputStream(resourceInputStream);
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    private static Classificator readClassificatorFile(String input) {
        Classificator classificator = new Classificator();

        Scanner s = new Scanner(input);
        //skip Grid:
        s.nextLine();

        //read gridType
        classificator.setGridType(s.nextLine());

        //skip properties
        s.nextLine();

        //skip dimension
        s.nextLine();

        Grid grid = new Grid();

        //List with all points for a grid
        List<List<GridPoint>> gridPoints = new ArrayList<List<GridPoint>>();
        for (int j = 0; j < 10753; j++) {

            //one grid point with all values for every dimension
            List<GridPoint> point = new ArrayList<GridPoint>();

            for (int i = 0; i < 784; i++) {
                Integer tmp = s.nextInt();

                Integer tmp2 = s.nextInt();
                point.add(new GridPoint(tmp, tmp2));
            }

            //skip line
            s.nextLine();

            //skip isleaf()
            s.nextLine();

            //skip dimension
            s.nextLine();

            gridPoints.add(point);

            if (j % 5000 == 0) {
//                System.out.println("Halftime");
            }
        }

        grid.setGridPoints(gridPoints);

        List<Double> surpluses = new ArrayList<Double>();

        //skip Alphas
        s.nextLine();

        while (s.hasNextLine()) {
            String[] vector;
            String tmp = s.nextLine();
            vector = tmp.split("(,)|(\\[)|(\\])");
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] != null && vector[i].length() > 0) {
                    try {
                        surpluses.add(Double.parseDouble(vector[i]));
                    } catch (Exception e) {
//                        System.err.println("doesnt work");
                    }
                }
            }
        }


        grid.setSurpluses(surpluses);
        classificator.setGrid(grid);

        return classificator;
    }
}
