def execute(){
    sh "./gradlew -b ./workspace/build.gradle clean :stage-060-aat:test --info"
}
return this