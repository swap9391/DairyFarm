package com.dairyfarm.constant;

/**
 * Created by aniket.patil_3887 on 2/13/2017.
 */
public class URI {
    public static final String PATH_INFO = "/dd";
    public static final String LOGIN_URI = "/dd/login";
    public static final String FORGOT_PASSWORD_URI = "/dd/forgotPassword";
    public static final String LOGOUT_URI = "/dd/logout";
    public static final String REGISTRATION_URI = "/dd/registration";


    public static final String ADD_ACCOUNT_MASTER_URI = "/dd/account";
    public static final String UPDATE_ACCOUNT_MASTER_URI = "/dd/account/{accountId}";
    public static final String LIST_ACCOUNT_MASTER_URI = "/dd/accounts";

    public static final String ADD_CUSTOMER_URI = "/dd/customer";
    public static final String UPDATE_CUSTOMER_URI = "/dd/customer/{customerId}";
    public static final String LIST_CUSTOMER_URI = "/dd/customers";

    public static final String ADD_DEDUCTION_MASTER_URI = "/dd/deduction";
    public static final String UPDATE_DEDUCTION_MASTER_URI = "/dd/deduction/{deductionId}";
    public static final String LIST_DEDUCTION_MASTER_URI = "/dd/deductions";
    public static final String DELETE_DEDUCTION_MASTER_URI = "/dd/deduction/{deductionId}";

    public static final String ADD_DEVICE_MASTER_URI = "/dd/device";
    public static final String UPDATE_DEVICE_MASTER_URI = "/dd/device/{deviceId}";
    public static final String LIST_DEVICE_MASTER_URI = "/dd/devices";
    public static final String DELETE_DEVICE_MASTER_URI = "/dd/device/{deviceId}";

    public static final String ADD_MILK_TYPE_MASTER_URI = "/dd/milkType";
    public static final String UPDATE_MILK_TYPE_MASTER_URI = "/dd/milkType/{milkTypeId}";
    public static final String LIST_MILK_TYPE_MASTER_URI = "/dd/milkTypes";
    public static final String DELETE_MILK_TYPE_MASTER_URI = "/dd/milkType/{milkTypeId}";

    public static final String ADD_USER_URI = "/dd/user";
    public static final String LIST_USER_URI = "/dd/users";
    public static final String DELETE_USER_URI = "/dd/user/{userId}";


    public static final String PATH_VARIABLE_ACCOUNT_ID = "accountId";
    public static final String PATH_VARIABLE_DEDUCTION_ID = "deductionId";
    public static final String PATH_VARIABLE_DEVICE_ID = "deviceId";
    public static final String PATH_VARIABLE_USER_ID = "userId";
    public static final String PATH_VARIABLE_MILK_TYPE_ID = "milkTypeId";
    public static final String PATH_VARIABLE_CUSTOMER_ID = "customerId";
    public static final String PATH_VARIABLE_SLAB_ID = "slabId";

    public static final String ADD_CUSTOMER_ACCOUNT_URI = "/dd/customerAccount";
    public static final String LIST_CUSTOMER_ACCOUNT_URI = "/dd/customerAccounts";

    public static final String ADD_MILK_TRANSACTION_URI = "/dd/milkTransaction";
    public static final String ADD_MILK_RETAIL_URI = "/dd/milkRetail";

    public static final String ADD_FAT_SLAB_URI = "/dd/fatSlab";
    public static final String UPDATE_FAT_SLAB_URI = "/dd/fatSlab/{slabId}";
    public static final String LIST_FAT_SLAB_URI = "/dd/fatSlabs";

}
