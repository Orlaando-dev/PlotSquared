rootProject.name = "PlotSquared"

include("Core", "Bukkit", "Fabric")

project(":Core").name = "plotsquared-core"
project(":Bukkit").name = "plotsquared-bukkit"
project(":Fabric").name = "plotsquared-fabric"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
