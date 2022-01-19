/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.anprcloud.client;

import com.amazonaws.Protocol;
import com.amazonaws.util.RuntimeHttpUtils;
import java.net.URI;

/**
 *
 * @author laszlo.toth
 */
public class ANPRCloudConfig {

    /**
     *
     */
    public static final ANPRCloudConfig INSTANCE = new ANPRCloudConfig();

    private URI endpoint = RuntimeHttpUtils.toUri("api-eu.anpr-cloud.com", Protocol.HTTPS);
    private String stage = "";
    private String region = "";
    private boolean withThrottledRetries = true;

    private ANPRCloudConfig() {
    }

    /**
     *
     * @return
     */
    public static ANPRCloudConfig getConfig() {
        return INSTANCE;
    }

    /**
     *
     * @return
     */
    public URI getEndpoint() {
        return endpoint;
    }

    /**
     *
     * @param endpoint
     */
    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    /**
     *
     * @return
     */
    public String getStage() {
        return stage;
    }

    /**
     *
     * @param stage
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     *
     * @return
     */
    public boolean isWithThrottledRetries() {
        return withThrottledRetries;
    }

    /**
     *
     * @param withThrottledRetries
     */
    public void setWithThrottledRetries(boolean withThrottledRetries) {
        this.withThrottledRetries = withThrottledRetries;
    }

    /**
     *
     * @param endpoint
     * @return
     */
    public ANPRCloudConfig endpoint(URI endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     *
     * @param stage
     * @return
     */
    public ANPRCloudConfig stage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     *
     * @param region
     * @return
     */
    public ANPRCloudConfig region(String region) {
        this.region = region;
        return this;
    }

    /**
     *
     * @param withThrottledRetries
     * @return
     */
    public ANPRCloudConfig withThrottledRetries(boolean withThrottledRetries) {
        this.withThrottledRetries = withThrottledRetries;
        return this;
    }
}
