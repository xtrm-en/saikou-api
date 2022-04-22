# saikou-api [![Build][badge-github-ci]][project-gradle-ci] [![Maven Central][badge-mvnc]][project-mvnc]

Saikou's API, to be used when creating extensions.

# importing

you can import [saikou-api][project-url] from [maven central][mvnc] just by adding it to your dependencies:

## gradle

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("fr.stardustenterprises:saikou-api:0.1.0")
}
```

## maven

```xml
<dependency>
    <groupId>me.xtrm</groupId>
    <artifactId>saikou-api</artifactId>
    <version>0.1.0</version>
</dependency>
```

# troubleshooting

if you ever encounter any problem **related to this project**, you can [open an issue][new-issue] describing what the
problem is. please, be as precise as you can, so that we can help you asap. we are most likely to close the issue if it
is not related to our work.

# contributing

you can contribute by [forking the repository][fork], making your changes and [creating a new pull request][new-pr]
describing what you changed, why and how.

# licensing

this project is under the [ISC license][project-license].


<!-- Links -->

[jvm]: https://adoptium.net "adoptium website"

[kotlin]: https://kotlinlang.org "kotlin website"

[rust]: https://rust-lang.org "rust website"

[mvnc]: https://repo1.maven.org/maven2/ "maven central website"

<!-- Project Links -->

[project-url]: https://github.com/xtrm-en/saikou-api "project github repository"

[fork]: https://github.com/xtrm-en/saikou-api/fork "fork this repository"

[new-pr]: https://github.com/xtrm-en/saikou-api/pulls/new "create a new pull request"

[new-issue]: https://github.com/xtrm-en/saikou-api/issues/new "create a new issue"

[project-mvnc]: https://maven-badges.herokuapp.com/maven-central/fr.stardustenterprises/saikou-api "maven central repository"

[project-gradle-ci]: https://github.com/xtrm-en/saikou-api/actions/workflows/gradle-ci.yml "gradle ci workflow"

[project-license]: https://github.com/xtrm-en/saikou-api/blob/trunk/LICENSE "LICENSE source file"

<!-- Badges -->

[badge-mvnc]: https://maven-badges.herokuapp.com/maven-central/fr.stardustenterprises/saikou-api/badge.svg "maven central badge"

[badge-github-ci]: https://github.com/xtrm-en/saikou-api/actions/workflows/build.yml/badge.svg?branch=trunk "github actions badge"
