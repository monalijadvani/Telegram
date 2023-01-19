package com.example.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telegram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var Names = arrayOf("HM","Chinki","Minki","Aankita","Binal","Chini","Dinal","Eni","Feni","Gori","hetavi","jeni","kenil","yash","ravi")
        var imges = arrayOf(R.drawable.img1,R.drawable.img1,R.drawable.img2,
            R.drawable.img4,R.drawable.img3,R.drawable.img1,R.drawable.img2,R.drawable.img4,R.drawable.img2,R.drawable.img1)

        var binding = ActivityMainBinding.inflate(layoutInflater)

        binding.ChatList.layoutManager = LinearLayoutManager(applicationContext)
        binding.ChatList.adapter = ChatList(Names)

        setContentView(binding.root)

        binding.menu.setOnClickListener {
            binding.drawer.openDrawer(Gravity.LEFT)

        }

        binding.vert.setOnClickListener {
            //  val popupMenu : PopupMenu = PopupMenu(this,)
            val popupMenu: PopupMenu = PopupMenu(this@MainActivity,binding.vert)
            popupMenu.menuInflater.inflate(R.menu.nav_item,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.New_group ->
                        Toast.makeText(this@MainActivity, "New group " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Contacts ->
                        Toast.makeText(this@MainActivity, "New Boardcast  " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Call ->
                        Toast.makeText(this@MainActivity, "Linked devices  " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Pepole_nearby ->
                        Toast.makeText(this@MainActivity, "Starred messages" + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Saved_Messages ->
                        Toast.makeText(this@MainActivity, "Payments" + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Settings ->
                        Toast.makeText(this@MainActivity, "Privacy Policy" + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Invite_Friends ->
                        Toast.makeText(this@MainActivity, "Privacy Policy" + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Telegram_Features ->
                        Toast.makeText(this@MainActivity, "Privacy Policy" + item.title, Toast.LENGTH_SHORT).show()

                }

                true
            })
            popupMenu.show()
        }


    }
}