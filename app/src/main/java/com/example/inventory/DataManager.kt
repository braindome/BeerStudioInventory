package com.example.inventory

object DataManager {
    val catalogue = mutableListOf<Beer>()

    init {
        createMockData()
    }

    fun createMockData() {
        catalogue.add(Beer("A Moment of Clarity", "Session IPA", R.drawable.beerbliotek_clarity_session_24_90, 24.90))
        catalogue.add(Beer("Blue Sombrero", "Sour", R.drawable.duckpond_bluesombrero_sour_44_90, 44.90))
        catalogue.add(Beer("Bite", "IPA", R.drawable.dugges_bite_epa_21_90, 21.90))
        catalogue.add(Beer("Finn", "Unfiltered Lager", R.drawable.finn_unfiltered_lager_23_90, 23.90))
        catalogue.add(Beer("Julänna", "Christmas Lager", R.drawable.oddisland_jul_nna_darklager_29_10, 29.10))
        catalogue.add(Beer("Utah", "DIPA", R.drawable.oppig_rds_utah_dipa_32_90, 32.90))
        catalogue.add(Beer("East Coast", "Hazy IPA", R.drawable.poppels_eastcoast_hazy_33_90, 33.90))
        catalogue.add(Beer("Back in Business", "DIPA", R.drawable.spike_bib_dipa_49_60, 49.60))
        catalogue.add(Beer("Trouble Sleep", "Porter", R.drawable.stigbergets_troublesleep_porter_48_90, 48.90))
        catalogue.add(Beer("Smokey Mountain", "Smokey", R.drawable.svartbergets_smokeymountain_smoke_34_10, 34.10))
    }
}