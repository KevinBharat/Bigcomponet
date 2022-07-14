package bigcomponet.hwork.bigcomponet.Model;

public class Model {
        String strLang;
        int imgLang;

    public Model(String strLang,int imgLang){
        this.strLang=strLang;
        this.imgLang=imgLang;
    }

    public String getStrLang() {
        return strLang;
    }

    public void setStrLang(String strLang) {
        this.strLang = strLang;
    }

    public int getImgLang() {
        return imgLang;
    }

    public void setImgLang(int imgLang) {
        this.imgLang = imgLang;
    }
}
