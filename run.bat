set file_name=RiskJadex.jar

del %file_name%
del src\partida\plans\*class
set classpath=src\lib\Base64.jar;src\lib\GraphLayout.jar;src\lib\bcel.jar;\src\lib\http.jar;src\lib\iiop.jar;src\lib\jade.jar;src\lib\jadeTools.jar;src\lib\jadex_examples.jar;src\lib\jadex_jadeadapter.jar;src\lib\jadex_rt.jar;src\lib\jadex_standalone.jar;src\lib\jadex_tools.jar;src\lib\jhall.jar;src\lib\jibx-bind.jar;src\lib\jibx-extras.jar;src\lib\jibx-run.jar;src\lib\xpp3.jar;src;src\lib\commons-commons\commons-codec-1.3.jar

javac src\partida\*java
javac src\partida\plans\*java
javac src\partida\beliefs\*java

javac src\jugador\*java
javac src\jugador\plans\*java
javac src\tablero\*java
javac src\tablero\plans\*java
javac src\mapa\*java
javac src\mapa\plans\*java

pause
jar cvf %file_name% *
pause 

set classpath=%file_name%;%classpath%

java jadex.adapter.standalone.Platform
pause

