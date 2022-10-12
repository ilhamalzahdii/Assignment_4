package com.example.coffeeapp.data

import android.content.Context
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Coffee

class CoffeeData(val context: Context) {

    fun loadCoffee() : List<Coffee> {
        return listOf<Coffee>(
            Coffee(R.array.coffee_data1, R.drawable.__espresso),
            Coffee(R.array.coffee_data2, R.drawable.__americano),
            Coffee(R.array.coffee_data3, R.drawable.__capuccino),
            Coffee(R.array.coffee_data4, R.drawable.__caffelatte),
            Coffee(R.array.coffee_data5, R.drawable.__machiatto),
            Coffee(R.array.coffee_data6, R.drawable.__affogatto),
            Coffee(R.array.coffee_data7, R.drawable.__frappe),
            Coffee(R.array.coffee_data8, R.drawable.__coldbrew),
            Coffee(R.array.coffee_data9, R.drawable.__cortado),
            Coffee(R.array.coffee_data10, R.drawable._0_flatwhite)
        )
    }

    fun loadOneCoffee(index : Int) : Coffee{
        return loadCoffee()[index]
    }
}