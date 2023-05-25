plugins {
    id("org.jetbrains.kotlin.jvm").version("1.8.21")
    id("com.apollographql.apollo3").version("3.8.1")
}

repositories {
    mavenCentral()
}

apollo {
    service("api") {
        packageName.set("com.example")
        introspection {
            endpointUrl.set("https://confetti-app.dev/graphql")
            schemaFile.set(file("src/main/graphql/schema.graphqls"))
        }
    }
}