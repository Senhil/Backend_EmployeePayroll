package com.example.demo.dto;
import lombok.Data;
import javax.validation.constraints.*;
import java.util.List;

//Created EmployeeDTO class and added validations to fields
@Data
public class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$", message = "Name is invalid! it must have atleast 2 characters and the first character should be uppercase.")
    private String name;
    @NotEmpty(message = "ProfilePic cannot be null")
    private String profilePic;

    @NotEmpty(message = "Department name cannot be null")
    private List<String> department;

    @Min(value = 500, message = "Salary should be more than 500")
    private String salary;

    @Pattern(regexp = "male|female", message = "Gender needs to be male or female ")
    public String gender;

   //@JsonFormat(pattern="dd MMM yyyy")
//    @Pattern(regexp = "dd MMM yyyy", message = "Enter Valid Format")
    //@NotNull(message = " StartDate should not be empty")
    // @PastOrPresent(message = "Date should be past or today date")
    private String startDate;

    private String notes;

    public EmployeeDTO() {
        super();
    }
}