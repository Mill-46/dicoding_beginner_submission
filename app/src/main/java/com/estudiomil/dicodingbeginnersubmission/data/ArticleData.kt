package com.estudiomil.dicodingbeginnersubmission.data

import com.estudiomil.dicodingbeginnersubmission.R

data class ArticleData(
    val id: Int = 0,
    val img: Int = 0,
    val title: String = "",
    val description: String = ""
)
class ArticleDatabase{
    val listOfArticleData: List<ArticleData> = listOf(
        ArticleData(0,img = R.drawable.image1, "Lamian Ayam Goreng", "Lamian memang jadi menu yang nggak pernah salah jika kamu pesan di Golden Lamian. Hal ini memang karena Lamian adalah signature dan menu yang menjadi unggulan dari resto satu ini. Kamu tinggal menyesuaikan saja topping yang dipilih sesuai dengan selera, misalnya Lamian dengan ayam goreng yang banyak dipesan ini.\n" +
                "\n" +
                "Sajian Lamian Ayam Goreng menjadi menu Lamian kering atau tanpa kuah. Cocok banget jika kamu nggak terlalu menyukai makanan berkuah namun ingin makan mie seperti mie goreng. Bumbunya menyelimuti seluruh lapisan mie sehingga akan terasa sangat lezat saat disantap. Ditambah lagi adanya topping berupa irisan ayam goreng yang crunchy saat dikunyah bersama mie membuat menu ini sayang untuk dilewatkan."),
        ArticleData(1,img = R.drawable.image2, "Lamian Extra Spicy Beef\n", "Pecinta makanan berkuah pedas mana nih suaranya? Buat Blibli Friends yang suka banget makan makanan yang pedas, kamu harus coba pesan Lamian Extra Spicy Beef ini deh kalau ke Golden Lamian. Apalagi ada topping olahan daging sapi khas Golden Lamian yang semakin menambah kelezatan dari Lamian dan kuah pedas.\n" +
                "\n" +
                "Kuah dari Lamian Extra Spicy Beef dikenal karena rasanya yang gurih dan ngaldu banget. Kebayang kan, gimana rasanya kuah yang rich dan gurih pedas ini berpadu dengan Lamian yang enak ditambah adanya topping yang tak kalah lezat? Wah, benar-benar akan menggugah selera makanmu deh semangkuk Lamian Extra Spicy Beef ini."),
        ArticleData(2,img = R.drawable.image3, "Lamian Rica-Rica", "Suka pedas tapi tidak ingin terlalu pedas agar tetap bisa menikmati waktu makan santaimu setelah berbelanja seharian di mall? Rekomendasi menu bernama Lamian Rica-Rica ini paling pas buat kamu pesan saat ke Golden Lamian. Rasa pedas dari Lamian Rica-Rica masih bisa ditolerir karena tidak sepedas Lamian Extra Spicy Beef.\n" +
                "\n" +
                "Topping yang digunakan pada Lamian Rica-Rica adalah potongan daging ayam yang tentunya sangat lezat. Kamu bisa menyeruput lamian sekaligus topping ayam khasnya ini sehingga kombinasi rasa pedas yang lezat ini bisa dinikmati bersamaan di dalam mulut. Gimana, tertarik untuk pesan Lamian Rica-Rica saat pergi ke sana nanti?"),
        ArticleData(3,img = R.drawable.image4, "Nasi Hainan Combo", "Mungkin ada Blibli Friends yang menganggap belum sah makan kalau belum pakai nasi. Wah, menu satu ini paling pas direkomendasikan buat kamu saat ingin makan di Golden Lamian. Menu berupa nasi dan lauk ini juga cocok jika kamu sedang nggak ingin atau malas makan Lamian saat ke sana. Namanya adalah Nasi Hainan Combo.\n" +
                "\n" +
                "Nasi Hainan sendiri merupakan makanan khas Tionghoa yang sudah banyak dikenal di seluruh dunia. Biasanya makanan ini selalu tersedia di setiap Chinese Restaurant. Untuk menu Nasi Hainan Combo di Golden Lamian menggunakan topping yang sangat lengkap, yaitu potongan daging ayam dan daging bebek yang dipanggang hingga lembut, serta sayuran yang enak."),
        ArticleData(4,img = R.drawable.image5, "Golden Soup Beef Lamian", "Rekomendasi menu Golden Lamian selanjutnya merupakan satu menu signature dari resto tersebut. Kata Golden dan Lamiannya bahkan disematkan ke dalam nama menunya, lho. Yup, nama menunya adalah Golden Soup Beef Lamian. Golden Soup Beef Lamian paling pas dipesan jika kamu ingin makan Lamian berkuah namun sama sekali nggak pedas.\n" +
                "\n" +
                "Kaldu dari soup base pada Golden Soup Beef Lamian sangat gurih dan kaya rasa. Ditambah lagi adanya topping daging sapi slice dan pelengkap lain di bagian atasnya membuat menu ini semakin lezat saat disantap. Kamu juga bisa menambahkan taburan bubuk cabai agar rasanya menjadi sedikit lebih pedas, kok.\n" +
                "\n"),
        ArticleData(5,img = R.drawable.image6, "Menu minuman", "Golden Lamian tidak memiliki banyak jenis minuman dan makanan penutup. Tapi itu tidak berarti menu minumannya sepadan dan hidangan penutup ini akan menjadi makanan penutup yang sempurna. Menu minuman yang tersedia antara lain Es Jeruk, Teh Leci, Teh Lemon, Labu Lemon dan oka.\n" +
                "Adapun opsi Hidangan penutup-itu tersedia puding sutra dalam tiga varian berbeda. Sebagai puding kelapa haluscampuran custard lembut dibumbui dengan kelapa topping daging kelapa.\n" +
                "\n" +
                "Lalu ada Puding Romance Karamel lembut dengan saus karamel manis. Dan akhirnya ada puding mangga krim, puding sutra Rasa mangga dengan potongan mangga asli."),
        ArticleData(6,img = R.drawable.image7, "Menu Lauk pauk\n", "Selain menu utama, pembeli juga bisa mencicipi hiasan untuk melengkapi hidangan. Salah satu pilihan menunya adalah Chicken Feet. Kaki ayam dimasak lembut dan memiliki rasa manis dan gurih.\n" +
                "\n" +
                "\n" +
                "Ada juga menu Siomay yang terdiri dari daging ayam cincang yang dibalut kulit lumpia. Dan kukus hingga pangsit memiliki tekstur yang lembut.\n" +
                "\n" +
                "Sedangkan yang suka hiasan Berkuah bisa mencoba sop siomay spesial. Rasakan kelezatan ayam campur udang yang dibungkus kulit pangsit. Dipadukan dengan kuah kaldu yang gurih, kenikmatannya semakin terasa."),
        ArticleData(7,img = R.drawable.image8, "Ayam Terpedas!", "Kali ini aku pertama kali aku cobain menu baru dari Golden Lamian nih! Disini tempatnya di foodcourt Puri ya. Aku pengen cobain ini gara2 ngeliat video youtube nya TanboyKun! hihi\n" +
                "\n" +
                "Disini aku pesen 2 paket Super X- Tra Spicy dan aku milih level 2 dan level 3. Disini ada 4 tingkatan pedas yaitu level 1,2,3 dan extreme. Tentu aja ini paket nya udah dapat ocha ice dan bisa refill yaa, harganya menurut aku sangat sangat terjangkau! \uD83D\uDE0D\uD83D\uDE0D\n" +
                "\n" +
                "Jujur guys! Rasanya enak bangettt!! Bumbu chili oil nya terasa dan kulit ayamnya itu bener2 ditaburin bubuk cabe gitu. Pedes nya menurut aku melebihi Ri***see level 5. Padahal aku pesen level 2 dan 3 loh, pedesnya sampai ke telinga gitu parah sih. Meskipun pedes, tapi nagihin banget, pengen terus makan dan makan lagi.Lalu selain pedes, rasanya juga manis dan gurih. Manisnya menurut aku antara dari gula yang dicairin atau memakai madu cuman gabikin rasa ayam dan pedasnya hilang, jadi seimbang.\n" +
                "\n" +
                "Biasanya dari rasa manis ini buat ngurangin pedes, namun menurut aku tidak berpengaruh untuk mengurangi pedes. Jadi, buat kalian brani makan pedes, harus cobain sih. Ini enak banget2++ dan pastinya aku bakal repeat order lagi sih! Tapi, buat kalian yang tidak suka makan pedes, jangan coba2 ya, karena jujur ini pedes! hihi\n" +
                "\n" +
                "Lalu menurut aku, untuk ocha nya menurut aku rasanya standard yaa, seperti minuman pada umumnya, tidak pahit sama sekali. Pokoknya aku puas banget sama menu baru mereka \uD83D\uDE0D\uD83D\uDE0D\n"),
        ArticleData(8,img = R.drawable.image9, "Cemilan?", "Cemilan simple.\n" +
                "\n" +
                "Gue milih golden lamian karena waktu itu gue makan di mal citraland enak banget somainya.\n" +
                "\n" +
                "Tp yang disini beda.. tekstur somainya lebih lembek gitu.. :( sedih akutu. Terus karena gak ready jd mesti nunggu 15 menit utk somainya. Ya uda its okay cos kan buat nyemil aja.\n" +
                "\n" +
                "Gue jd beli somai isi 8\n" +
                "Sama ocha dingin\n" +
                "Total jadi 50k\n" +
                "\n" +
                "Semoga bs diperbaiki yaa.\n" +
                "Cos gue suka ama somainya. Ama lamian nya juga."),
        ArticleData(9,img = R.drawable.image10, "Wow Makan Golden lamian Hampir Gratissss", "ini ceritanya aku saat beli golden lamian\n" +
                "Di puri.\n" +
                "Buat kamu yang penyuka lamian ini golden lamian Memang Favorite banget, Mie nya enak banget Dan brasa kayak mie buatan Rumah.\n" +
                "Yang paling aku suka di sini banyak pilih an nya Juga menu nya, jadi udah kayak mie itu pengganti Nasi yakan.\n" +
                "Ada pilih an ayam geprek, Ada beef juga iga,\n" +
                "Dan Harga nya sangat sangat worth It.\n" +
                "\n" +
                "Skala kenyamanan\n" +
                "Tempat nya semua enak yang aku coba sebanyak ini tempatnya pelayanan baik gak pernah kecewa atau kesel gtu.\n" +
                "\n" +
                "Ini yang bikin aku balik lagi dan lagi.\n" +
                "Mie nya juga Ada pilihan kecil Dan gede.\n" +
                "Hainam rice nya juga favorite banget.\n")
    )
}
