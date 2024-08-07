#!/usr/bin/env kotlin

/*
 * 7. SHELL SCRIPTING - Use other shell programs and utilities
 */
@file:DependsOn("com.hexagonkt:core:3.6.1")

import com.hexagonkt.core.logging.*
import com.hexagonkt.core.exec
import com.hexagonkt.core.shell

import kotlin.system.exitProcess

/*
 * Other programs can be executed from a script
 */
"ls -AlF".exec()
"du -hs".exec().info()

/*
 * You can use subshells to redirect and/or pipe data
 */
"echo 'Hello' >> out/local_log.txt".shell()

/*
 * Printing to STDOUT can be piped to other scripts/programs in the command line
 */
println("result")

/*
 * Force script exit with a given exit code (0 is OK)
 */
exitProcess(0)
