package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class URLUtil
{
  public static String composeSearchUrl(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(64650);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString1 = localbv.c().a(paramString1, paramString2, paramString3);
      AppMethodBeat.o(64650);
    }
    while (true)
    {
      return paramString1;
      paramString1 = android.webkit.URLUtil.composeSearchUrl(paramString1, paramString2, paramString3);
      AppMethodBeat.o(64650);
    }
  }

  public static byte[] decode(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(64651);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramArrayOfByte = localbv.c().a(paramArrayOfByte);
      AppMethodBeat.o(64651);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = android.webkit.URLUtil.decode(paramArrayOfByte);
      AppMethodBeat.o(64651);
    }
  }

  public static final String guessFileName(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(64664);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString1 = localbv.c().b(paramString1, paramString2, paramString3);
      AppMethodBeat.o(64664);
    }
    while (true)
    {
      return paramString1;
      paramString1 = android.webkit.URLUtil.guessFileName(paramString1, paramString2, paramString3);
      AppMethodBeat.o(64664);
    }
  }

  public static String guessUrl(String paramString)
  {
    AppMethodBeat.i(64649);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString = localbv.c().m(paramString);
      AppMethodBeat.o(64649);
    }
    while (true)
    {
      return paramString;
      paramString = android.webkit.URLUtil.guessUrl(paramString);
      AppMethodBeat.o(64649);
    }
  }

  public static boolean isAboutUrl(String paramString)
  {
    AppMethodBeat.i(64655);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().q(paramString);
      AppMethodBeat.o(64655);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isAboutUrl(paramString);
      AppMethodBeat.o(64655);
    }
  }

  public static boolean isAssetUrl(String paramString)
  {
    AppMethodBeat.i(64652);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().n(paramString);
      AppMethodBeat.o(64652);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isAssetUrl(paramString);
      AppMethodBeat.o(64652);
    }
  }

  public static boolean isContentUrl(String paramString)
  {
    AppMethodBeat.i(64661);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().w(paramString);
      AppMethodBeat.o(64661);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isContentUrl(paramString);
      AppMethodBeat.o(64661);
    }
  }

  @Deprecated
  public static boolean isCookielessProxyUrl(String paramString)
  {
    AppMethodBeat.i(64653);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().o(paramString);
      AppMethodBeat.o(64653);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isCookielessProxyUrl(paramString);
      AppMethodBeat.o(64653);
    }
  }

  public static boolean isDataUrl(String paramString)
  {
    AppMethodBeat.i(64656);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().r(paramString);
      AppMethodBeat.o(64656);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isDataUrl(paramString);
      AppMethodBeat.o(64656);
    }
  }

  public static boolean isFileUrl(String paramString)
  {
    AppMethodBeat.i(64654);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().p(paramString);
      AppMethodBeat.o(64654);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isFileUrl(paramString);
      AppMethodBeat.o(64654);
    }
  }

  public static boolean isHttpUrl(String paramString)
  {
    AppMethodBeat.i(64658);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().t(paramString);
      AppMethodBeat.o(64658);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isHttpUrl(paramString);
      AppMethodBeat.o(64658);
    }
  }

  public static boolean isHttpsUrl(String paramString)
  {
    AppMethodBeat.i(64659);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().u(paramString);
      AppMethodBeat.o(64659);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isHttpsUrl(paramString);
      AppMethodBeat.o(64659);
    }
  }

  public static boolean isJavaScriptUrl(String paramString)
  {
    AppMethodBeat.i(64657);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().s(paramString);
      AppMethodBeat.o(64657);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isJavaScriptUrl(paramString);
      AppMethodBeat.o(64657);
    }
  }

  public static boolean isNetworkUrl(String paramString)
  {
    AppMethodBeat.i(64660);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().v(paramString);
      AppMethodBeat.o(64660);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isNetworkUrl(paramString);
      AppMethodBeat.o(64660);
    }
  }

  public static boolean isValidUrl(String paramString)
  {
    AppMethodBeat.i(64662);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().x(paramString);
      AppMethodBeat.o(64662);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.URLUtil.isValidUrl(paramString);
      AppMethodBeat.o(64662);
    }
  }

  public static String stripAnchor(String paramString)
  {
    AppMethodBeat.i(64663);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString = localbv.c().y(paramString);
      AppMethodBeat.o(64663);
    }
    while (true)
    {
      return paramString;
      paramString = android.webkit.URLUtil.stripAnchor(paramString);
      AppMethodBeat.o(64663);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.URLUtil
 * JD-Core Version:    0.6.2
 */