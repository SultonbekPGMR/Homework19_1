package com.codialstudent.homework191

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.codialstudent.homework191.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var myViewPagerAdapter: MyViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        myViewPagerAdapter = MyViewPagerAdapter(this,getData())
        binding.viewPager.adapter = myViewPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager, true)


        binding.btnSkip.setOnClickListener {
            binding.viewPager.visibility = View.INVISIBLE
            binding.btnSkip.visibility = View.INVISIBLE
            binding.tabLayout.visibility = View.INVISIBLE
            binding.tvSkip.visibility = View.VISIBLE

        }


    }

    fun getData(): ArrayList<PageData> {
        val list = ArrayList<PageData>()
        list.add(PageData("Xush Kelibsiz", "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘", "https://s3-alpha-sig.figma.com/img/dded/062c/de718bc9911e7dc3843b0a505c38cfda?Expires=1673827200&Signature=nHx-iWSAZCt2D7OOUt~rCFN6IYioxAWBUwSV9P1t-pEwf0ckiYAJ1kvHTD~bpNrmDF30YCXghvKKwDSqDRjLYn5XS5yIiWckmU8d2SY36vj-jCZSX69iTKnR9362nkhC7FOiogMk1SVPm-oO3eegvlXUc20kDL-bJ66~b8sZR~R~vzE9gUW00x8EqFtDrpU444A42EB-1J3h-ABVT2g2EedBxt4-AsLaHpylkd2~fprvGaC0iRwYtoVvIMJjvoa52qj~npUg1q5NBXyw72ln2jANmQoVpFjH7TyaA~VtZ1mnteb489sh3LaP9xJfjdQhC4H-vsQ08p04jiDGChFJ9g__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"))
        list.add(PageData("Hikoyalar dunyosi", "Gar zamonni nayf qilsam ayb qilma, ey rafiq, Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ !", "https://s3-alpha-sig.figma.com/img/a276/290c/9a451ba0b5ef521617846d3aa58740d0?Expires=1673827200&Signature=Kmtdi1n00wS0OZuVJe3HwRdnvvtupdinLFCobZRDk8dpMM-JkjDI5a77M4NKwpYH1RRQwItFQN4Jh7sVwNFRicrMqVizHLcsXBb2oaCtkF459ARfHoXnUurAEWdF2moNgKUPXqzxNKJhWtc3tbGij~wM-PRok5WvEuZMYHuQOPb1aeKhWnddDLUE4eUYfnVEIC9rI9Kt7bLYUhbdnu9RgmTENxhZimAS3e4Oy7FQezfumj49NtzgToTDkjsr4fhLedOvHMoIq5sfjIu3V~GFoYnSqaUWBv9clQkL~OrRYxZALJ5mx0b6L6Mi81JUqwSGZ94kImO03NJz3h21cN1u2A__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"))
        list.add(PageData("Kitob ortidan..", "Dilrabolardin yomonliq keldi mahzun ko‘ngluma, Kelmadi jonimg'a hech oromi jondin yaxshilig'.", "https://s3-alpha-sig.figma.com/img/9821/0582/040f05cdacb588a62e5564635509840f?Expires=1673827200&Signature=fUt~XqO9W5WI5~58AF8MZPUaTP16jQGDb2f8VQXzn0VYDCfbdIFW9~al6dJGUJZ2KI-Gx2WPKaufdPAt6fMaTlL5ErPlmwkQ7RLPgc~DBoq8HeVEgjd4jQO98YuF6nQuzMtCUjt03qMRONb9fhQeq8pJcOrBHPSZhkHe~JnboQwt8nZ8tNbdWpW0qaZIWrCI1V4XuQ3T1sgnJmmGnjtX-t1FQyz0TmX~uctcQvGsLbTfBnb55ddNn5kYoaLZ~BoV6HQiXE2ZIxG4KLXrhEimqxEUqO3Q-izVrrg5KbYtNbXxz9gMDa~rdMEuHQmPK115MvDx5Jbo50BwsHTQfIpZZg__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"))
        list.add(PageData("Bizga qo`shiling", "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p, Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?", "https://s3-alpha-sig.figma.com/img/7d6d/65d5/4c16adc64ea9879e68d2771da92bec24?Expires=1673827200&Signature=ot4cNrgOpQZiyIxgI8A6~CVI6SJID5qOs6zaCeytpHDXFmEHyDG2LMUgxau521TLvCJ0aafHc9js0QICCkQ1NYlWNzBl0GJXNm4EE4duOUAsto9T9ybUG9iF-wQZmXNKt~3ps8u7ScxmrKhpdBiic7Y3wG9BaYl65ZAFh3vvF5fNkig6iQcOeayomGPvej425QuqwcvM-cXLhJieBrjjWlmzcRs0Qexjo-C8cAUUTgen0gXpY6qfeQv-CNIZzBUR70qYzjAshHKRYvAPuMtawDIMz2pmddKBNEFsyyD2M0fXkTRf86oCHMnTv7frPdZUm36w2Xn4huw0k6buCGxE0Q__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"))
        return list
    }
}