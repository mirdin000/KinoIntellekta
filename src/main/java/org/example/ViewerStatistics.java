package org.example;

import java.util.List;

public class ViewerStatistics {
    static public double averageAge(List<Viewer> listV){
        int sizeListV = listV.size();
        int sum = 0;
        for (Viewer V : listV) {
            sum += V.getAge();
        }
        return sum/sizeListV;
    }
}
