package com.questionnaire.questionnairecore.populators.impl;

import com.questionnaire.questionnairecore.dtos.UserDTO;
import com.questionnaire.questionnairecore.models.UserModel;
import com.questionnaire.questionnairecore.populators.UserPopulator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserPopulatorTest {

    public static final String EMAIL_ADDRES = "test@test.com";
    public static final String GREAT_PASSWORD = "great_password";
    public static final String NICKNAME = "neoptolem";
    public static final String TEST_FIRSTNAME = "TestFirst";
    public static final String TEST_LAST_NAME = "Test Last Name";
    public static final String PHONE_NUMBER = "555555555";
    private UserDTO userDTO;
    private UserModel userModel;

    private UserPopulator userPopulator = new UserPopulatorImpl();


    @Before
    public void setUp() {
        userDTO = createUserDTO();
        userModel = createUserModel();
    }

    @Test
    public void testConversionFromModelToDTO() {
        UserDTO userDTO = userPopulator.fromModelToDTO(userModel);

        Assert.assertEquals("different email than expected",userDTO.getEmail(),userModel.getEmail());
        Assert.assertEquals("different first name than expected",userDTO.getFirstName(),userModel.getFirstName());
        Assert.assertEquals("different last name than expected",userDTO.getLastName(),userModel.getLastName());
        Assert.assertEquals("different nickname than expected",userDTO.getNickname(),userModel.getNickname());
        Assert.assertEquals("different phone number than expected",userDTO.getPhoneNumber(),userModel.getPhoneNumber());
        Assert.assertEquals("different password than expected",userDTO.getPassword(),userModel.getPassword());
        Assert.assertEquals("different creation date than expected",userDTO.getCreationDate(),userModel.getCreationDate());
        Assert.assertEquals("different account expired values than expected",userDTO.isAccountExpired(),userModel.isAccountExpired());
        Assert.assertEquals("different account locked values than expected",userDTO.isAccountLocked(),userModel.isAccountLocked());
        Assert.assertEquals("different account credentials expired values than expected",userDTO.isCredentialsExpired(),userModel.isCredentialsExpired());
        Assert.assertEquals("different account enable values than expected",userDTO.isEnabled(),userModel.isEnabled());

    }

    @Test
    public void testConversionFromDTOToModel() {
        UserModel userModel = userPopulator.fromDTOToModel(userDTO);

        Assert.assertEquals("different email than expected",userDTO.getEmail(),userModel.getEmail());
        Assert.assertEquals("different first name than expected",userDTO.getFirstName(),userModel.getFirstName());
        Assert.assertEquals("different last name than expected",userDTO.getLastName(),userModel.getLastName());
        Assert.assertEquals("different nickname than expected",userDTO.getNickname(),userModel.getNickname());
        Assert.assertEquals("different phone number than expected",userDTO.getPhoneNumber(),userModel.getPhoneNumber());
        Assert.assertEquals("different password than expected",userDTO.getPassword(),userModel.getPassword());
        Assert.assertEquals("different creation date than expected",userDTO.getCreationDate(),userModel.getCreationDate());
        Assert.assertEquals("different account expired values than expected",userDTO.isAccountExpired(),userModel.isAccountExpired());
        Assert.assertEquals("different account locked values than expected",userDTO.isAccountLocked(),userModel.isAccountLocked());
        Assert.assertEquals("different account credentials expired values than expected",userDTO.isCredentialsExpired(),userModel.isCredentialsExpired());
        Assert.assertEquals("different account enable values than expected",userDTO.isEnabled(),userModel.isEnabled());

    }


    private UserDTO createUserDTO() {

        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(EMAIL_ADDRES);
        userDTO.setPassword(GREAT_PASSWORD);
        userDTO.setNickname(NICKNAME);
        userDTO.setFirstName(TEST_FIRSTNAME);
        userDTO.setLastName(TEST_LAST_NAME);
        userDTO.setCreationDate(new Date());
        userDTO.setPhoneNumber(PHONE_NUMBER);

        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        userDTO.setRoles(roles);
        userDTO.setAccountExpired(true);
        userDTO.setAccountLocked(true);
        userDTO.setCredentialsExpired(true);
        userDTO.setAccountLocked(true);

        return userDTO;
    }

    private UserModel createUserModel(){
        UserModel userModel = new UserModel();
        userModel.setEmail(EMAIL_ADDRES);
        userModel.setPassword(GREAT_PASSWORD);
        userModel.setNickname(NICKNAME);
        userModel.setFirstName(TEST_FIRSTNAME);
        userModel.setLastName(TEST_LAST_NAME);
        userModel.setCreationDate(new Date());
        userModel.setPhoneNumber(PHONE_NUMBER);

        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        userModel.setRoles(roles);
        userModel.setAccountExpired(true);
        userModel.setAccountLocked(true);
        userModel.setCredentialsExpired(true);
        userModel.setAccountLocked(true);

        return userModel;
    }
}
