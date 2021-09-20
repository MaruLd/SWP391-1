/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.Date;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Account_Error {

   private String userNameLengthError;
    private String passwordLengthError;
    private String confirmNotMatched;
    private String fullNameLengthError;
    private String userNameExisted;
    private String accountIDExisted;
    private String phone;

    public String getUserNameLengthError() {
        return userNameLengthError;
    }

    public void setUserNameLengthError(String userNameLengthError) {
        this.userNameLengthError = userNameLengthError;
    }

    public String getPasswordLengthError() {
        return passwordLengthError;
    }

    public void setPasswordLengthError(String passwordLengthError) {
        this.passwordLengthError = passwordLengthError;
    }

    public String getConfirmNotMatched() {
        return confirmNotMatched;
    }

    public void setConfirmNotMatched(String confirmNotMatched) {
        this.confirmNotMatched = confirmNotMatched;
    }

    public String getFullNameLengthError() {
        return fullNameLengthError;
    }

    public void setFullNameLengthError(String fullNameLengthError) {
        this.fullNameLengthError = fullNameLengthError;
    }

    public String getUserNameExisted() {
        return userNameExisted;
    }

    public void setUserNameExisted(String userNameExisted) {
        this.userNameExisted = userNameExisted;
    }

    public String getAccountIDExisted() {
        return accountIDExisted;
    }

    public void setAccountIDExisted(String accountIDExisted) {
        this.accountIDExisted = accountIDExisted;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account_Error(String userNameLengthError, String passwordLengthError, String confirmNotMatched, String fullNameLengthError, String userNameExisted, String accountIDExisted, String phone) {
        this.userNameLengthError = userNameLengthError;
        this.passwordLengthError = passwordLengthError;
        this.confirmNotMatched = confirmNotMatched;
        this.fullNameLengthError = fullNameLengthError;
        this.userNameExisted = userNameExisted;
        this.accountIDExisted = accountIDExisted;
        this.phone = phone;
    }

    public Account_Error() {
    }
    
    
    
}
