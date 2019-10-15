# Spring Boot CommandLineRunner

CommandLineRunner run() will get execute, just after applicationcontext is created and before springboot application starts up.
It accepts the argument, which are passed at time of server startup.
## Description

## Demo

```
$ java -jar ./build/libs/*.jar parameter1 parameter2 parameter3


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.9.RELEASE)

16-10-2019 07:47:45.942 [main           ] INFO  o.springframework.boot.StartupInfoLogger - Starting CmdRunnerApplicationKt on shinyay.local with PID 9324 (/Users/shinyay/works/spring/spring-cmdline-runner/build/libs/cmdrunner-0.0.1-SNAPSHOT.jar started by shinyay in /Users/shinyay/works/spring/spring-cmdline-runner)
16-10-2019 07:47:45.946 [main           ] INFO  o.springframework.boot.SpringApplication - No active profile set, falling back to default profiles: default
16-10-2019 07:47:47.156 [main           ] INFO  o.springframework.boot.StartupInfoLogger - Started CmdRunnerApplicationKt in 2.066 seconds (JVM running for 2.842)
16-10-2019 07:47:47.158 [main           ] INFO  i.p.s.c.component.SimpleCmdRunner        - Executing the command line runner, Application arguments: [parameter1, parameter2, parameter3]
```

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
