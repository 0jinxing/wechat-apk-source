package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WebViewDatabase
{
  private static WebViewDatabase a;
  private Context b;

  protected WebViewDatabase(Context paramContext)
  {
    this.b = paramContext;
  }

  private static WebViewDatabase a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(65034);
      if (a == null)
      {
        WebViewDatabase localWebViewDatabase = new com/tencent/smtt/sdk/WebViewDatabase;
        localWebViewDatabase.<init>(paramContext);
        a = localWebViewDatabase;
      }
      paramContext = a;
      AppMethodBeat.o(65034);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static WebViewDatabase getInstance(Context paramContext)
  {
    AppMethodBeat.i(65033);
    paramContext = a(paramContext);
    AppMethodBeat.o(65033);
    return paramContext;
  }

  public void clearFormData()
  {
    AppMethodBeat.i(65040);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().g(this.b);
      AppMethodBeat.o(65040);
    }
    while (true)
    {
      return;
      android.webkit.WebViewDatabase.getInstance(this.b).clearFormData();
      AppMethodBeat.o(65040);
    }
  }

  public void clearHttpAuthUsernamePassword()
  {
    AppMethodBeat.i(65038);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().e(this.b);
      AppMethodBeat.o(65038);
    }
    while (true)
    {
      return;
      android.webkit.WebViewDatabase.getInstance(this.b).clearHttpAuthUsernamePassword();
      AppMethodBeat.o(65038);
    }
  }

  @Deprecated
  public void clearUsernamePassword()
  {
    AppMethodBeat.i(65036);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().c(this.b);
      AppMethodBeat.o(65036);
    }
    while (true)
    {
      return;
      android.webkit.WebViewDatabase.getInstance(this.b).clearUsernamePassword();
      AppMethodBeat.o(65036);
    }
  }

  public boolean hasFormData()
  {
    AppMethodBeat.i(65039);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().f(this.b);
      AppMethodBeat.o(65039);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.WebViewDatabase.getInstance(this.b).hasFormData();
      AppMethodBeat.o(65039);
    }
  }

  public boolean hasHttpAuthUsernamePassword()
  {
    AppMethodBeat.i(65037);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().d(this.b);
      AppMethodBeat.o(65037);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.WebViewDatabase.getInstance(this.b).hasHttpAuthUsernamePassword();
      AppMethodBeat.o(65037);
    }
  }

  @Deprecated
  public boolean hasUsernamePassword()
  {
    AppMethodBeat.i(65035);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().b(this.b);
      AppMethodBeat.o(65035);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.WebViewDatabase.getInstance(this.b).hasUsernamePassword();
      AppMethodBeat.o(65035);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebViewDatabase
 * JD-Core Version:    0.6.2
 */