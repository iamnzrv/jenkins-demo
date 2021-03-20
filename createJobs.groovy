pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/iamnzrv/molva-employee.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}