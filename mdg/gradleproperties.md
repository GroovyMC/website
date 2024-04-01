# Gradle properties
Mods.groovy lets you expose project properties to your `mods.groovy` file, which can be accessed with the
`buildProperties['propertyName']` syntax. This contains only properties you explicitly expose:
```groovy
modsDotGroovy.gather {
    projectProperty 'propertyName'
}
```

Note that `.gather` is shorthand for configuring the default generated gather tasks; a similar `.convert` shorthand exists
for configuring the generated conversion tasks.

## Version Catalogs
Mods.groovy can capture version catalogs and exposes the values to the `mods.groovy` file; they are accessible through the
`libs` property. By default, the `libs` version catalog is captured if it exists. To change which catalogs are captured,
add to the `catalogs` property:
```groovy
modsDotGroovy {
    catalogs.add 'anotherVersionCatalog'
}
```
All captured version catalogs are merged and exposed in the same `libs` property.

## Environment Information
The `environmentInfo` property exposes the raw information passed into the `mods.groovy` environment; in addition to the
build property and version catalog information, a group and version (defaulting to the project group and version) are passed
in as `environmentInfo.version` and `environmentInfo.group`. The group and version passed in can be configured on the
conversion task:
```groovy
modsDotGroovy.convert {
    projectVersion.set '1.0.0'
    projectGroup.set 'org.example'
}
```