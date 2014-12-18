package Beans;

/**
 * Created by kartikay.kulshrestha on 12/17/14.
 */
public class CurrentAddressUserVO {
    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    private String AccountNumber="566234902";
    private String Province = "ONTARIO";
    private String StreetName = "LISA St BRAMPTON";

    private String City = "TORANTO";
    private String StreetNumber = "10";
    private String PostalCode = "L6T4N4";
    private String Apt = "1102";



    public String getProvince() {
        return Province;
    }

        public void setProvince(String province) {
            Province = province;
        }

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


        public String getStreetName() {
            return StreetName;
        }

        public void setStreetName(String streetName) {
            StreetName = streetName;
        }


        public String getPostalCode() {
            return PostalCode;
        }

        public void setPostalCode(String postalCode) {
            PostalCode = postalCode;
        }




}
