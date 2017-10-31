package Model;

import java.io.Serializable;

public class User implements Serializable 
{
    
    private String user_id;
    private String password;
    private String first_name;
    private String last_name;
    private String email;
    private int age;
    private String gender;
    private String travel_location;
    
    
    public User () 
    {
        user_id = "";
        password = "";
        first_name = "";
        last_name = "";
        email = "";
        age = 0;
        gender = "";
        travel_location = "";
    }
    
    public User (String user_id, String password, String first_name, 
            String last_name, String email, int age, String gender, 
            String travel_location) 
    {
        this.user_id = user_id;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.travel_location = travel_location;
    }

    /**
     * @return the user_id
     */
    public String getUser_id() 
    {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) 
    {
        this.user_id = user_id;
    }

    /**
     * @return the password
     */
    public String getPassword() 
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() 
    {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) 
    {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() 
    {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) 
    {
        this.last_name = last_name;
    }

    /**
     * @return the email
     */
    public String getEmail() 
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) 
    {
        this.email = email;
    }

    /**
     * @return the age
     */
    public int getAge() 
    {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) 
    {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() 
    {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    /**
     * @return the travel_location
     */
    public String getTravel_location() 
    {
        return travel_location;
    }

    /**
     * @param travel_location the travel_location to set
     */
    public void setTravel_location(String travel_location) 
    {
        this.travel_location = travel_location;
    }
}