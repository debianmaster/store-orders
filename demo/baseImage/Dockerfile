FROM registry.access.redhat.com/rhel7-atomic
RUN microdnf --enablerepo=rhel-7-server-rpms \
install java-1.8.0-openjdk-headless --nodocs ;\
microdnf clean all
ADD .s2i ./.s2i
