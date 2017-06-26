FROM registry.access.redhat.com/rhel7-atomic
RUN microdnf --enablerepo=rhel-7-server-rpms \
install java-1.8.0-openjdk-headless --nodocs \
install tar -y ;\
microdnf clean all
COPY ./.s2i/bin/ /usr/libexec/s2i
#USER 1001
