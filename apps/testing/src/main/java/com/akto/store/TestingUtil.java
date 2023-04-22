package com.akto.store;

import com.akto.dto.ApiInfo;
import com.akto.dto.testing.AuthMechanism;
import com.akto.dto.testing.TestRoles;
import com.akto.dto.type.SingleTypeInfo;

import java.util.List;
import java.util.Map;

public class TestingUtil {

    private AuthMechanism authMechanism;
    private SampleMessageStore sampleMessageStore;
    private List<TestRoles> testRoles;

    public TestingUtil(AuthMechanism authMechanism, SampleMessageStore sampleMessageStore, List<TestRoles> testRoles) {
        this.authMechanism = authMechanism;
        this.sampleMessageStore = sampleMessageStore;
        this.testRoles = testRoles;
    }

    public TestingUtil() {
    }

    public Map<ApiInfo.ApiInfoKey, List<String>> getSampleMessages() {
        return sampleMessageStore.getSampleDataMap();
    }

    public AuthMechanism getAuthMechanism() {
        return authMechanism;
    }

    public void setAuthMechanism(AuthMechanism authMechanism) {
        this.authMechanism = authMechanism;
    }

    public List<TestRoles> getTestRoles() {
        return testRoles;
    }

    public void setTestRoles(List<TestRoles> testRoles) {
        this.testRoles = testRoles;
    }

    public SampleMessageStore getSampleMessageStore() {
        return sampleMessageStore;
    }

    public void setSampleMessageStore(SampleMessageStore sampleMessageStore) {
        this.sampleMessageStore = sampleMessageStore;
    }
}
