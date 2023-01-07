package day13_writeExcel_Screenshot;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {

        // excel dosyalari bilgisayarimizda oldugu icin
        // Java'dan FileInputStream class'i yardimiyla ulasacagiz

        String dosyaYolu=" src/test/java/day12_webtables_excel/ulkeler.xlsx";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        Workbook workbook= WorkbookFactory.create(fis);

        System.out.println(workbook.getSheet("Sayfa1").getRow(3).getCell(1));

        // satir ve sutun bilgisini parametre olarak alip
        // o hucredeki bilgiyi yazdiran bir method olusturun

        dataYazdir(25,2); // Brunei
        dataYazdir(14,3); // Dakka



    }

    private void dataYazdir(int satir, int sutun) throws IOException {

        String dosyaYolu="src/test/java/day12_webtables_excel/ulkeler.xlsx";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        Workbook workbook= WorkbookFactory.create(fis);

        System.out.println(workbook.getSheet("Sayfa1").getRow(satir).getCell(sutun));
    }
}
/*echo "# selenium-proje" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/sevilayisler/selenium-proje.git
git push -u origin main
Yerel bilgisayarımdaki tüm dosyaları sildikten sonra da benzer bir hatayla karşılaştım ve depodaki tüm dosyaları temizlemem gerekiyor.
////////////////////////////////////
Hata mesajım şöyle bir şeydi:

error: src refspec master does not match any.
error: failed to push some refs to 'git@github ... .git'
Ve aşağıdaki komutları uygulayarak çözüldü:

touch README
git add README

git add (all other files)
git commit -m 'reinitialized files'
git push origin master --force  # <- caution, --force can delete others work.

 */

