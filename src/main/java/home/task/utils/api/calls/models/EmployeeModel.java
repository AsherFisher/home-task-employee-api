package home.task.utils.api.calls.models;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Employee Model
 */
public class EmployeeModel {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("employee_name")
    private String employeeName;
    @JsonProperty("employee_salary")
    private Integer employeeSalary;
    @JsonProperty("employee_age")
    private Integer employeeAge;
    @JsonProperty("profile_image")
    private String profileImage;


    public EmployeeModel(Integer id, String employeeName, Integer employeeSalary, Integer employeeAge, String profileImage) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.profileImage = profileImage;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    @JsonProperty("employee_name")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @JsonProperty("employee_salary")
    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    @JsonProperty("employee_salary")
    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @JsonProperty("employee_age")
    public Integer getEmployeeAge() {
        return employeeAge;
    }

    @JsonProperty("employee_age")
    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    @JsonProperty("profile_image")
    public String getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

}