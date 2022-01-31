package model;

public class PersonDirector {
    private String title;
    private String fullForename;
    private String Surname;
    private String formerNames;
    private String Country;
    private String Nationality;
    private String Month;
    private String BusinessOccupation;

    public PersonDirector(){}
    public PersonDirector(String title){
        this.title = title;
    }

    public PersonDirector(String title, String fullForename, String surname, String formerNames, String country, String nationality, String month, String businessOccupation) {
        this.title = title;
        this.fullForename = fullForename;
        Surname = surname;
        this.formerNames = formerNames;
        Country = country;
        Nationality = nationality;
        Month = month;
        BusinessOccupation = businessOccupation;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getFullForename() {
        return fullForename;
    }

    public String getSurname() {
        return Surname;
    }

    public String getFormerNames() {
        return formerNames;
    }

    public String getCountry() {
        return Country;
    }

    public String getNationality() {
        return Nationality;
    }

    public String getMonth() {
        return Month;
    }

    public String getBusinessOccupation() {
        return BusinessOccupation;
    }

    public void setFullForename(String fullForename) {
        if (fullForename.matches(".*\\d.*")){
            throw new RuntimeException();
        }
        else {
            this.fullForename = fullForename;
        }
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setFormerNames(String formerNames) {
        this.formerNames = formerNames;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public void setBusinessOccupation(String businessOccupation) {
        BusinessOccupation = businessOccupation;
    }

    @Override
    public String toString() {
        return "main.java.model.PersonDirector{" +
                "title='" + title + '\'' +
                ", fullForename='" + fullForename + '\'' +
                ", Surname='" + Surname + '\'' +
                ", formerNames='" + formerNames + '\'' +
                ", Country='" + Country + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", Month='" + Month + '\'' +
                ", BusinessOccupation='" + BusinessOccupation + '\'' +
                '}';
    }

}
