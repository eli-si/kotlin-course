plugins {
    kotlin("jvm") version "2.2.0"
}

group = "ru.stimmax"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

// Глобально для всех JavaExec-задач (run, custom mains и т.п.)
tasks.withType<JavaExec>().configureEach {
    jvmArgs("-Dfile.encoding=UTF-8")
}

// Для тестов (если есть)
tasks.withType<Test>().configureEach {
    jvmArgs("-Dfile.encoding=UTF-8")
    systemProperty("file.encoding", "UTF-8")
}

// (Опционально) для Java-компилятора — на случай смешанных модулей
tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}