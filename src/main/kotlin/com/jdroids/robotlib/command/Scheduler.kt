package com.jdroids.robotlib.command

/**
 * The [Scheduler] interface represents what a scheduler should do/
 */
interface Scheduler {
    /**
     * Should make it so that the given [subsystem's][Subsystem]
     * [periodic][Subsystem.periodic] function is called when [periodic] is
     * called.
     *
     * @param subsystem the subsystem that registers
     */
    fun register(subsystem: Subsystem)

    /**
     * Should start a given [Command], and add make it so that it's state is
     * updated when [periodic] is called.
     *
     * @param command the command to run
     */
    fun run(command: Command)

    /**
     * This function updates the state of everything the [Scheduler] is keeping
     * track of. It should be called as often as possible.
     */
    fun periodic()

    /**
     * This should ensure that a given [Command] can take control of a given
     * [Subsystem].
     *
     * @param command the [Command] to check
     * @param subsystem the [Subsystem] to check
     */
    fun requires(command: Command, subsystem: Subsystem)

    /**
     * This clears the subsystem requirements for a given command.
     *
     * @param command the command who's requirement you want to clear
     */
    fun clearSubsystemRequirements(command: Command)
}