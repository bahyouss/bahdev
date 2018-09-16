package com.bahdev;

import com.bahdev.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BahdevV1ApplicationTests {

	@Autowired
	private I18NService i18NService;

    @Test
	public void testMessageByLocaleService() throws Exception{
		String expectedResult = "Startup-bahdev web Project";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);

		Assert.assertEquals("The actual and expected don't match ", expectedResult,actual);
	}

}
