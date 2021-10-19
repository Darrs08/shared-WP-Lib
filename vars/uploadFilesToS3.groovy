def call(Map stageParams = [region: "us-east-1",  bucketName: "testbucket-darren", s3Path: ""]) {
    withAWS(region: stageParams.region, credentials:'cloud_user') {
        awsIdentity()
        s3Upload( 
            workingDir: stageParams.workingDir,
            includePathPattern: stageParams.stackFileName,
            bucket: stageParams.bucketName,
            path: stageParams.s3Path
        )
    }
}
