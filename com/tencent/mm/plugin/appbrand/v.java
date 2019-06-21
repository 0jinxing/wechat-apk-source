package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Locale;

public enum v
{
  public static String a(WxaExposedParams paramWxaExposedParams)
  {
    AppMethodBeat.i(129126);
    String str = "";
    if ((paramWxaExposedParams == null) || (bo.isNullOrNil(paramWxaExposedParams.appId)))
    {
      ab.e("MicroMsg.AppBrandUrlBuilders", "buildFeedbackUrl fail, null or nil appId");
      AppMethodBeat.o(129126);
      paramWxaExposedParams = str;
    }
    while (true)
    {
      return paramWxaExposedParams;
      try
      {
        paramWxaExposedParams = String.format("https://mp.weixin.qq.com/wxawap/wapreportwxadevlog?action=complain_feedback&appid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect", new Object[] { paramWxaExposedParams.appId, q.encode(bo.nullAsNil(paramWxaExposedParams.pageId), "UTF-8"), Integer.valueOf(paramWxaExposedParams.from), Integer.valueOf(bo.g(Integer.valueOf(paramWxaExposedParams.gVt), -1)), Integer.valueOf(bo.g(Integer.valueOf(paramWxaExposedParams.gVu), -1)) });
        AppMethodBeat.o(129126);
      }
      catch (UnsupportedEncodingException paramWxaExposedParams)
      {
        ab.e("MicroMsg.AppBrandUrlBuilders", "buildFeedbackUrl encode fail, invalid arguments");
        AppMethodBeat.o(129126);
        paramWxaExposedParams = str;
      }
    }
  }

  public static String b(WxaExposedParams paramWxaExposedParams)
  {
    AppMethodBeat.i(129127);
    String str = "";
    if ((paramWxaExposedParams == null) || (bo.isNullOrNil(paramWxaExposedParams.appId)))
    {
      ab.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl fail, null or nil appId");
      AppMethodBeat.o(129127);
      paramWxaExposedParams = str;
    }
    while (true)
    {
      return paramWxaExposedParams;
      try
      {
        paramWxaExposedParams = String.format("https://mp.weixin.qq.com/mp/wacomplain?action=show&appid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect", new Object[] { paramWxaExposedParams.appId, q.encode(bo.nullAsNil(paramWxaExposedParams.pageId), "UTF-8"), Integer.valueOf(paramWxaExposedParams.from), Integer.valueOf(bo.g(Integer.valueOf(paramWxaExposedParams.gVt), -1)), Integer.valueOf(bo.g(Integer.valueOf(paramWxaExposedParams.gVu), -1)) });
        AppMethodBeat.o(129127);
      }
      catch (UnsupportedEncodingException paramWxaExposedParams)
      {
        ab.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl encode fail, invalid arguments");
        AppMethodBeat.o(129127);
        paramWxaExposedParams = str;
      }
    }
  }

  public static String bp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(129130);
    URI localURI = new URI(paramString1);
    paramString1 = localURI.getQuery();
    if (paramString1 == null);
    for (paramString1 = paramString2; ; paramString1 = paramString1 + "&" + paramString2)
    {
      paramString1 = new URI(localURI.getScheme(), localURI.getAuthority(), localURI.getPath(), paramString1, localURI.getFragment()).toString();
      AppMethodBeat.o(129130);
      return paramString1;
    }
  }

  public static String xf(String paramString)
  {
    AppMethodBeat.i(129125);
    paramString = String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=overseas#wechat_redirect", new Object[] { paramString });
    AppMethodBeat.o(129125);
    return paramString;
  }

  public static String xg(String paramString)
  {
    AppMethodBeat.i(129128);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrandUrlBuilders", "buildEntityUrl fail, null or nil appId");
      paramString = "";
      AppMethodBeat.o(129128);
    }
    while (true)
    {
      return paramString;
      paramString = String.format("https://mp.weixin.qq.com/mp/waverifyinfo?action=get&appid=%s#wechat_redirect", new Object[] { paramString });
      AppMethodBeat.o(129128);
    }
  }

  public static String xh(String paramString)
  {
    AppMethodBeat.i(129129);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrandUrlBuilders", "buildLowVersionUrl fail, invalid arguments");
      paramString = "";
      AppMethodBeat.o(129129);
    }
    while (true)
    {
      return paramString;
      paramString = String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect", new Object[] { paramString, Integer.valueOf(3) });
      AppMethodBeat.o(129129);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.v
 * JD-Core Version:    0.6.2
 */