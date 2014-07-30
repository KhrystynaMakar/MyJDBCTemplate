package com.springapp.mvc.repo;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

import static org.mockito.Mockito.when;
public class UserJDBCTemplateTestWithMock {
    UserJDBCTemplate userJDBCTemplate = Mockito.mock(UserJDBCTemplate.class);

    @Test
    public void testCreate() throws Exception {
        when(userJDBCTemplate.create("Lola")).thenReturn(1);
        Assert.assertEquals(1, userJDBCTemplate.create("Lola"));
    }
}
