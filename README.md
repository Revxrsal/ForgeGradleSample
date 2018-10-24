# ForgeGradle Sample
This is a simple project which uses ForgeGradle version 2.1-SNAPSHOT (and Minecraft version **1.8.9**) (Usually used to build Minecraft clients using the Gradle build system).

This project comes with a simple tweaker class for game launching, and an already-setup mixins environment, and includes an example for people who were never subject to the usage of mixins.

# Setting up
Warning: **It's highly recommended to use this in IntelliJ IDEA! Those steps were not tested in other IDEs and IntelliJ seems to offer the best compatibility for them!**

**[1]** Clone this repository (Google this if you don't know how to clone in IntelliJ IDEA)

**[2]** After IntelliJ IDEA clones successfully, choose your desired Gradle configurations.

**[3]** Run task: **genIntellijRuns**.

**[4]** Run task: **setupDecompWorkspace**.

**[5]** After all the tasks above are done, refresh your project and you should have all the required dependencies and be ready to start your development.