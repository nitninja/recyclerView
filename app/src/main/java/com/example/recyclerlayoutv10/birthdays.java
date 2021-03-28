package com.example.recyclerlayoutv10;

public class birthdays {
    private String sitename;
    private String imageurl;
     private String date;
    public birthdays(String sitename,String date, String imageurl) {
        this.sitename = sitename;
        this.imageurl = imageurl;
        this.date = date;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
    public String getDate(){return date;}
    public void setDate (String date){this.date=date;}
    @Override
    public String toString() {
        return "memes{" +
                "sitename='" + sitename + '\'' +
                "date='"+ date +'\''+
                ", imageurl='" + imageurl + '\'' +
                '}';
    }
}
