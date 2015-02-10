package com.logentries.catalina.valves;

import java.io.CharArrayWriter;
import org.apache.catalina.valves.AbstractAccessLogValve;

public class LogentriesValve extends AbstractAccessLogValve {

    @Override
    protected void log(CharArrayWriter message) {
    }
    
}
