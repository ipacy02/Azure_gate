package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import objects.Customer;

import java.util.List;
import java.util.Map;

public class DataTableStepDefs {

//    @Given("my credentials")
//    public void myCredentials(DataTable dataTable) {
//        List<List<String>> creds = dataTable.asLists();
//        System.out.println("ROW 0 USERNAME = " + creds.get(0).get(0));
//        System.out.println("ROW 0 PASSWORD = " + creds.get(0).get(1));
//        System.out.println("ROW 1 PASSWORD = " + creds.get(1).get(0));
//        System.out.println("ROW 1 USERNAME = " + creds.get(1).get(1));
//
////        System.out.println("PASSWORD = " + creds.get(1));
//    }

@DataTableType
public Customer customerEntry(Map<String, String> entry) {
    return new Customer(entry.get("username"), entry.get("password"));

}
    //USING DataTable

    @Given("myCredentials")
    public void myCredentials(@Transpose Customer customer) {

        System.out.println("USERNAME = " + customer.getUsername());
        System.out.println("PASSWORD = " + customer.getPassword());
    }
}
