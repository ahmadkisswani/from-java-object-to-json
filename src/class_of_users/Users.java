
package class_of_users;

public class Users {
    private String FirstName;
      private String LastName;
       private String medName;
       private String barthDate;
       private String gender ;

    public Users() {
      
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMedName() {
        return medName;
    }

    public String getBarthDate() {
        return barthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public void setBarthDate(String barthDate) {
        this.barthDate = barthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Users{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", medName=" + medName + ", barthDate=" + barthDate + ", gender=" + gender + '}';
    }
    
    
    
}
