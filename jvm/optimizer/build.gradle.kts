plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.ballistacompute"
            artifactId = "optimizer"
            version = "0.2.0"

            from(components["kotlin"])
        }
    }
}

dependencies {
    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))

    implementation("org.apache.arrow:arrow-memory:0.17.0")
    implementation("org.apache.arrow:arrow-vector:0.17.0")

}
