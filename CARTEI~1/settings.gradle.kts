pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// Projeto acadêmico: protótipo de interface de carteirinha estudantil fictícia.
// Sem qualquer finalidade de uso como documento real.
rootProject.name = "CarteirinhaAcademica"
include(":app")
