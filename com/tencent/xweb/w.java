package com.tencent.xweb;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.k;
import com.tencent.xweb.c.k.a;
import com.tencent.xweb.xwalk.b;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public final class w
{
  static b ANl;

  public static void a(b paramb)
  {
    try
    {
      ANl = paramb;
      return;
    }
    finally
    {
      paramb = finally;
    }
    throw paramb;
  }

  public static void clearAllWebViewCache(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(3957);
    Context localContext = paramContext;
    if (paramContext == null);
    try
    {
      localContext = XWalkEnvironment.getApplicationContext();
      if (localContext == null)
        AppMethodBeat.o(3957);
      while (true)
      {
        return;
        k.f(WebView.getCurWebType()).clearAllWebViewCache(localContext, paramBoolean);
        AppMethodBeat.o(3957);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        Log.e("XWebSdk", "clearAllWebViewCache failed: " + paramContext.getMessage());
        AppMethodBeat.o(3957);
      }
    }
  }

  public static b dUo()
  {
    try
    {
      b localb = ANl;
      return localb;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void setSharedPreferenceProvider(e parame)
  {
    try
    {
      AppMethodBeat.i(3958);
      XWalkEnvironment.setSharedPreferenceProvider(parame);
      AppMethodBeat.o(3958);
      return;
    }
    finally
    {
      parame = finally;
    }
    throw parame;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.w
 * JD-Core Version:    0.6.2
 */