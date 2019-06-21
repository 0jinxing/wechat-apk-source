package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public class WebStorage
{
  private static WebStorage a;

  private static WebStorage a()
  {
    try
    {
      AppMethodBeat.i(64830);
      if (a == null)
      {
        localWebStorage = new com/tencent/smtt/sdk/WebStorage;
        localWebStorage.<init>();
        a = localWebStorage;
      }
      WebStorage localWebStorage = a;
      AppMethodBeat.o(64830);
      return localWebStorage;
    }
    finally
    {
    }
  }

  public static WebStorage getInstance()
  {
    AppMethodBeat.i(64829);
    WebStorage localWebStorage = a();
    AppMethodBeat.o(64829);
    return localWebStorage;
  }

  public void deleteAllData()
  {
    AppMethodBeat.i(64828);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().n();
      AppMethodBeat.o(64828);
    }
    while (true)
    {
      return;
      android.webkit.WebStorage.getInstance().deleteAllData();
      AppMethodBeat.o(64828);
    }
  }

  public void deleteOrigin(String paramString)
  {
    AppMethodBeat.i(64827);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().e(paramString);
      AppMethodBeat.o(64827);
    }
    while (true)
    {
      return;
      android.webkit.WebStorage.getInstance().deleteOrigin(paramString);
      AppMethodBeat.o(64827);
    }
  }

  public void getOrigins(ValueCallback<Map> paramValueCallback)
  {
    AppMethodBeat.i(64823);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().a(paramValueCallback);
      AppMethodBeat.o(64823);
    }
    while (true)
    {
      return;
      android.webkit.WebStorage.getInstance().getOrigins(paramValueCallback);
      AppMethodBeat.o(64823);
    }
  }

  public void getQuotaForOrigin(String paramString, ValueCallback<Long> paramValueCallback)
  {
    AppMethodBeat.i(64825);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b(paramString, paramValueCallback);
      AppMethodBeat.o(64825);
    }
    while (true)
    {
      return;
      android.webkit.WebStorage.getInstance().getQuotaForOrigin(paramString, paramValueCallback);
      AppMethodBeat.o(64825);
    }
  }

  public void getUsageForOrigin(String paramString, ValueCallback<Long> paramValueCallback)
  {
    AppMethodBeat.i(64824);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().a(paramString, paramValueCallback);
      AppMethodBeat.o(64824);
    }
    while (true)
    {
      return;
      android.webkit.WebStorage.getInstance().getUsageForOrigin(paramString, paramValueCallback);
      AppMethodBeat.o(64824);
    }
  }

  @Deprecated
  public void setQuotaForOrigin(String paramString, long paramLong)
  {
    AppMethodBeat.i(64826);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().a(paramString, paramLong);
      AppMethodBeat.o(64826);
    }
    while (true)
    {
      return;
      android.webkit.WebStorage.getInstance().setQuotaForOrigin(paramString, paramLong);
      AppMethodBeat.o(64826);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebStorage
 * JD-Core Version:    0.6.2
 */