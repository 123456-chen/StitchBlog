package com.stitch.service.test;

import com.stitch.commons.dao.TestDao;
import com.stitch.commons.utils.TypeChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:Stitch Chen
 * @create: 2023-10-15 15:41
 * @Description:
 */
@Service
public class OutTestServerImpl implements OutTestServer {

    @Autowired
    private TestDao testDao;
    @Override
    public void outmessage() {
        TypeChecker.isEmpty("");
        testDao.performDatabaseOperations();
        System.out.println("这是service层");
    }
}
