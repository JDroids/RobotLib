package com.jdroids.robotlib.util

/**
 * An interface for controllers. Controllers run control loops, the most command are PID controllers
 * and their variants, but this includes anything that is controlling an actuator in a separate
 * thread.
 */
interface Controller {
    /**
     * Allows the control loop to run
     */
    fun enable()

    /**
     * Stops the control loop from running until explicitly re-enabled by calling [enable].
     */
    fun disable()
}