package com.fintech.tauma.finsoko;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FinSoko {
        @FormUrlEncoded
        @POST("MerchantRegistration_/PostMerchantRegistration")
        Call<FinSokoClient> registerMerchant
                (@Field("MerchantID") int merID,
                 @Field("MerchantName") String merchantName,
                 @Field("MContact") int merchantContact,
                 @Field("BussinessName") String businessName,
                 @Field("CourierCharges") String servicesCharges,
                 @Field("PayTerms") String paymentTerms,
                 @Field("Location") String Location,
                 @Field("Email") String merchantEmail,
                 @Field("Password") String merchantPass,
                 @Field("ConfirmPassword") String confirmPass

                );
        @FormUrlEncoded
        @POST("Registrations/PostRegistration")
        Call<Registration> registerUser
                (@Field("FirstName") String firstName,
                 @Field("LastName") String lastName,
                 @Field("Phone") int Contact,
                 @Field("UserNatID") int nationalId,
                 @Field("Email") String UserEmail,
                 @Field("Password") String merchantPass,
                 @Field("ConfirmPassword") String confirmPass

                );
        @FormUrlEncoded
        @POST("Logins/PostLogin")
        Call<Registration> loginUser(
                @Field("Email") String Email,
                @Field("Password") String Password
        );




    }


