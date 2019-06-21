package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

public class GeolocationPermissions
{
  private static GeolocationPermissions a;

  private static GeolocationPermissions a()
  {
    try
    {
      AppMethodBeat.i(63903);
      if (a == null)
      {
        localGeolocationPermissions = new com/tencent/smtt/sdk/GeolocationPermissions;
        localGeolocationPermissions.<init>();
        a = localGeolocationPermissions;
      }
      GeolocationPermissions localGeolocationPermissions = a;
      AppMethodBeat.o(63903);
      return localGeolocationPermissions;
    }
    finally
    {
    }
  }

  public static GeolocationPermissions getInstance()
  {
    AppMethodBeat.i(63902);
    GeolocationPermissions localGeolocationPermissions = a();
    AppMethodBeat.o(63902);
    return localGeolocationPermissions;
  }

  public void allow(String paramString)
  {
    AppMethodBeat.i(63907);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().g(paramString);
      AppMethodBeat.o(63907);
    }
    while (true)
    {
      return;
      android.webkit.GeolocationPermissions.getInstance().allow(paramString);
      AppMethodBeat.o(63907);
    }
  }

  public void clear(String paramString)
  {
    AppMethodBeat.i(63906);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().f(paramString);
      AppMethodBeat.o(63906);
    }
    while (true)
    {
      return;
      android.webkit.GeolocationPermissions.getInstance().clear(paramString);
      AppMethodBeat.o(63906);
    }
  }

  public void clearAll()
  {
    AppMethodBeat.i(63908);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().o();
      AppMethodBeat.o(63908);
    }
    while (true)
    {
      return;
      android.webkit.GeolocationPermissions.getInstance().clearAll();
      AppMethodBeat.o(63908);
    }
  }

  public void getAllowed(String paramString, ValueCallback<Boolean> paramValueCallback)
  {
    AppMethodBeat.i(63905);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().c(paramString, paramValueCallback);
      AppMethodBeat.o(63905);
    }
    while (true)
    {
      return;
      android.webkit.GeolocationPermissions.getInstance().getAllowed(paramString, paramValueCallback);
      AppMethodBeat.o(63905);
    }
  }

  public void getOrigins(ValueCallback<Set<String>> paramValueCallback)
  {
    AppMethodBeat.i(63904);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b(paramValueCallback);
      AppMethodBeat.o(63904);
    }
    while (true)
    {
      return;
      android.webkit.GeolocationPermissions.getInstance().getOrigins(paramValueCallback);
      AppMethodBeat.o(63904);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.GeolocationPermissions
 * JD-Core Version:    0.6.2
 */