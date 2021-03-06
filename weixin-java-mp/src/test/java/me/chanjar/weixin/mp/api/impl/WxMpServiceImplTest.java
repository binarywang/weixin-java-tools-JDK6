package me.chanjar.weixin.mp.api.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.ApiTestModule;
import me.chanjar.weixin.mp.api.WxXmlMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.bean.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.WxMpTemplateMessage;

@Test
@Guice(modules = ApiTestModule.class)
public class WxMpServiceImplTest {

  @Inject
  private WxMpServiceImpl wxService;

  @Test
  public void testCheckSignature() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetAccessToken() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetAccessTokenBoolean() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetJsapiTicket() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetJsapiTicketBoolean() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testCreateJsapiSignature() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testCustomMessageSend() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassNewsUpload() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassVideoUpload() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassGroupMessageSend() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassOpenIdsMessageSend() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassMessagePreview() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testShortUrl() {
    Assert.fail("Not yet implemented");
  }

  @Test(invocationCount = 100, threadPoolSize = 30)
  public void testTemplateSend() throws WxErrorException {
    SimpleDateFormat dateFormat = new SimpleDateFormat(
        "yyyy-MM-dd HH:mm:ss.SSS");
    WxXmlMpInMemoryConfigStorage configStorage = (WxXmlMpInMemoryConfigStorage) this.wxService
        .getWxMpConfigStorage();
    WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder()
        .toUser(configStorage.getOpenid())
        .templateId(configStorage.getTemplateId()).build();
    templateMessage.addWxMpTemplateData(
        new WxMpTemplateData("first", dateFormat.format(new Date())));
    this.wxService.templateSend(templateMessage);
  }

  @Test
  public void testSetIndustry() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetIndustry() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testSemanticQuery() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testOauth2buildAuthorizationUrl() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testBuildQrConnectUrl() {
    String qrconnectRedirectUrl = ((WxXmlMpInMemoryConfigStorage) this.wxService.getWxMpConfigStorage()).getQrconnectRedirectUrl();
    String qrConnectUrl = this.wxService.buildQrConnectUrl(qrconnectRedirectUrl,
        WxConsts.QRCONNECT_SCOPE_SNSAPI_LOGIN, null);
    Assert.assertNotNull(qrConnectUrl);
    System.out.println(qrConnectUrl);
  }

  @Test
  public void testOauth2getAccessToken() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testOauth2refreshAccessToken() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testOauth2getUserInfo() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testOauth2validateAccessToken() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetCallbackIP() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGet() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testPost() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testExecute() {
    Assert.fail("Not yet implemented");
  }

}
