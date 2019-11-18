package rocks.zipcode.io.quiz3.collections;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private Map<String, Lab> labMap;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        labMap = new TreeMap<>();
        if(labs != null) {
            for (Lab lab : labs) {
                labMap.put(lab.getName(), lab);
            }
        }
    }

    public Lab getLab(String labName) {
      return labMap.get(labName);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = labMap.get(labName);
        if(lab != null)
            lab.setStatus(labStatus);
        else{
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
       return labMap.getOrDefault(labName, new Lab("default")).getStatus();
    }

    @Override
    public String toString() {

        String result  = "";
        TreeSet<String> sortedKeysSet = new TreeSet();
        sortedKeysSet.addAll(labMap.keySet());
        for(String key : sortedKeysSet){
            result += key + " > " + labMap.get(key).getStatus() + "\n";
        }
        return result.substring(0, result.length()-1);
    }
}

