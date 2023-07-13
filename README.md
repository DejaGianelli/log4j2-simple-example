# Log4j2

Log4j2 provides a set of log levels that developers can use to 
categorize and prioritize log messages. In Log4j, the log 
levels, listed in increasing order of severity, are as follows:

## Log Levels

1) **TRACE**: Typically used to provide the most detailed information about an application's execution, including 
method entry and exit points, variable values, and other detailed diagnostic information
2) **DEBUG**: Debug logs are typically used to output information that helps developers understand the application's 
internal workings and track the execution flow
3) **INFO**: Captures important application events and milestones
4) **WARN**: Captures potential issues or situations that may lead to errors or unexpected behavior.
5) **ERROR**: Captures unexpected conditions or failures that prevent the application 
from completing operations or functioning as intended
6) **FATAL**:  Can be used to capture critical errors or failures that severely impact 
the application and may result in immediate termination

By configuring the log level in Log4j, developers can control 
the verbosity of log output and filter logs based on their 
significance, making it easier to focus on relevant log 
messages during development, debugging, and troubleshooting.