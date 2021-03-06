package com.classliu.greendao.db;

import com.classliu.greendao.bean.TestData;
import com.classliu.greendao.bean.TestData2;
import com.classliu.greendao.bean.TestData3;
import com.classliu.greendao.bean.TestData4;
import com.classliu.greendao.bean.TestData5;
import com.classliu.greendao.dao.TestData2Dao;
import com.classliu.greendao.dao.TestData3Dao;
import com.classliu.greendao.dao.TestData4Dao;
import com.classliu.greendao.dao.TestData5Dao;
import com.classliu.greendao.dao.TestDataDao;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig testDataDaoConfig;
    private final DaoConfig testData2DaoConfig;
    private final DaoConfig testData3DaoConfig;
    private final DaoConfig testData4DaoConfig;
    private final DaoConfig testData5DaoConfig;

    private final TestDataDao testDataDao;
    private final TestData2Dao testData2Dao;
    private final TestData3Dao testData3Dao;
    private final TestData4Dao testData4Dao;
    private final TestData5Dao testData5Dao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        testDataDaoConfig = daoConfigMap.get(TestDataDao.class).clone();
        testDataDaoConfig.initIdentityScope(type);

        testData2DaoConfig = daoConfigMap.get(TestData2Dao.class).clone();
        testData2DaoConfig.initIdentityScope(type);

        testData3DaoConfig = daoConfigMap.get(TestData3Dao.class).clone();
        testData3DaoConfig.initIdentityScope(type);

        testData4DaoConfig = daoConfigMap.get(TestData4Dao.class).clone();
        testData4DaoConfig.initIdentityScope(type);

        testData5DaoConfig = daoConfigMap.get(TestData5Dao.class).clone();
        testData5DaoConfig.initIdentityScope(type);

        testDataDao = new TestDataDao(testDataDaoConfig, this);
        testData2Dao = new TestData2Dao(testData2DaoConfig, this);
        testData3Dao = new TestData3Dao(testData3DaoConfig, this);
        testData4Dao = new TestData4Dao(testData4DaoConfig, this);
        testData5Dao = new TestData5Dao(testData5DaoConfig, this);

        registerDao(TestData.class, testDataDao);
        registerDao(TestData2.class, testData2Dao);
        registerDao(TestData3.class, testData3Dao);
        registerDao(TestData4.class, testData4Dao);
        registerDao(TestData5.class, testData5Dao);
    }
    
    public void clear() {
        testDataDaoConfig.clearIdentityScope();
        testData2DaoConfig.clearIdentityScope();
        testData3DaoConfig.clearIdentityScope();
        testData4DaoConfig.clearIdentityScope();
        testData5DaoConfig.clearIdentityScope();
    }

    public TestDataDao getTestDataDao() {
        return testDataDao;
    }

    public TestData2Dao getTestData2Dao() {
        return testData2Dao;
    }

    public TestData3Dao getTestData3Dao() {
        return testData3Dao;
    }

    public TestData4Dao getTestData4Dao() {
        return testData4Dao;
    }

    public TestData5Dao getTestData5Dao() {
        return testData5Dao;
    }

}
