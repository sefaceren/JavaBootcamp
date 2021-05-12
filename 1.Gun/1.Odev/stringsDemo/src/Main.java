import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*// Dizinin uzunluğunu bize verir.
        System.out.println("Elemen sayısı : " + mesaj.length());

        // Index numarasındaki elemanı bize verir.
        System.out.println("5.Eleman : " + mesaj.charAt(4));

        //String'e yeni bir string eklemesi yapar fakat sadece bu satır için geçerli olur.Orjinal değişkeni değiştirmez.
        System.out.println(mesaj.concat(" Yaşasın!"));

        //mesaj değişkeninin b ile başlayıp başlamadığını boolean bir değer döndürerek gösterir.
        System.out.println(mesaj.startsWith("b"));

        //mesaj değişkenin . ile bitip bitmediğini boolean bir değer döndürerek gösterir.
        System.out.print(mesaj.endsWith("."));

        // getChars() metodu için char[] dizisi tanımlaması yaptık.
        char[] karakterler = new char[5];

        // getChar() - Mesaj değişkeninin istediğimiz aralığını belirterek karakterler char dizisine aktardık.
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        // belirli bir string değeri mesaj değişkeni içerisinde aratarak index numarasını buluyoruz.
        System.out.println(mesaj.indexOf("av"));

        // indexOf()'tan farkı aramaya sağ baştan başlamasıdır.
        System.out.println(mesaj.lastIndexOf("e"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        //Replace() - Değiştirmek istediğimiz karakter ve ne ile değiştirileceğini giriyoruz. mesaj değişkeninin içerisine atıyor.
        String yenimesaj = mesaj.replace('a','m');
        System.out.println(yenimesaj);
        //Substring() - Kesmek istediğimiz başlangıç index'i , sonlandırılacak index'e kadar mesaj değişkenini filtreliyoruz.
        System.out.println(mesaj.substring(2,5));

        //Split() - Boşluk karakteri ile mesaj değişkenindeki boşluk karakterlerinin aralarındaki stringleri alarak bir döngü içerisinde kullandık.
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        //toLowerCase() - küçük harfe çevirir.
        System.out.println(mesaj.toLowerCase());
        //toUpperCase() - büyük harfe çevirir.
        System.out.println(mesaj.toUpperCase());

        // trim() - boşluk alır.
        System.out.println(mesaj.trim());
    }
}
