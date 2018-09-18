package com.example.opilane.kuningad;
import com.example.opilane.kuningad.King;

import java.util.ArrayList;
import java.util.List;
// second part of the data resoruce, the class Kings makes King objects available

public class Kings {

    //creating list
    private List<King> list = new ArrayList();

    // adding multidimensional array values into the list
    public  Kings(){
        for (String[] arr : data)
            list.add(new King(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
    }

    public List<King> getKings(){
        return list;
    }
    // out multidimensional array
    private static final String[][] data = {
            {"Henry VIII", "1509", "1547"},
            {"Edward VI", "1547", "1553"},
            {"Mary I", "1553", "1558"},
            {"Elizabeth I", "1558", "1603"},
            {"James I", "1603", "1625"},
            {"Charles I", "1625", "1649"},
            {"Charles II", "1660", "1685"},
            {"James II", "1685", "1688"},
            {"Mary II", "1689", "1694"},
            {"William III", "1689", "1702"},
            {"Anne", "1702", "1707"} };}

