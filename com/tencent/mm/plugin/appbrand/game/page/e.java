package com.tencent.mm.plugin.appbrand.game.page;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.aq;
import com.tencent.mm.plugin.appbrand.page.r;
import com.tencent.mm.plugin.appbrand.report.model.g;
import com.tencent.mm.sdk.platformtools.ab;

@SuppressLint({"ViewConstructor"})
public final class e extends r
{
  private volatile d hsI = null;

  public e(Context paramContext, o paramo)
  {
    super(paramContext, paramo);
  }

  public final void Az(String paramString)
  {
    AppMethodBeat.i(130231);
    runOnUiThread(new e.1(this, paramString));
    AppMethodBeat.o(130231);
  }

  public final void aAU()
  {
    AppMethodBeat.i(130234);
    runOnUiThread(new e.2(this));
    AppMethodBeat.o(130234);
  }

  public final boolean aAV()
  {
    return false;
  }

  public final boolean aAW()
  {
    return false;
  }

  public final void af(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(130230);
    if (paramBoolean)
      getCurrentPage().loadUrl(paramString);
    while (true)
    {
      try
      {
        getReporter().a(getCurrentPageView(), null, aq.ivd);
        AppMethodBeat.o(130230);
        return;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.WAGamePageContainer", "report autoReLaunch, e = %s", new Object[] { paramString });
        AppMethodBeat.o(130230);
        continue;
      }
      ab.e("MicroMsg.WAGamePageContainer", "reLaunch without auto is not support here");
      AppMethodBeat.o(130230);
    }
  }

  public final void c(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
  }

  public final void cleanup()
  {
    AppMethodBeat.i(130238);
    super.cleanup();
    getCurrentPage().aAR();
    getCurrentPage().cleanup();
    this.hsI = null;
    removeAllViews();
    AppMethodBeat.o(130238);
  }

  public final d getCurrentPage()
  {
    try
    {
      d locald = this.hsI;
      return locald;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final f getCurrentPageView()
  {
    AppMethodBeat.i(130233);
    f localf = getCurrentPage().getCurrentPageView();
    AppMethodBeat.o(130233);
    return localf;
  }

  public final int getPageCount()
  {
    return 1;
  }

  public final void nU(int paramInt)
  {
    AppMethodBeat.i(130235);
    aAU();
    AppMethodBeat.o(130235);
  }

  public final void onReady()
  {
    boolean bool = true;
    AppMethodBeat.i(130232);
    if (getRuntime() != null);
    while (true)
    {
      ab.i("MicroMsg.WAGamePageContainer", "hy: WAGamePageContainer init onReady, runtime alive %b", new Object[] { Boolean.valueOf(bool) });
      if (getRuntime() != null)
        super.onReady();
      AppMethodBeat.o(130232);
      return;
      bool = false;
    }
  }

  public final void wU()
  {
    AppMethodBeat.i(130237);
    getCurrentPage().aAS();
    try
    {
      getReporter().c(getCurrentPageView());
      AppMethodBeat.o(130237);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WAGamePageContainer", "report foreground, e = %s", new Object[] { localException });
        AppMethodBeat.o(130237);
      }
    }
  }

  public final void wW()
  {
    AppMethodBeat.i(130236);
    getCurrentPage().aAT();
    try
    {
      getReporter().b(getCurrentPageView());
      AppMethodBeat.o(130236);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WAGamePageContainer", "report background, e = %s", new Object[] { localException });
        AppMethodBeat.o(130236);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.e
 * JD-Core Version:    0.6.2
 */