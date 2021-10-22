package com.ncorti.kotlin.gradle.template.plugin.analytics.nosara

import com.ncorti.kotlin.gradle.template.plugin.Environment
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Event(
    @SerialName("_en")
    val eventName: String,
    @SerialName("tasks")
    val tasks: List<String>,
    @SerialName("_ts")
    val eventTimestamp: Long,
    @SerialName("gradle_action")
    val gradleAction: String,
    @SerialName("build_time")
    val buildTime: Long,
    @SerialName("task_failed")
    val failed: Boolean,
    @SerialName("failure")
    val failure: String?,
    @SerialName("daemons_running")
    val daemonsRunning: Int,
    @SerialName("this_daemon_builds")
    val thisDaemonBuilds: Int,
    @SerialName("gradle_version")
    val gradleVersion: String,
    @SerialName("operating_system")
    val operatingSystem: String,
    @SerialName("environment")
    val environment: Environment,
    @SerialName("tasks_total")
    val tasksTotal: Int,
    @SerialName("tasks_up_to_date")
    val tasksUpToDate: Int,
    @SerialName("tasks_from_cache")
    val tasksFromCache: Int,
    @SerialName("tasks_executed")
    val tasksExecuted: Int,
    @SerialName("is_configure_on_demand")
    val isConfigureOnDemand: Boolean,
    @SerialName("is_configuration_cache")
    val isConfigurationCache: Boolean,
    @SerialName("is_build_cache")
    val isBuildCache: Boolean,
    @SerialName("maxWorkers")
    val maxWorkers: Int,
    @SerialName("_ut")
    val userType: String,
)
