package com.mayaiconsdark.app

import com.github.javiersantos.piracychecker.PiracyChecker
import dev.jahir.blueprint.ui.activities.BottomNavigationBlueprintActivity

class MainActivity : BottomNavigationBlueprintActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true
    override val isDebug: Boolean = BuildConfig.DEBUG

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtKbfxqa21/WghF+ocsC265DiAz8lnt3lx3Jc19Q9j47v0xcA9GFdrz9Cp0TdE7PCggM7kZGVDO2TO7uI3Oa/LIRs5vpWgomA/MgoSMxXCAYHaCWnuAa3BiUoGCtESLGD3nkP1+OnVxUFHxKORzBM4TNEtlpOX8EEw6WO4/v9TxA7G6lvomi9EVxQB3j1koRUSVCwsl6bLzHyqvRzG3IvqsQ6HwNxPKqglC06qCXmdbdOh6KeRX0nbYwXMSlpiaIjMI/MVouMnHTgw9NbonXs0Pkcm1vmPfi+avCpMGLP3VomvKUheqTaT5WiqwS/9JNlJwJb7xZM565A6F0iMMlPMQIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return null // Just for CI purposes
        // return if (BuildConfig.DEBUG) null
        // else super.getLicenseChecker()
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled

    override fun defaultMaterialYouTheme(): Int = R.style.MyApp_Default_MaterialYou
    override fun amoledMaterialYouTheme(): Int = R.style.MyApp_Default_Amoled_MaterialYou
}


