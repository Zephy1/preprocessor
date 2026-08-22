rootProject.name = "preprocessor"

includeBuild("../remap") {
    dependencySubstitution {
        substitute(module("com.github.replaymod:remap")).using(project(":"))
    }
}
