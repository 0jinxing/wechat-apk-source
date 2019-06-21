package com.tencent.mm.splash;

import android.app.Application;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class m
{
  private static String bWa;
  private static Application xGE;
  private static boolean xHB = false;
  private static a xHC;
  private static boolean xHD = false;
  private static o.a xHE;

  public static void a(Application paramApplication, String paramString1, String paramString2)
  {
    boolean bool1 = true;
    AppMethodBeat.i(114889);
    xGE = paramApplication;
    bWa = paramString1;
    h.a(new o()
    {
      public final void d(o.a paramAnonymousa)
      {
        AppMethodBeat.i(114888);
        ab.i("MicroMsg.SplashInit", "do one more thing");
        m.c(paramAnonymousa);
        m.sS(this.xHF);
        m.BK();
        AppMethodBeat.o(114888);
      }
    });
    h.drh().mStartTimestamp = System.currentTimeMillis();
    if (!paramApplication.getPackageName().equals(paramString1))
      h.g("MicroMsg.SplashInit", "not main process(%s), no hack, do fallback.", new Object[] { paramString1 });
    while (true)
    {
      xHB = bool1;
      if (h.xGI != null)
        h.xGI.BP();
      if ((!bool1) || (a.hc(paramApplication)));
      try
      {
        a.he(paramApplication);
        boolean bool2 = a.hg(paramApplication);
        h.g("MicroMsg.SplashInit", "block checking dex opt result: %s", new Object[] { Boolean.valueOf(bool2) });
        if (!bool2)
        {
          h.g("MicroMsg.SplashInit", "dexopt service return failed or timeout. kill self.", new Object[0]);
          h.bZk();
        }
        a.hd(paramApplication);
        if ((g.wY) || (bool1))
          aoc(paramString2);
        AppMethodBeat.o(114889);
        return;
        if (!h.i(paramApplication))
        {
          h.drh().m(675L, 5L, 1L);
          h.hh(paramApplication);
          h.g("MicroMsg.SplashInit", "hack failed, do fallback logic.", new Object[0]);
        }
        else
        {
          bool1 = false;
          h.drc();
        }
      }
      catch (InterruptedException paramApplication)
      {
        paramApplication = new RuntimeException(paramApplication);
        AppMethodBeat.o(114889);
      }
    }
    throw paramApplication;
  }

  private static void aoc(String paramString)
  {
    AppMethodBeat.i(114890);
    if (xHC != null)
      AppMethodBeat.o(114890);
    while (true)
    {
      return;
      paramString = aod(paramString);
      paramString.b(xGE, bWa);
      xHC = paramString;
      AppMethodBeat.o(114890);
    }
  }

  private static a aod(String paramString)
  {
    AppMethodBeat.i(114893);
    try
    {
      a locala = (a)Class.forName(paramString).newInstance();
      AppMethodBeat.o(114893);
      return locala;
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("MicroMsg.SplashInit", localException, "%s has problem!", new Object[] { paramString });
      paramString = new RuntimeException(localException);
      AppMethodBeat.o(114893);
    }
    throw paramString;
  }

  private static void drq()
  {
    AppMethodBeat.i(114891);
    if ((xHD) && (xHE != null))
      xHC.a(xHE);
    AppMethodBeat.o(114891);
  }

  public static void drr()
  {
    AppMethodBeat.i(114892);
    h.g("MicroMsg.SplashInit", "applicationOnCreate", new Object[0]);
    h.dqY();
    xHD = true;
    if (xHB)
    {
      xHC.BQ();
      AppMethodBeat.o(114892);
    }
    while (true)
    {
      return;
      drq();
      AppMethodBeat.o(114892);
    }
  }

  public static abstract interface a
  {
    public abstract void BQ();

    public abstract void a(o.a parama);

    public abstract void b(Application paramApplication, String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.m
 * JD-Core Version:    0.6.2
 */