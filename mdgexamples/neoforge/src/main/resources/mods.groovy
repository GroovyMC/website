NeoForgeModsDotGroovy.make {
    // The mod is loaded by the javafml language (i.e. @Mod)
    modLoader = 'javafml'

    // Depend on any version greater than 1 of FML, equivalent to [1,) using Maven version ranges
    // You can also use rawVersionRange('<mavenRange>') if we do not support parsing a specific range you want
    // See the dedicated page on version ranges for more information
    loaderVersion = v('>=1')

    // The license if the mod is under
    license = 'MIT'

    // A link to the issue tracker of the mod
    issueTrackerUrl = 'https://github.com/example/mod/issues'

    // Configure a mod
    mod {
        // The ID of the mod
        modId = 'mymod'
        // The display name of the mod
        displayName = 'My mod'

        // The description of the mod. Supports multi-line strings
        description = '''
        My awesome mod
        '''.trim()

        // The path to your mod logo, relative to the jar root
        logoFile = 'mymod.png'

        // The version of the mod. You can hardcode this or use '${file.jarVersion}' to substitute it with the
        // Implementation-Version of the mod jar
        // Alternatively you can pull the version of your Gradle Project through the syntax specified below
        version = environmentInfo.version

        // The authors of the mod
        authors = ['Myself', 'I']

        // Optional property that indicates who to credit for the mod too
        // credits = ''

        // A link to the homepage of your mod
        // This is usually a GitHub link, CurseForge link or Modrinth link
        displayUrl = 'https://www.curseforge.com/minecraft/mc-mods/example-mod'

        // Declare mod dependencies
        dependencies {
            // Depend on any 20.4 NeoForge version
            neoforge = '[20.4,)'
            // Depend on any Minecraft version greater than 1.20.4 but lower than 1.21
            minecraft = '[1.20.4, 1.21)'

            // Declare an optional JEI dependency
            mod('jei') {
                // This dependency is against any version of JEI with the major component 17
                versionRange = '17.*'
                type = DependencyType.OPTIONAL
            }
        }
    }

    // Declare your mixin configs
    mixins {
        mixin 'mymod.mixins.json'
    }

    // Declare the paths to your AT files
    accessTransformers {
        accessTransformer 'META-INF/accesstransformer.cfg'
    }
}
