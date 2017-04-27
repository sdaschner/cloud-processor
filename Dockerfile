FROM sebastian-daschner.com:1000/wildfly:6

COPY target/cloud-processor.war /opt/wildfly/standalone/deployments/
