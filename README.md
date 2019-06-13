# Rules-Execution
The Rules Execution module executes RESTful Web Services as a means to activate actuators 

# Introduction
The soft-iot-rules-execution module executes the RESTful web services to enable the attendants (e.g air conditioner, window, alarm, semaphore, etc.) to send random messages through the MQTT protocol.

# Deployment
For installation of Rules Execution it is necessary to execute the following commands in the ServiceMix terminal:


karaf@root()> bundle:install mvn: br.dcc.ufba.wiser.smartufba.rulesexecution/Rules-Execution/

# Activation

To activate a device:

http://<servicemix−urls>:<servicemix−port>/cxf/lamp/devices/actuator/lamp


## Support and development

<p align="center">
	Developed by Cleber Jorge Lira at </br>
  <img src="https://wiki.dcc.ufba.br/pub/SmartUFBA/ProjectLogo/wiserufbalogo.jpg"/>
</p>


