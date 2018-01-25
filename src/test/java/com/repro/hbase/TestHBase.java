package com.repro.hbase;

import org.apache.hadoop.hbase.HBaseTestingUtility;
import org.junit.Test;

public class TestHBase {

    @Test
    public void testHbase() throws Exception {
        HBaseTestingUtility utility = new HBaseTestingUtility();
        utility.startMiniZKCluster();
        utility.startMiniCluster();
    }
}
