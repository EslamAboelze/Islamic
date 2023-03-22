package com.example.islamic.model

data class CustomSpinner(val text :String)
object praise {
    private val listOfPraise = arrayListOf(
        "اختر ذكرًا ",
        "سُبْحَانَ اللَّهِ وَبِحَمْدِهِ سُبْحَانَ اللَّهِ الْعَظِيمِ",
        "لا حَوْلَ وَلا قُوَّةَ إِلا بِاللَّهِ",
        "أستغفر الله",
        "لَا إِلَهَ إِلَّا اللَّهُ",
        "الْحَمْدُ لِلَّهِ حَمْدًا كَثِيرًا طَيِّبًا مُبَارَكًا فِيه ",
        "اللهم اتنا في الدنيا حسنه وفي الاخره حسنه وقنا عذاب النار",
        "اللَّهُ أَكْبَرُ كَبِيرًاوَالْحَمْدُ لِلَّهِ كَثِير ًاوَسُبْحَانَ اللَّهِ بُكْرَةًوَأَصِيلاً",
        "سُبْحَانَ اللَّهِ"
    )
    var list: ArrayList<CustomSpinner>? = null
        get() {
            // var field = null
            if (field != null)
                return field
            field = ArrayList()
            for (i in listOfPraise.indices) {

                val praisename = listOfPraise[i]
                val praise = CustomSpinner(praisename)
                field!!.add(praise)
            }
            return field
        }

}



