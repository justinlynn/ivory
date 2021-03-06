
HADOOP=${HADOOP:-hadoop-2.2.0-cdh5.0.0-beta-2}

export AWS_DEFAULT_REGION=ap-southeast-2
# For hadoop - needs JAVA_HOME set, but only for the 'java' command. :(
export JAVA_HOME=$(dirname $(which java))/..

if [ ! -e "${DIR}/target/${HADOOP}" ]; then
    mkdir -p ${DIR}/target
    curl "http://archive-primary.cloudera.com/cdh5/cdh/5/${HADOOP}.tar.gz" > ${DIR}/target/${HADOOP}.tar.gz
    tar xf ${DIR}/target/${HADOOP}.tar.gz -C ${DIR}/target/
fi
