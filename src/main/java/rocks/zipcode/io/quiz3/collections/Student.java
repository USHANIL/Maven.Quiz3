package rocks.zipcode.io.quiz3.collections;

import java.util.*;
import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labsList;
    public Student() {
        this.labsList = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
      this.labsList = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab :labsList
             ) {
            if(lab.getName() == labName) return lab;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if(labsList.contains(getLab(labName)))
            //getLab(labName).setStatus(labStatus);
            for (int i = 0; i < labsList.size(); i++) {
                if (labsList.get(i).getName() == labName)
                    labsList.get(i).setStatus(labStatus);
            }
        else{
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        labsList.add(lab);
       // lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        if(labsList.contains(getLab(labName)))
            return getLab(labName).getStatus();
       return null;
    }

    @Override
    public String toString() {

        String result  = "";
       // labsList.forEach(lab -> lab );
        for (Lab lab: labsList
             ) {
            result += lab.getName() + " > " + lab.getStatus() + "\n";
        }

       return result.substring(0, result.length()-1);

    }
}

