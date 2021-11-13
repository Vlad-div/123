package com.example.clickproject

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import com.example.clickproject.databinding.ActivityMainBinding
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {

    var c2 = 0
    var monay: Int = 0
    var technologyLvl: Int = 0
    var technologyPrice: Int = 1000
    var valueManyAvt: Int = 0
    var valueManyAvt2: Int = 0
    var valueManyAvt3: Int = 0
    var valueManyAvt4: Int = 0
    var textPlusManyValue: Int = 0
    var maxPom2: Int = 0
    var maxPom: Int = 1
    var lvlUpProject: Int = 0
    var lvlUpProjectBur: Int = 12
    var lvlTexClick: Int = 1
    var lvlTexClickAvt: Int = 0
    var lvlTexClickAvt2: Int = 0
    var lvlTexClickAvt3: Int = 0
    var lvlTexClickAvt4: Int = 0
    var kolMat: Int = 0
    var kolMat2: Int = 0
    var kolMat3: Int = 0
    var kolMat4: Int = 0

    var editText: EditText? = null
    var editText2: EditText? = null
    var editText3: EditText? = null
    var editText4: EditText? = null
    var editText5: EditText? = null
    var editText6: EditText? = null
    var textMonay: TextView? = null

    var open: ImageView? = null
    var open2: ImageView? = null
    var techno: Button? = null
    var btnOne: Button? = null
    var btnclick1: Button? = null
    var btnclick2: Button? = null
    var btnclick3: Button? = null
    var btnclick4: Button? = null
    var btnclick5: Button? = null
    var btnclick6: Button? = null
    var btnclick7: Button? = null
    var btnclick8: Button? = null
    var btnclick9: Button? = null
    var btnclick10: Button? = null
    var btnclick11: Button? = null
    var btnclick12: Button? = null

    var textPrice: TextView? = null
    var textPrice2: TextView? = null
    var textPrice3: TextView? = null
    var textPrice4: TextView? = null
    var textPrice5: TextView? = null
    var saveItem: SharedPreferences? = null
    var textLvl: TextView? = null
    var textLvl2: TextView? = null
    var textLvl3: TextView? = null
    var textLvl4: TextView? = null
    var textLvl5: TextView? = null
    var textPlusMany: TextView? = null
    var technoLvl: TextView? = null
    var technoPrice: TextView? = null
    var nextLvlBur: TextView? = null

    var start: Boolean = false
    var start2: Boolean = true
    var start3: Boolean = true
    var enabledTrue: Boolean? = null
    var enabledTrue2: Boolean? = null
    var enabledTrue3: Boolean? = null
    var enabledTrue4: Boolean? = null
    var enabledTrue5: Boolean? = null
    var enabledTrue6: Boolean? = null

    var randNum = 0
    var randNum2 = 0
    var randNum3 = 0
    var randNum4 = 0

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            open.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
                c2 = saveItem?.getInt("C2", 0)!!
                if (c2 < 1) {
                    c2 = 1
                    openDialog()
                    saveC2(c2)
                }
            }
        }
        binding.apply {
            open2.setOnClickListener {
                drawer.openDrawer(GravityCompat.END)
            }
        }

        open = findViewById(R.id.open)
        open2 = findViewById(R.id.open2)
        techno = findViewById(R.id.techno)
        textMonay = findViewById(R.id.textMonay)
        btnOne = findViewById(R.id.button)
        textPlusMany = findViewById(R.id.textPlusMany)

        btnclick1 = findViewById(R.id.clickUp1)
        btnclick2 = findViewById(R.id.clickUp2)
        btnclick3 = findViewById(R.id.clickUp3)
        btnclick4 = findViewById(R.id.clickUp4)
        btnclick5 = findViewById(R.id.clickUp5)
        btnclick6 = findViewById(R.id.clickUp6)
        btnclick7 = findViewById(R.id.clickUp7)
        btnclick8 = findViewById(R.id.clickUp8)
        btnclick9 = findViewById(R.id.clickUp9)
        btnclick10 = findViewById(R.id.clickUp10)
        btnclick11 = findViewById(R.id.clickUp11)
        btnclick12 = findViewById(R.id.clickUp12)

        editText = findViewById(R.id.EditText)
        editText2 = findViewById(R.id.EditText2)
        editText3 = findViewById(R.id.EditText3)
        editText4 = findViewById(R.id.EditText4)
        editText5 = findViewById(R.id.EditText5)
        editText6 = findViewById(R.id.EditText6)

        textPrice = findViewById(R.id.textPrice)
        textPrice2 = findViewById(R.id.textPrice2)
        textPrice3 = findViewById(R.id.textPrice3)
        textPrice4 = findViewById(R.id.textPrice4)
        textPrice5 = findViewById(R.id.textPrice5)
        technoPrice = findViewById(R.id.technoPrice)

        textLvl = findViewById(R.id.textLvl)
        textLvl2 = findViewById(R.id.textLvl2)
        textLvl3 = findViewById(R.id.textLvl3)
        textLvl4 = findViewById(R.id.textLvl4)
        textLvl5 = findViewById(R.id.textLvl5)
        technoLvl = findViewById(R.id.technoLvl)
        nextLvlBur = findViewById(R.id.nextLvlBur)

        saveItem = getSharedPreferences("TABLE", Context.MODE_PRIVATE)

        start2 = saveItem?.getBoolean("Start2", true)!!

        randNum = saveItem?.getInt("randNum", 0)!!
        randNum2 = saveItem?.getInt("randNum2", 0)!!
        randNum3 = saveItem?.getInt("randNum3", 0)!!
        randNum4 = saveItem?.getInt("randNum4", 0)!!

        monay = saveItem?.getInt("Many", 0)!!
        textPlusManyValue = saveItem?.getInt("textPlusManyValue", 0)!!
        lvlUpProject = saveItem?.getInt("lvlUpProject", 0)!!
        lvlUpProjectBur = saveItem?.getInt("lvlUpProjectBur", 12)!!

        valueManyAvt = saveItem?.getInt("valueManyAvt", 0)!!
        valueManyAvt2 = saveItem?.getInt("valueManyAvt2", 0)!!
        valueManyAvt3 = saveItem?.getInt("valueManyAvt3", 0)!!
        valueManyAvt4 = saveItem?.getInt("valueManyAvt4", 0)!!

        maxPom = saveItem?.getInt("maxPom", 1)!!
        maxPom2 = saveItem?.getInt("maxPom2", 0)!!

        technologyLvl = saveItem?.getInt("technologyLvl", 0)!!
        lvlTexClick = saveItem?.getInt("TechnologyLvl", 1)!!
        lvlTexClickAvt = saveItem?.getInt("TechnologyLvlAvt", 0)!!
        lvlTexClickAvt2 = saveItem?.getInt("TechnologyLvlAvt2", 0)!!
        lvlTexClickAvt3 = saveItem?.getInt("TechnologyLvlAvt3", 0)!!
        lvlTexClickAvt4 = saveItem?.getInt("TechnologyLvlAvt4", 0)!!

        technologyPrice = saveItem?.getInt("technologyPrice", 1000)!!
        kolMat = saveItem?.getInt("kolMat", 0)!!
        kolMat2 = saveItem?.getInt("kolMat2", 0)!!
        kolMat3 = saveItem?.getInt("kolMat3", 0)!!
        kolMat4 = saveItem?.getInt("kolMat4", 0)!!

        textMonay?.setText(monay.toString() + " $")
        textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")

        textLvl?.setText(lvlTexClick.toString() + "Lvl")
        technoLvl?.setText(technologyLvl.toString() + " Lvl")
        textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
        textLvl3?.setText(lvlTexClickAvt2.toString() + " чел.")
        textLvl4?.setText(lvlTexClickAvt3.toString() + " чел.")
        textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")

        textPrice?.setText(lvlUpProject.toString() + "/" + lvlUpProjectBur.toString())
        technoPrice?.setText(technologyPrice.toString() + '$')
        textPrice2?.setText(kolMat.toString())
        textPrice3?.setText(kolMat2.toString() + "ед.")
        textPrice4?.setText(kolMat3.toString() + "ед.")
        textPrice5?.setText(kolMat4.toString() + "ед.")

        techno?.setOnClickListener { tecnoLvl() }

        btnOne?.setOnClickListener { addMonay() }
        btnclick1?.setOnClickListener { clickUpTechnologyAvt1() }
        btnclick2?.setOnClickListener { clickUpTechnologyAvt11() }
        btnclick3?.setOnClickListener { clickUpTechnologyAvt2() }
        btnclick4?.setOnClickListener { clickUpTechnologyAvt21() }
        btnclick5?.setOnClickListener { clickUpTechnologyAvt3() }
        btnclick6?.setOnClickListener { clickUpTechnologyAvt31() }
        btnclick7?.setOnClickListener { clickUpTechnologyAvt4() }
        btnclick8?.setOnClickListener { clickUpTechnologyAvt41() }
        btnclick9?.setOnClickListener { clickUpTechnologyAvt5() }
        btnclick10?.setOnClickListener { clickUpTechnologyAvt51() }
        btnclick11?.setOnClickListener { clickUpTechnologyAvt6() }
        btnclick12?.setOnClickListener { clickUpTechnologyAvt61() }

        arrayProv()

        Thread {
            while (start3) {
                runOnUiThread {
                    if (lvlTexClick < randNum) {
                        nextLvlBur?.setText(lvlTexClick.toString() + '/' + randNum.toString() + " Lvl")
                    } else if (lvlTexClick < randNum2) {
                        nextLvlBur?.setText(lvlTexClick.toString() + '/' + randNum2.toString() + " Lvl")
                    } else if (lvlTexClick < randNum3) {
                        nextLvlBur?.setText(lvlTexClick.toString() + '/' + randNum3.toString() + " Lvl")
                    } else if (lvlTexClick < randNum4) nextLvlBur?.setText(lvlTexClick.toString() + '/' + randNum4.toString() + " Lvl")
                    start3 = false
                }
            }
        }.start()

        Thread {
            while (start2) {
                runOnUiThread {
                    randNum = (10..25).random()
                    randNum2 = (50..100).random()
                    randNum3 = (150..200).random()
                    randNum4 = (250..500).random()
                    start2 = false
                    saveStartBool(start2)
                    saveRandNum(randNum)
                    saveRandNum2(randNum2)
                    saveRandNum3(randNum3)
                    saveRandNum4(randNum4)
                }
            }
        }.start()

        Thread {
            while (start2) {
                runOnUiThread {
                    kolMat = (10000..37000).random()
                    textPrice2?.setText(kolMat.toString())
                    start2 = false
                    saveStartBool(start2)
                }
            }
        }.start()

        Thread {
            while (start2) {
                runOnUiThread {
                    kolMat2 = (30000..100000).random()
                    textPrice3?.setText(kolMat2.toString())
                    start2 = false
                    saveStartBool(start2)
                }
            }
        }.start()

        Thread {
            while (start2) {
                runOnUiThread {
                    kolMat3 = (15000..60000).random()
                    textPrice4?.setText(kolMat3.toString())
                    start2 = false
                    saveStartBool(start2)
                }
            }
        }.start()

        Thread {
            while (start2) {
                runOnUiThread {
                    kolMat4 = (5000..30000).random()
                    textPrice5?.setText(kolMat4.toString())
                    start2 = false
                    saveStartBool(start2)
                }
            }
        }.start()

        Thread {
            start = true
            while (start) {
                Thread.sleep(1000)
                runOnUiThread {
                    valueManyAvt = maxPom2
                    textPlusManyValue =
                        maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
                    textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
                    monay = monay + valueManyAvt
                    textMonay?.setText(monay.toString() + "$")
                }
            }
        }.start()

        Thread {
            start = true
            while (start) {
                Thread.sleep(1000)
                runOnUiThread {
                    if (kolMat2 >= lvlTexClickAvt2) {
                        valueManyAvt2 = lvlTexClickAvt2 * 2
                        monay = monay + valueManyAvt2
                        kolMat2 = kolMat2 - lvlTexClickAvt2
                    } else {
                        while (kolMat2 < lvlTexClickAvt2) {
                            lvlTexClickAvt2--
                            maxPom++
                            maxPom2++
                            valueManyAvt2 = lvlTexClickAvt2 * 2
                            monay = monay + valueManyAvt2
                            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                        }
                    }
                    textMonay?.setText(monay.toString() + "$")
                    textLvl3?.setText(lvlTexClickAvt2.toString() + " чел.")
                    textPrice3?.setText(kolMat2.toString() + "ед.")
                }
            }
        }.start()

        Thread {
            start = true
            while (start) {
                Thread.sleep(1000)
                runOnUiThread {
                    if (kolMat3 >= lvlTexClickAvt3) {
                        valueManyAvt3 = lvlTexClickAvt3 * 4
                        monay = monay + valueManyAvt3
                        kolMat3 = kolMat3 - lvlTexClickAvt3
                    } else {
                        while (kolMat3 < lvlTexClickAvt3) {
                            lvlTexClickAvt3--
                            maxPom++
                            maxPom2++
                            valueManyAvt3 = lvlTexClickAvt3 * 4
                            monay = monay + valueManyAvt3
                            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                        }
                    }
                    textMonay?.setText(monay.toString() + "$")
                    textLvl4?.setText(lvlTexClickAvt3.toString() + " чел.")
                    textPrice4?.setText(kolMat3.toString() + "ед.")
                }
            }
        }.start()

        Thread {
            start = true
            while (start) {
                Thread.sleep(1000)
                runOnUiThread {
                    if (kolMat4 >= lvlTexClickAvt4) {
                        valueManyAvt4 = lvlTexClickAvt4 * 8
                        monay = monay + valueManyAvt4
                        kolMat4 = kolMat4 - lvlTexClickAvt4
                    } else {
                        while (kolMat4 < lvlTexClickAvt4) {
                            lvlTexClickAvt4--
                            maxPom++
                            maxPom2++
                            valueManyAvt4 = lvlTexClickAvt4 * 8
                            monay = monay + valueManyAvt4
                            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                        }
                    }
                    textMonay?.setText(monay.toString() + "$")
                    textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
                    textPrice5?.setText(kolMat4.toString() + "ед.")
                }
            }
        }.start()

        Thread {
            start = true
            while (start) {
                Thread.sleep(30000)
                runOnUiThread {
                    saveTabMany(monay)
                    saveMaxPom(maxPom)
                    saveMaxPom2(maxPom2)
                    saveTabTextPlusManyValue(textPlusManyValue)
                    savevalueManyAvt(valueManyAvt)
                    savevalueManyAvt2(valueManyAvt2)
                    savevalueManyAvt3(valueManyAvt3)
                    savevalueManyAvt4(valueManyAvt4)
                    lvlUpProject(lvlUpProject)
                    lvlUpProjectBur(lvlUpProjectBur)
                    saveTabTechnologyLvl(lvlTexClick)
                    saveTabTechnologyLvlAvt(lvlTexClickAvt)
                    saveTabTechnologyLvlAvt2(lvlTexClickAvt2)
                    saveTabTechnologyLvlAvt3(lvlTexClickAvt3)
                    saveTabTechnologyLvlAvt4(lvlTexClickAvt4)
                    saveTabTechnologyPrice(technologyPrice)
                    saveTechnologyLvl(technologyLvl)
                    saveTabKolMat(kolMat)
                    saveTabKolMat2(kolMat2)
                    saveTabKolMat3(kolMat3)
                    saveTabKolMat4(kolMat4)
                    saveEnabledTrueET(enabledTrue!!)
                    saveEnabledTrueET2(enabledTrue2!!)
                    saveEnabledTrueET3(enabledTrue3!!)
                    saveEnabledTrueET4(enabledTrue4!!)
                    saveEnabledTrueET5(enabledTrue5!!)
                    saveEnabledTrueET6(enabledTrue6!!)
                }
            }
        }.start()

    }

    var monay2: Double = 0.0
    var c3 = 0

    fun tecnoLvl() {
        try {
            c3 = saveItem?.getInt("C3", 0)!!
            if (technologyPrice <= monay) {
                if (c3 < 1){
                    val one = AlertDialog.Builder(this)
                    one.setMessage("Вы улучшили класификацию своим помошникам! Теперь они могут вступить в первую группу! Доступные группы будут обозначены фиолетовым цветом.")
                    one.show()
                    c3++
                    saveC3(c3)
                }
                var r = (5..20).random()
                monay = monay - technologyPrice
                array()
                technologyLvl++
                technologyPrice = technologyPrice + (1000 * (r * 0.2713)).toInt()
            } else {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.setMessage("Не хватает ${technologyPrice - monay}$")
                alertDialog.show()
            }
            textMonay?.setText(monay.toString() + " $")
            technoPrice?.setText(technologyPrice.toString() + '$')
            technoLvl?.setText(technologyLvl.toString() + " Lvl")
        } catch (a: Exception) {
            val o = AlertDialog.Builder(this)
            o.setMessage("Максимальный уровень")
            o.show()
        }
    }

    var o = 0
    var o2= 0
    var o3 = 0

    fun addMonay() {
        monay = monay + lvlTexClick
        textMonay?.setText(monay.toString() + " $")
        clickUpTechnology()
        clickUpTechnologyAvt()
        val theft = AlertDialog.Builder(this)
        val randomVal = (0..1000).random()
        if (lvlTexClick < randNum) {
            if (randomVal == 100) {
                monay2 = monay * 0.1
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 200) {
                monay2 = monay * 0.2
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 300) {
                monay2 = monay * 0.3
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 400) {
                monay2 = monay * 0.4
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 500) {
                monay2 = monay * 0.5
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 600) {
                monay2 = monay * 0.6
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 700) {
                monay2 = monay * 0.7
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 800) {
                monay2 = monay * 0.8
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 900) {
                monay2 = monay * 0.9
                monay = monay - monay2.toInt()
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                theft.show()
            }
            if (randomVal == 999) {
                textMonay?.setText(monay.toString() + " $")
                theft.setMessage("Вас ограбили на ${monay}$")
                monay = monay - monay
                theft.show()
            }
        } else {
            if (lvlTexClick < randNum2) {
                o = saveItem?.getInt("O", 0)!!
                if ( o < 1){
                    val g = AlertDialog.Builder(this)
                    g.setMessage("Поздравляем! Вы стали лучше понимать людей, и шансы, что вас ограбят уменьшен!")
                    g.show()
                    o++
                    saveO(o)
                }
                if (randomVal == 50) {
                    monay2 = (monay * 0.1)
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
                if (randomVal == 150) {
                    monay2 = monay * 0.2
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
                if (randomVal == 250) {
                    monay2 = monay * 0.3
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
                if (randomVal == 350) {
                    monay2 = monay * 0.4
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
                if (randomVal == 450) {
                    monay2 = monay * 0.5
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
                if (randomVal == 550) {
                    monay2 = monay * 0.6
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
                if (randomVal == 650) {
                    monay2 = monay * 0.7
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
                if (randomVal == 750) {
                    monay2 = monay * 0.8
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
                if (randomVal == 850) {
                    monay2 = monay * 0.9
                    monay = monay - monay2.toInt()
                    textMonay?.setText(monay.toString() + " $")
                    theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                    theft.show()
                }
            } else {
                if (lvlTexClick < randNum3) {
                    o2 = saveItem?.getInt("O2", 0)!!
                    if ( o2 < 1){
                        val g = AlertDialog.Builder(this)
                        g.setMessage("Поздравляем! Вы стали лучше понимать людей, и шансы, что вас ограбят уменьшен!")
                        g.show()
                        o2++
                        saveO2(o2)
                    }
                    if (randomVal == 50) {
                        monay2 = monay * 0.1
                        monay = monay - monay2.toInt()
                        textMonay?.setText(monay.toString() + " $")
                        theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                        theft.show()
                    }
                    if (randomVal == 150) {
                        monay2 = monay * 0.2
                        monay = monay - monay2.toInt()
                        textMonay?.setText(monay.toString() + " $")
                        theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                        theft.show()
                    }
                    if (randomVal == 250) {
                        monay2 = monay * 0.3
                        monay = monay - monay2.toInt()
                        textMonay?.setText(monay.toString() + " $")
                        theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                        theft.show()
                    }
                    if (randomVal == 350) {
                        monay2 = monay * 0.4
                        monay = monay - monay2.toInt()
                        textMonay?.setText(monay.toString() + " $")
                        theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                        theft.show()
                    }
                    if (randomVal == 450) {
                        monay2 = monay * 0.5
                        monay = monay - monay2.toInt()
                        textMonay?.setText(monay.toString() + " $")
                        theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                        theft.show()
                    }
                    if (randomVal == 550) {
                        monay2 = monay * 0.6
                        monay = monay - monay2.toInt()
                        textMonay?.setText(monay.toString() + " $")
                        theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                        theft.show()
                    }
                } else {
                    if (lvlTexClick < randNum4) {
                        o3 = saveItem?.getInt("O3", 0)!!
                        if ( o3 < 1){
                            val g = AlertDialog.Builder(this)
                            g.setMessage("Поздравляем! Вы стали лучше понимать людей, и шансы, что вас ограбят уменьшен!")
                            g.show()
                            o3++
                            saveO3(o3)
                        }
                        if (randomVal == 250) {
                            monay2 = monay * 0.1
                            monay = monay - monay2.toInt()
                            textMonay?.setText(monay.toString() + " $")
                            theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                            theft.show()
                        }
                        if (randomVal == 500) {
                            monay2 = monay * 0.2
                            monay = monay - monay2.toInt()
                            textMonay?.setText(monay.toString() + " $")
                            theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                            theft.show()
                        }
                        if (randomVal == 750) {
                            monay2 = monay * 0.3
                            monay = monay - monay2.toInt()
                            textMonay?.setText(monay.toString() + " $")
                            theft.setMessage("Вас ограбили на ${(monay2 * 10).toInt() / 10}$")
                            theft.show()
                        }
                    }
                }
            }
        }
    }

    fun clickUpTechnology() {
        lvlUpProject = lvlUpProject + 1
        val randomVal = (1..5).random()
        val randomVal2 = (25..50).random()
        if (lvlUpProject == lvlUpProjectBur) {
            lvlUpProject = 0
            lvlTexClick++
            maxPom++
            if (randomVal == 1) {
                lvlUpProjectBur = lvlUpProjectBur + (0.1 * randomVal2).toInt()
            } else
                if (randomVal == 2) {
                    lvlUpProjectBur = lvlUpProjectBur + (0.2 * randomVal2).toInt()
                } else
                    if (randomVal == 3) {
                        lvlUpProjectBur = lvlUpProjectBur + (0.3 * randomVal2).toInt()
                    } else
                        if (randomVal == 4) {
                            lvlUpProjectBur = lvlUpProjectBur + (0.4 * randomVal2).toInt()
                        } else
                            if (randomVal == 5)
                                lvlUpProjectBur = lvlUpProjectBur + (0.5 * randomVal2).toInt()
            if (lvlTexClick < randNum) {
                nextLvlBur?.setText(lvlTexClick.toString() + '/' + randNum.toString() + " Lvl")
            } else if (lvlTexClick < randNum2) {
                nextLvlBur?.setText(lvlTexClick.toString() + '/' + randNum2.toString() + " Lvl")
            } else if (lvlTexClick < randNum3) {
                nextLvlBur?.setText(lvlTexClick.toString() + '/' + randNum3.toString() + " Lvl")
            } else if (lvlTexClick < randNum4) nextLvlBur?.setText(lvlTexClick.toString() + '/' + randNum4.toString() + " Lvl")
        }
        textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
        textPrice?.setText(lvlUpProject.toString() + "/" + lvlUpProjectBur.toString())
        textLvl?.setText(lvlTexClick.toString() + " Lvl")
    }

    var c = 0

    fun clickUpTechnologyAvt() {
        c = saveItem?.getInt("C", 0)!!
        if (kolMat > maxPom)
            if (maxPom2 < maxPom) {
                var a = (maxPom - maxPom2) * 10
                val b = (0..a).random()
                val d = (0..a).random()
                if (b == d) {
                    maxPom2++
                    kolMat--
                    if (c < 1) {
                        val Pom = AlertDialog.Builder(this)
                        Pom.setMessage("Вот вы и смогли уболтать одного из людей, присоединиться к вам. Теперь он ваш помошник, и будет приносить пасивный доход. Когда откроете левую вкладку, вы увидите, что количество помошников зависит от уровня общения. Чем выше уровень тем больше помошников вы сможете получить. Рядом, указано общее количество людей в вашем городе.")
                        Pom.show()
                        c++
                        saveC(c)
                    }
                }
            }
        textPlusManyValue =
            maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
        textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
        textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
        textPrice2?.setText(kolMat.toString())
    }

    fun clickUpTechnologyAvt1() {
        try {
            if (kolMat2 != 0) {
                var a = editText?.text.toString()
                if (a.toInt() <= maxPom2) {
                    lvlTexClickAvt2 = lvlTexClickAvt2 + a.toInt()
                    maxPom = maxPom - a.toInt()
                    maxPom2 = maxPom2 - a.toInt()
                }
                textPlusManyValue =
                    maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
                textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
                textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                textLvl3?.setText(lvlTexClickAvt2.toString() + " чел.")
            } else {
                val no = AlertDialog.Builder(this)
                no.setMessage("Нечего собирать")
                no.show()
            }
            editText?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt11() {
        try {
            var a = editText?.text.toString()
            if (a.toInt() <= lvlTexClickAvt2) {
                lvlTexClickAvt2 = lvlTexClickAvt2 - a.toInt()
                maxPom = maxPom + a.toInt()
                maxPom2 = maxPom2 + a.toInt()
            }
            textPlusManyValue =
                maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
            textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
            textLvl3?.setText(lvlTexClickAvt2.toString() + " чел.")
            editText?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt2() {
        try {
            if (kolMat3 != 0) {
                var a = editText2?.text.toString()
                if (a.toInt() <= maxPom2) {
                    lvlTexClickAvt3 = lvlTexClickAvt3 + a.toInt()
                    maxPom = maxPom - a.toInt()
                    maxPom2 = maxPom2 - a.toInt()
                }
                textPlusManyValue =
                    maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
                textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
                textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                textLvl4?.setText(lvlTexClickAvt2.toString() + " чел.")
            } else {
                val no = AlertDialog.Builder(this)
                no.setMessage("Нечего собирать")
                no.show()
            }
            editText2?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt21() {
        try {
            var a = editText2?.text.toString()
            if (a.toInt() <= lvlTexClickAvt3) {
                lvlTexClickAvt3 = lvlTexClickAvt3 - a.toInt()
                maxPom = maxPom + a.toInt()
                maxPom2 = maxPom2 + a.toInt()
            }
            textPlusManyValue =
                maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
            textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
            textLvl4?.setText(lvlTexClickAvt3.toString() + " чел.")
            editText2?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt3() {
        try {
            if (kolMat3 != 0) {
                var a = editText3?.text.toString()
                if (a.toInt() <= maxPom2) {
                    lvlTexClickAvt4 = lvlTexClickAvt4 + a.toInt()
                    maxPom = maxPom - a.toInt()
                    maxPom2 = maxPom2 - a.toInt()
                }
                textPlusManyValue =
                    maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
                textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
                textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
            } else {
                val no = AlertDialog.Builder(this)
                no.setMessage("Нечего собирать")
                no.show()
            }
            editText3?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt31() {
        try {
            var a = editText3?.text.toString()
            if (a.toInt() <= lvlTexClickAvt4) {
                lvlTexClickAvt4 = lvlTexClickAvt4 - a.toInt()
                maxPom = maxPom + a.toInt()
                maxPom2 = maxPom2 + a.toInt()
            }
            textPlusManyValue =
                maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
            textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
            textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
            editText3?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt4() {
        try {
            if (kolMat3 != 0) {
                var a = editText4?.text.toString()
                if (a.toInt() <= maxPom2) {
                    lvlTexClickAvt4 = lvlTexClickAvt4 + a.toInt()
                    maxPom = maxPom - a.toInt()
                    maxPom2 = maxPom2 - a.toInt()
                }
                textPlusManyValue =
                    maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
                textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
                textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
            } else {
                val no = AlertDialog.Builder(this)
                no.setMessage("Нечего собирать")
                no.show()
            }
            editText4?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt41() {
        try {
            var a = editText4?.text.toString()
            if (a.toInt() <= lvlTexClickAvt4) {
                lvlTexClickAvt4 = lvlTexClickAvt4 - a.toInt()
                maxPom = maxPom + a.toInt()
                maxPom2 = maxPom2 + a.toInt()
            }
            textPlusManyValue =
                maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
            textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
            textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
            editText4?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt5() {
        try {
            if (kolMat3 != 0) {
                var a = editText5?.text.toString()
                if (a.toInt() <= maxPom2) {
                    lvlTexClickAvt4 = lvlTexClickAvt4 + a.toInt()
                    maxPom = maxPom - a.toInt()
                    maxPom2 = maxPom2 - a.toInt()
                }
                textPlusManyValue =
                    maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
                textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
                textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
            } else {
                val no = AlertDialog.Builder(this)
                no.setMessage("Нечего собирать")
                no.show()
            }
            editText5?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt51() {
        try {
            var a = editText5?.text.toString()
            if (a.toInt() <= lvlTexClickAvt4) {
                lvlTexClickAvt4 = lvlTexClickAvt4 - a.toInt()
                maxPom = maxPom + a.toInt()
                maxPom2 = maxPom2 + a.toInt()
            }
            textPlusManyValue =
                maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
            textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
            textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
            editText5?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt6() {
        try {
            if (kolMat3 != 0) {
                var a = editText6?.text.toString()
                if (a.toInt() <= maxPom2) {
                    lvlTexClickAvt4 = lvlTexClickAvt4 + a.toInt()
                    maxPom = maxPom - a.toInt()
                    maxPom2 = maxPom2 - a.toInt()
                }
                textPlusManyValue =
                    maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
                textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
                textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
                textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
            } else {
                val no = AlertDialog.Builder(this)
                no.setMessage("Нечего собирать")
                no.show()
            }
            editText6?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun clickUpTechnologyAvt61() {
        try {
            var a = editText6?.text.toString()
            if (a.toInt() <= lvlTexClickAvt4) {
                lvlTexClickAvt4 = lvlTexClickAvt4 - a.toInt()
                maxPom = maxPom + a.toInt()
                maxPom2 = maxPom2 + a.toInt()
            }
            textPlusManyValue =
                maxPom2 + lvlTexClickAvt2 * 2 + lvlTexClickAvt3 * 4 + lvlTexClickAvt4 * 8
            textPlusMany?.setText('+' + textPlusManyValue.toString() + "$/ceк")
            textLvl2?.setText(maxPom2.toString() + '/' + maxPom.toString())
            textLvl5?.setText(lvlTexClickAvt4.toString() + " чел.")
            editText6?.text?.clear()
        } catch (a: Exception) {
            val no = AlertDialog.Builder(this)
            no.setMessage("Вы не ввели значение")
            no.show()
        }
    }

    fun lvlUpProject(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("lvlUpProject", item)
        editor?.apply()
    }

    fun lvlUpProjectBur(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("lvlUpProjectBur", item)
        editor?.apply()
    }

    fun array() {

        val myArray = arrayOf(editText, editText2, editText3, editText4, editText5, editText6)
        var a = technologyLvl
        var b = myArray[a]
        if (b != null) {
            if (myArray[a] == editText) {
                if (enabledTrue == false) enabledTrue = true
                saveEnabledTrueET(enabledTrue!!)
                openEditText(b, enabledTrue!!)
            } else if (myArray[a] == editText2) {
                if (enabledTrue2 == false) enabledTrue2 = true
                saveEnabledTrueET2(enabledTrue2!!)
                openEditText(b, enabledTrue2!!)
            } else if (myArray[a] == editText3) {
                if (enabledTrue3 == false) enabledTrue3 = true
                saveEnabledTrueET3(enabledTrue3!!)
                openEditText(b, enabledTrue3!!)
            } else if (myArray[a] == editText4) {
                if (enabledTrue4 == false) enabledTrue4 = true
                saveEnabledTrueET4(enabledTrue4!!)
                openEditText(b, enabledTrue4!!)
            } else if (myArray[a] == editText5) {
                if (enabledTrue5 == false) enabledTrue5 = true
                saveEnabledTrueET5(enabledTrue5!!)
                openEditText(b, enabledTrue5!!)
            } else if (myArray[a] == editText6) {
                if (enabledTrue6 == false) enabledTrue6 = true
                saveEnabledTrueET6(enabledTrue6!!)
                openEditText(b, enabledTrue6!!)
            }
        }
    }

    fun arrayProv() {
        val myArray = arrayOf(editText, editText2, editText3, editText4, editText5, editText6)
        for (i in 0..5) {
            var b = myArray[i]
            if (b != null) {
                if (myArray[i] == editText) {
                    enabledTrue = saveItem?.getBoolean("saveEnabledTrueET", false)!!
                    openEditText(b, enabledTrue!!)
                } else if (myArray[i] == editText2) {
                    enabledTrue2 = saveItem?.getBoolean("saveEnabledTrueET2", false)!!
                    openEditText(b, enabledTrue2!!)
                } else if (myArray[i] == editText3) {
                    enabledTrue3 = saveItem?.getBoolean("saveEnabledTrueET3", false)!!
                    openEditText(b, enabledTrue3!!)
                } else if (myArray[i] == editText4) {
                    enabledTrue4 = saveItem?.getBoolean("saveEnabledTrueET4", false)!!
                    openEditText(b, enabledTrue4!!)
                } else if (myArray[i] == editText5) {
                    enabledTrue5 = saveItem?.getBoolean("saveEnabledTrueET5", false)!!
                    openEditText(b, enabledTrue5!!)
                } else if (myArray[i] == editText6) {
                    enabledTrue6 = saveItem?.getBoolean("saveEnabledTrueET6", false)!!
                    openEditText(b, enabledTrue6!!)
                }
            }
        }
    }

    fun openEditText(view: View, enabled: Boolean) {
        view.isEnabled = enabled
        view.isSaveFromParentEnabled = enabled
    }

    fun saveEnabledTrueET(item: Boolean) {
        val editor = saveItem?.edit()
        editor?.putBoolean("saveEnabledTrueET", item)
        editor?.apply()
    }

    fun saveEnabledTrueET2(item: Boolean) {
        val editor = saveItem?.edit()
        editor?.putBoolean("saveEnabledTrueET2", item)
        editor?.apply()
    }

    fun saveEnabledTrueET3(item: Boolean) {
        val editor = saveItem?.edit()
        editor?.putBoolean("saveEnabledTrueET3", item)
        editor?.apply()
    }

    fun saveEnabledTrueET4(item: Boolean) {
        val editor = saveItem?.edit()
        editor?.putBoolean("saveEnabledTrueET4", item)
        editor?.apply()
    }

    fun saveEnabledTrueET5(item: Boolean) {
        val editor = saveItem?.edit()
        editor?.putBoolean("saveEnabledTrueET5", item)
        editor?.apply()
    }

    fun saveEnabledTrueET6(item: Boolean) {
        val editor = saveItem?.edit()
        editor?.putBoolean("saveEnabledTrueET6", item)
        editor?.apply()
    }

    fun saveTabTextPlusManyValue(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("textPlusManyValue", item)
        editor?.apply()
    }

    fun saveTabMany(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("Many", item)
        editor?.apply()
    }

    fun saveRandNum(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("randNum", item)
        editor?.apply()
    }

    fun saveRandNum2(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("randNum2", item)
        editor?.apply()
    }

    fun saveRandNum3(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("randNum3", item)
        editor?.apply()
    }

    fun saveRandNum4(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("randNum4", item)
        editor?.apply()
    }

    fun saveO(item: Int){
        val editor = saveItem?.edit()
        editor?.putInt("O", item)
        editor?.apply()
    }

    fun saveO2(item: Int){
        val editor = saveItem?.edit()
        editor?.putInt("O2", item)
        editor?.apply()
    }

    fun saveO3(item: Int){
        val editor = saveItem?.edit()
        editor?.putInt("O3", item)
        editor?.apply()
    }

    fun saveC(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("C", item)
        editor?.apply()
    }

    fun saveC2(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("C2", item)
        editor?.apply()
    }

    fun saveC3(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("C3", item)
        editor?.apply()
    }

    fun savevalueManyAvt(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("valueManyAvt", item)
        editor?.apply()
    }

    fun savevalueManyAvt2(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("valueManyAvt2", item)
        editor?.apply()
    }

    fun savevalueManyAvt3(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("valueManyAvt3", item)
        editor?.apply()
    }

    fun savevalueManyAvt4(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("valueManyAvt4", item)
        editor?.apply()
    }

    fun saveTabTechnologyLvl(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("TechnologyLvl", item)
        editor?.apply()
    }

    fun saveTabTechnologyLvlAvt(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("TechnologyLvlAvt", item)
        editor?.apply()
    }

    fun saveTabTechnologyLvlAvt2(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("TechnologyLvlAvt2", item)
        editor?.apply()
    }

    fun saveTabTechnologyLvlAvt3(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("TechnologyLvlAvt3", item)
        editor?.apply()
    }

    fun saveTabTechnologyLvlAvt4(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("TechnologyLvlAvt4", item)
        editor?.apply()
    }

    fun saveTabTechnologyPrice(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("technologyPrice", item)
        editor?.apply()
    }

    fun saveTabKolMat(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("kolMat", item)
        editor?.apply()
    }

    fun saveTabKolMat2(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("kolMat2", item)
        editor?.apply()
    }

    fun saveTabKolMat3(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("kolMat3", item)
        editor?.apply()
    }

    fun saveTabKolMat4(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("kolMat4", item)
        editor?.apply()
    }

    fun saveStartBool(item: Boolean) {
        val editor = saveItem?.edit()
        editor?.putBoolean("Start2", item)
        editor?.apply()
    }

    fun saveMaxPom(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("maxPom", item)
        editor?.apply()
    }

    fun saveMaxPom2(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("maxPom2", item)
        editor?.apply()
    }

    fun saveTechnologyLvl(item: Int) {
        val editor = saveItem?.edit()
        editor?.putInt("technologyLvl", item)
        editor?.apply()
    }

    fun openDialog() {
        var a = AlertDialog.Builder(this)
        a.setMessage("Чтобы начать распределять помошников по группам, вы должны улучшить их квалификацию.")
        a.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        saveTabMany(monay)
        saveMaxPom(maxPom)
        saveMaxPom2(maxPom2)
        saveTabTextPlusManyValue(textPlusManyValue)
        savevalueManyAvt(valueManyAvt)
        savevalueManyAvt2(valueManyAvt2)
        savevalueManyAvt3(valueManyAvt3)
        savevalueManyAvt4(valueManyAvt4)
        lvlUpProject(lvlUpProject)
        lvlUpProjectBur(lvlUpProjectBur)
        saveTabTechnologyLvl(lvlTexClick)
        saveTabTechnologyLvlAvt(lvlTexClickAvt)
        saveTabTechnologyLvlAvt2(lvlTexClickAvt2)
        saveTabTechnologyLvlAvt3(lvlTexClickAvt3)
        saveTabTechnologyLvlAvt4(lvlTexClickAvt4)
        saveTabTechnologyPrice(technologyPrice)
        saveTechnologyLvl(technologyLvl)
        saveTabKolMat(kolMat)
        saveTabKolMat2(kolMat2)
        saveTabKolMat3(kolMat3)
        saveTabKolMat4(kolMat4)
        saveEnabledTrueET(enabledTrue!!)
        saveEnabledTrueET2(enabledTrue2!!)
        saveEnabledTrueET3(enabledTrue3!!)
        saveEnabledTrueET4(enabledTrue4!!)
        saveEnabledTrueET5(enabledTrue5!!)
        saveEnabledTrueET6(enabledTrue6!!)
    }

    override fun onPause() {
        super.onPause()
        saveTabMany(monay)
        saveMaxPom(maxPom)
        saveMaxPom2(maxPom2)
        saveTabTextPlusManyValue(textPlusManyValue)
        savevalueManyAvt(valueManyAvt)
        savevalueManyAvt2(valueManyAvt2)
        savevalueManyAvt3(valueManyAvt3)
        savevalueManyAvt4(valueManyAvt4)
        lvlUpProject(lvlUpProject)
        lvlUpProjectBur(lvlUpProjectBur)
        saveTabTechnologyLvl(lvlTexClick)
        saveTabTechnologyLvlAvt(lvlTexClickAvt)
        saveTabTechnologyLvlAvt2(lvlTexClickAvt2)
        saveTabTechnologyLvlAvt3(lvlTexClickAvt3)
        saveTabTechnologyLvlAvt4(lvlTexClickAvt4)
        saveTabTechnologyPrice(technologyPrice)
        saveTechnologyLvl(technologyLvl)
        saveTabKolMat(kolMat)
        saveTabKolMat2(kolMat2)
        saveTabKolMat3(kolMat3)
        saveTabKolMat4(kolMat4)
        saveEnabledTrueET(enabledTrue!!)
        saveEnabledTrueET2(enabledTrue2!!)
        saveEnabledTrueET3(enabledTrue3!!)
        saveEnabledTrueET4(enabledTrue4!!)
        saveEnabledTrueET5(enabledTrue5!!)
        saveEnabledTrueET6(enabledTrue6!!)
    }

}