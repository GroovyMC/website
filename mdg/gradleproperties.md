# Gradle properties
Mods.groovy gives you access to Gradle properties in your `mods.groovy` file with the `buildProperties['propertyName']` syntax.  
This contains the properties from your gradle.properties file and any global ones, so you may want to blacklist them to
avoid leaking private keys.

## Blacklisting
By default, the Gradle plugin excludes properties whose name contains (case-insensitive):
- pass
- password
- token
- key
- secret

You can change the blacklist with:
```groovy
modsDotGroovy {
    environmentBlacklist = ['private']
}
```

:::caution
This overwrites the default blacklist, so you should copy over the words above if you want to add new entries
rather than replace.
:::