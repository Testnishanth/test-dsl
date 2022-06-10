job('my-job') {
    scm {
        git('https://github.com/Testnishanth/test-dsl.git')
    }
    triggers {
    }
    steps {
        maven('-e clean test')
    }
}