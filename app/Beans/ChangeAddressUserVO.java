package Beans;



/**
 * Created by kartikay.kulshrestha on 12/15/14.
 */


public class ChangeAddressUserVO {
    private String SecondContactNumber;
    private String Province;
    private String StreetName;
    private String Ext;

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    private String ContactNumber;

    public String getApt() {
        return Apt;
    }

    public void setApt(String apt) {
        Apt = apt;
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        StreetNumber = streetNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getExt() {
        return Ext;
    }

    public void setExt(String ext) {
        Ext = ext;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    private String Date;

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getConcateDate() {
        return concateDate;
    }

    public void setConcateDate(String concateDate) {
        this.concateDate = concateDate;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    private String Month;
    private String Year;
    private String concateDate;
    private String City;
    private String StreetNumber;
    private String PostalCode;
    private String Apt;

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getSecondContactNumber() {
        return SecondContactNumber;
    }

    public void setSecondContactNumber(String secondContactNumber) {
        SecondContactNumber = secondContactNumber;
    }
}
