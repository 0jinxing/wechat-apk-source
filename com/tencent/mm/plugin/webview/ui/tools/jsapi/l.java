package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Map;
import java.util.Map<Ljava.lang.String;Ljava.lang.Object;>;
import java.util.Set;

public final class l
{
  private static String iCz;
  private static String jVi;
  private static Set<String> uIZ;
  private static String unl;

  static
  {
    AppMethodBeat.i(9850);
    uIZ = new HashSet();
    jVi = "";
    iCz = "";
    unl = "";
    AppMethodBeat.o(9850);
  }

  public static void C(String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(9849);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebViewSecurityUtil", "function name is null or nil.");
      AppMethodBeat.o(9849);
      return;
    }
    Object localObject = null;
    String str1 = "";
    boolean bool1;
    boolean bool2;
    int i;
    int j;
    int k;
    if (paramMap != null)
    {
      bool1 = bo.e((Boolean)paramMap.get("fromMenu"));
      localObject = bo.nullAsNil((String)paramMap.get("keyParam"));
      str1 = bo.bc((String)paramMap.get("appId"), "");
      bool2 = bo.e((Boolean)paramMap.get("isSuccess"));
      i = bo.h((Integer)paramMap.get("permissionValue"));
      j = bo.h((Integer)paramMap.get("baseErrorCode"));
      k = bo.h((Integer)paramMap.get("jsapiErrorCode"));
    }
    for (paramMap = (Map<String, Object>)localObject; ; paramMap = (Map<String, Object>)localObject)
    {
      String str2 = u.akk(bo.nullAsNil(jVi));
      String str3 = u.akk(bo.nullAsNil(iCz));
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str2);
      localStringBuilder.append(",");
      localStringBuilder.append(str3);
      localStringBuilder.append(",");
      if (unl == null)
      {
        localObject = "";
        label222: localStringBuilder.append((String)localObject);
        localStringBuilder.append(",");
        if (paramString != null)
          break label1316;
        localObject = "";
        label244: localStringBuilder.append((String)localObject);
        localStringBuilder.append(",");
        if (!bool1)
          break label1321;
        localObject = "1";
        label267: localStringBuilder.append((String)localObject);
        localStringBuilder.append(",");
        localObject = paramMap;
        if (paramMap == null)
          localObject = "";
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(",");
        localStringBuilder.append(str1);
        localStringBuilder.append(",");
        if (!bool2)
          break label1328;
        paramMap = "1";
        label329: localStringBuilder.append(paramMap);
        localStringBuilder.append(",");
        localStringBuilder.append(i);
        if (!bool2)
        {
          localStringBuilder.append(",");
          localStringBuilder.append(0);
          localStringBuilder.append(",");
          localStringBuilder.append(j);
          localStringBuilder.append(",");
          localStringBuilder.append(k);
        }
        paramMap = localStringBuilder.toString();
        ab.d("MicroMsg.WebViewSecurityUtil", "report: %s", new Object[] { paramMap });
        h.pYm.X(10417, paramMap);
        if (uIZ.size() <= 0)
        {
          uIZ.add("openUrlByExtBrowser");
          uIZ.add("startVoipCall");
          uIZ.add("getCurrentSSID");
          uIZ.add("chooseVideo");
          uIZ.add("uploadVideo");
          uIZ.add("getOpenDeviceId");
          uIZ.add("chooseIdCard");
          uIZ.add("recordVideo");
          uIZ.add("chooseMedia");
          uIZ.add("requestWxFacePictureVerify");
          uIZ.add("requestWxFacePictureVerifyUnionVideo");
          uIZ.add("openRealnameAuth");
          uIZ.add("getInstallState");
          uIZ.add("addDownloadTask");
          uIZ.add("cancelDownloadTask");
          uIZ.add("queryDownloadTask");
          uIZ.add("installDownloadTask");
          uIZ.add("launch3rdApp");
          uIZ.add("pauseDownloadTask");
          uIZ.add("resumeDownloadTask");
          uIZ.add("launchApplication");
          uIZ.add("addDownloadTaskStraight");
          uIZ.add("profile");
          uIZ.add("addContact");
          uIZ.add("jumpToBizProfile");
          uIZ.add("startTempSession");
          uIZ.add("quicklyAddBrandContact");
          uIZ.add("openBizChat");
          uIZ.add("shareTimeline");
          uIZ.add("sendAppMessage");
          uIZ.add("sendServiceAppMessage");
          uIZ.add("getSendC2CMessageRequest");
          uIZ.add("shareQQ");
          uIZ.add("selectSingleContact");
          uIZ.add("sendAppMessageToSpecifiedContact");
          uIZ.add("sendSingleAppMessage");
          uIZ.add("openWeApp");
          uIZ.add("launchMiniProgram");
          uIZ.add("addCustomMenuItems");
          uIZ.add("openUrlWithExtraWebview");
          uIZ.add("enableFullScreen");
          uIZ.add("openCustomWebview");
          uIZ.add("openSpecificView");
          uIZ.add("getBrandWCPayBindCardRequest");
          uIZ.add("getTransferMoneyRequest");
          uIZ.add("verifyWCPayPassword");
          uIZ.add("getRecevieBizHongBaoRequest");
          uIZ.add("getH5PrepayRequest");
          uIZ.add("getH5TransactionRequest");
          uIZ.add("getWebPayCheckoutCounterRequst");
          uIZ.add("getWCPayRealnameVerify");
          uIZ.add("unbindBankCard");
          uIZ.add("idCardRealnameVerify");
          uIZ.add("openLuckyMoneyDetailView");
          uIZ.add("setWCPayPassword");
          uIZ.add("openOfflinePayView");
          uIZ.add("faceVerifyForPay");
          uIZ.add("scanLicence");
          uIZ.add("openBusinessView");
          uIZ.add("getBrandWCPayRequest");
          uIZ.add("editAddress");
          uIZ.add("getLatestAddress");
          uIZ.add("openLocation");
          uIZ.add("chooseInvoiceTitle");
          uIZ.add("requireSoterBiometricAuthentication");
        }
        if (uIZ.contains(paramString))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(str2);
          ((StringBuilder)localObject).append(",");
          ((StringBuilder)localObject).append(str3);
          ((StringBuilder)localObject).append(",");
          paramMap = paramString;
          if (paramString == null)
            paramMap = "";
          ((StringBuilder)localObject).append(paramMap);
          ((StringBuilder)localObject).append(",");
          ((StringBuilder)localObject).append(str1);
          ((StringBuilder)localObject).append(",");
          if (!bool2)
            break label1335;
        }
      }
      label1316: label1321: label1328: label1335: for (paramString = "1"; ; paramString = "0")
      {
        ((StringBuilder)localObject).append(paramString);
        paramString = ((StringBuilder)localObject).toString();
        ab.d("MicroMsg.WebViewSecurityUtil", "report importantJsApi %s", new Object[] { paramString });
        h.pYm.X(17048, paramString);
        AppMethodBeat.o(9849);
        break;
        localObject = unl;
        break label222;
        localObject = paramString;
        break label244;
        localObject = "0";
        break label267;
        paramMap = "0";
        break label329;
      }
      k = 0;
      j = 0;
      i = 0;
      bool2 = false;
      bool1 = false;
    }
  }

  public static void a(e parame)
  {
    AppMethodBeat.i(9848);
    int i;
    if (parame == null)
      i = 1;
    while (true)
    {
      String str;
      if (i != 0)
        str = "";
      try
      {
        label19: jVi = str;
        if (i != 0)
        {
          str = "";
          label30: iCz = str;
          if (i == 0)
            break label77;
        }
        label77: for (parame = ""; ; parame = parame.cYZ())
        {
          unl = parame;
          AppMethodBeat.o(9848);
          return;
          i = 0;
          break;
          str = parame.cYY();
          break label19;
          str = parame.getCurrentUrl();
          break label30;
        }
      }
      catch (Exception parame)
      {
        while (true)
        {
          ab.w("MicroMsg.WebViewSecurityUtil", "report, ex = " + parame.getMessage());
          AppMethodBeat.o(9848);
        }
      }
    }
  }

  public static void a(Map<String, Object> paramMap, boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(9847);
    if (paramMap != null)
    {
      paramMap.put("fromMenu", Boolean.valueOf(paramBoolean));
      paramMap.put("keyParam", paramString1);
      if (bo.isNullOrNil((String)paramMap.get("appId")))
        paramMap.put("appId", paramString2);
    }
    AppMethodBeat.o(9847);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.l
 * JD-Core Version:    0.6.2
 */