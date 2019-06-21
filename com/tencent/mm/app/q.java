package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.svg.a.e;
import com.tencent.mm.svg.b.c.a;

public final class q
{
  private static Class<?> cff = null;
  private static Application cfh;
  private static Resources cfi;
  private static String mPackageName = null;

  public static void Bz()
  {
    boolean bool = true;
    AppMethodBeat.i(15396);
    ab.i("MicroMsg.SVGInit", "SVG initSVGPreload");
    e.a(new c.a()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        AppMethodBeat.i(15394);
        ab.d(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
        AppMethodBeat.o(15394);
      }

      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        AppMethodBeat.i(15393);
        ab.e(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
        AppMethodBeat.o(15393);
      }

      public final void i(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        AppMethodBeat.i(15392);
        ab.i(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
        AppMethodBeat.o(15392);
      }

      public final void printErrStackTrace(String paramAnonymousString1, Throwable paramAnonymousThrowable, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        AppMethodBeat.i(15395);
        ab.printErrStackTrace(paramAnonymousString1, paramAnonymousThrowable, paramAnonymousString2, paramAnonymousArrayOfObject);
        AppMethodBeat.o(15395);
      }
    });
    e.G(cff);
    e.a(cfh, cfi, mPackageName);
    Object localObject1 = cfh;
    while (true)
    {
      try
      {
        localObject1 = ((Application)localObject1).getBaseContext().getResources().getDrawable(2131230734);
        if (localObject1 != null)
        {
          i = 1;
          localObject1 = b.SM();
          if (i == 0)
          {
            ((b)localObject1).eMQ = bool;
            AppMethodBeat.o(15396);
            return;
          }
          bool = false;
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.SVGInit", localThrowable, "not support get svg from application context", new Object[0]);
        b.SM().eMQ = true;
        AppMethodBeat.o(15396);
        continue;
      }
      finally
      {
        b.SM().eMQ = true;
        AppMethodBeat.o(15396);
      }
      int i = 0;
    }
  }

  public static void G(Class<?> paramClass)
  {
    cff = paramClass;
  }

  public static void a(Application paramApplication, Resources paramResources)
  {
    AppMethodBeat.i(15397);
    e.d(paramApplication, mPackageName);
    cfh = paramApplication;
    cfi = paramResources;
    AppMethodBeat.o(15397);
  }

  public static void cY(String paramString)
  {
    mPackageName = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.q
 * JD-Core Version:    0.6.2
 */