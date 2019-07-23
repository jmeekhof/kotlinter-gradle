package org.jmailen.gradle.kotlinter.tasks.format

import com.pinterest.ktlint.core.RuleSetProvider
import java.util.Queue
import java.util.concurrent.ConcurrentLinkedQueue
import org.gradle.api.logging.Logger
import org.jmailen.gradle.kotlinter.support.ExecutionContext

/**
 * Execution context for the formatting task.
 */
data class FormatExecutionContext(
    val ruleSetProviders: Iterable<RuleSetProvider>,
    override val logger: Logger,
    val fixes: Queue<String> = ConcurrentLinkedQueue<String>()
) : ExecutionContext
