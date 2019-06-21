package com.tencent.xweb;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.k;
import com.tencent.xweb.c.k.a;
import com.tencent.xweb.util.c;
import com.tencent.xweb.util.f;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtensionListener;
import org.xwalk.core.XWalkEnvironment;

public final class x
{
  static boolean ANm = false;
  static boolean ANn = false;

  public static void a(Context paramContext, c paramc)
  {
    AppMethodBeat.i(3959);
    a(paramContext, paramc, null, null, null);
    AppMethodBeat.o(3959);
  }

  public static void a(Context paramContext, c paramc, e parame, u paramu, WebViewExtensionListener paramWebViewExtensionListener)
  {
    try
    {
      AppMethodBeat.i(3960);
      if (paramc != null)
        Log.SetLogCallBack(paramc);
      if (paramu != null)
        f.a(paramu);
      if (parame != null)
        w.setSharedPreferenceProvider(parame);
      jz(paramContext);
      if (paramWebViewExtensionListener != null)
        k.f(WebView.d.ANb).initCallback(paramWebViewExtensionListener);
      XWebCoreContentProvider.dUm();
      AppMethodBeat.o(3960);
      return;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void initInterface()
  {
    try
    {
      AppMethodBeat.i(3961);
      if (ANm)
        AppMethodBeat.o(3961);
      while (true)
      {
        return;
        ANm = true;
        k.a locala = k.f(WebView.d.ANb);
        if (locala != null)
          locala.initInterface();
        locala = k.f(WebView.d.ANc);
        if (locala != null)
          locala.initInterface();
        AppMethodBeat.o(3961);
      }
    }
    finally
    {
    }
  }

  private static void jz(Context paramContext)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(3962);
        if (paramContext == null)
        {
          AppMethodBeat.o(3962);
          return;
        }
        if (ANn)
        {
          AppMethodBeat.o(3962);
          continue;
        }
      }
      finally
      {
      }
      XWalkEnvironment.init(paramContext);
      k.a locala = k.f(WebView.d.ANb);
      if (locala != null)
        locala.initEnviroment(paramContext);
      locala = k.f(WebView.d.ANc);
      if (locala != null)
        locala.initEnviroment(paramContext);
      ANn = true;
      AppMethodBeat.o(3962);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x
 * JD-Core Version:    0.6.2
 */