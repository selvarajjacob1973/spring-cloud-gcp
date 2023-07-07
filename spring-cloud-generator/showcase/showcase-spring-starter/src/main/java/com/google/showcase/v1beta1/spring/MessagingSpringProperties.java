/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.showcase.v1beta1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import com.google.cloud.spring.core.Retry;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for Messaging client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.showcase.v1beta1.messaging")
public class MessagingSpringProperties implements CredentialsSupplier {
  /** OAuth2 credentials to authenticate and authorize calls to Google Cloud Client Libraries. */
  @NestedConfigurationProperty private final Credentials credentials = new Credentials();
  /** Quota project to use for billing. */
  private String quotaProjectId;
  /** Number of threads used for executors. */
  private Integer executorThreadCount;
  /** Allow override of default transport channel provider to use REST instead of gRPC. */
  private boolean useRest = false;
  /** Allow override of retry settings at service level, applying to all of its RPC methods. */
  @NestedConfigurationProperty private Retry retry;
  /**
   * Allow override of retry settings at method-level for createRoom. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createRoomRetry;
  /**
   * Allow override of retry settings at method-level for getRoom. If defined, this takes precedence
   * over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getRoomRetry;
  /**
   * Allow override of retry settings at method-level for updateRoom. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateRoomRetry;
  /**
   * Allow override of retry settings at method-level for deleteRoom. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteRoomRetry;
  /**
   * Allow override of retry settings at method-level for listRooms. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listRoomsRetry;
  /**
   * Allow override of retry settings at method-level for createBlurb. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createBlurbRetry;
  /**
   * Allow override of retry settings at method-level for getBlurb. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getBlurbRetry;
  /**
   * Allow override of retry settings at method-level for updateBlurb. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateBlurbRetry;
  /**
   * Allow override of retry settings at method-level for deleteBlurb. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteBlurbRetry;
  /**
   * Allow override of retry settings at method-level for listBlurbs. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listBlurbsRetry;
  /**
   * Allow override of retry settings at method-level for listLocations. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listLocationsRetry;
  /**
   * Allow override of retry settings at method-level for getLocation. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getLocationRetry;

  @Override
  public Credentials getCredentials() {
    return this.credentials;
  }

  public String getQuotaProjectId() {
    return this.quotaProjectId;
  }

  public void setQuotaProjectId(String quotaProjectId) {
    this.quotaProjectId = quotaProjectId;
  }

  public boolean getUseRest() {
    return this.useRest;
  }

  public void setUseRest(boolean useRest) {
    this.useRest = useRest;
  }

  public Integer getExecutorThreadCount() {
    return this.executorThreadCount;
  }

  public void setExecutorThreadCount(Integer executorThreadCount) {
    this.executorThreadCount = executorThreadCount;
  }

  public Retry getRetry() {
    return this.retry;
  }

  public void setRetry(Retry retry) {
    this.retry = retry;
  }

  public Retry getCreateRoomRetry() {
    return this.createRoomRetry;
  }

  public void setCreateRoomRetry(Retry createRoomRetry) {
    this.createRoomRetry = createRoomRetry;
  }

  public Retry getGetRoomRetry() {
    return this.getRoomRetry;
  }

  public void setGetRoomRetry(Retry getRoomRetry) {
    this.getRoomRetry = getRoomRetry;
  }

  public Retry getUpdateRoomRetry() {
    return this.updateRoomRetry;
  }

  public void setUpdateRoomRetry(Retry updateRoomRetry) {
    this.updateRoomRetry = updateRoomRetry;
  }

  public Retry getDeleteRoomRetry() {
    return this.deleteRoomRetry;
  }

  public void setDeleteRoomRetry(Retry deleteRoomRetry) {
    this.deleteRoomRetry = deleteRoomRetry;
  }

  public Retry getListRoomsRetry() {
    return this.listRoomsRetry;
  }

  public void setListRoomsRetry(Retry listRoomsRetry) {
    this.listRoomsRetry = listRoomsRetry;
  }

  public Retry getCreateBlurbRetry() {
    return this.createBlurbRetry;
  }

  public void setCreateBlurbRetry(Retry createBlurbRetry) {
    this.createBlurbRetry = createBlurbRetry;
  }

  public Retry getGetBlurbRetry() {
    return this.getBlurbRetry;
  }

  public void setGetBlurbRetry(Retry getBlurbRetry) {
    this.getBlurbRetry = getBlurbRetry;
  }

  public Retry getUpdateBlurbRetry() {
    return this.updateBlurbRetry;
  }

  public void setUpdateBlurbRetry(Retry updateBlurbRetry) {
    this.updateBlurbRetry = updateBlurbRetry;
  }

  public Retry getDeleteBlurbRetry() {
    return this.deleteBlurbRetry;
  }

  public void setDeleteBlurbRetry(Retry deleteBlurbRetry) {
    this.deleteBlurbRetry = deleteBlurbRetry;
  }

  public Retry getListBlurbsRetry() {
    return this.listBlurbsRetry;
  }

  public void setListBlurbsRetry(Retry listBlurbsRetry) {
    this.listBlurbsRetry = listBlurbsRetry;
  }

  public Retry getListLocationsRetry() {
    return this.listLocationsRetry;
  }

  public void setListLocationsRetry(Retry listLocationsRetry) {
    this.listLocationsRetry = listLocationsRetry;
  }

  public Retry getGetLocationRetry() {
    return this.getLocationRetry;
  }

  public void setGetLocationRetry(Retry getLocationRetry) {
    this.getLocationRetry = getLocationRetry;
  }
}