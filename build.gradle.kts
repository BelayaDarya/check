plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

ext["selenium.version"] = "4.4.0"

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("org.seleniumhq.selenium', name: 'selenium-java', version: '4.4.0")

}

tasks.test {
    useJUnitPlatform()
}