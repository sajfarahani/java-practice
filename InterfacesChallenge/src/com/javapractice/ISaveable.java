package com.javapractice;

import java.util.List;
import java.util.ListIterator;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}
