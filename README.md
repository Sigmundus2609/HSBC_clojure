# hello

This is a simple program that will printout the hello message upon call and terminate the work.

## Installation

In order to make it run you need to download this script: https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein

Place it under the ~/bin and add execution rights, then simply execute by typing ./lein

## Usage

Upon succesfull installation of lien you shhould be able to execute the following:
	
```lein do test, uberjar, pom```

to build a program.

Once build, under the ${GIT_PATH}/hello/target/uberjar your artiffacts will be built.

In order to run the artiffact simply  execute:

``` java -jar target/{artifactid}-{version}-standalone.jar```

The output of the  program shall be:

```
Hello, world!
```



## Examples

Example of running program:

```
/home/Sigmundus2609/clojure/hello/target/uberjar
[Sigmundus2609@pc-3 uberjar]$ java -jar hello-0.1.0-SNAPSHOT-standalone.jar 
Hello, World!
```
### Bugs

...

### Might be Useful

## License

Copyright © 2022 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
