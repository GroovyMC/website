---
sidebar_position: 0
---

# Mods.groovy
ModsDotGroovy v2 is a tool that allows writing Minecraft mod metadata files in Groovy which is then compiled down to
a `mods.toml`, `fabric.mod.json`, `quilt.mod.json` and/or `plugin.yml` when the mod is built.

It features a swappable frontend for adjusting IDE suggestions based on your target mod loader and a plugin system for
adding support for new platforms and functionality.

## Getting started
To start using mods.groovy, simply add the plugin to your `build.gradle`:
```groovy
plugins {
    id 'org.groovymc.modsdotgroovy' version '2.0.0-beta.10'
}
```

:::tip
You can find the latest version of the plugin [here](https://plugins.gradle.org/plugin/org.groovymc.modsdotgroovy).
:::

Then add a `mods.groovy` file to your resources folder:
```
└──📂 src
   └──📂 main
      └──📂 resources
         └──📄 mods.groovy
```

By default, the Gradle plugin detects your platform and sets up the right mods.groovy DSL frontend and plugins for you.
The built toml/json files are put in your built jar in the place your chosen mod loader expects.
