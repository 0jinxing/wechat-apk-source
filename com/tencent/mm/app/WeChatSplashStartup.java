package com.tencent.mm.app;

import android.app.Application;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.kernel.b.h.6;
import com.tencent.mm.splash.m.a;
import com.tencent.mm.splash.o.a;
import com.tencent.mm.vending.h.d;

public class WeChatSplashStartup
  implements m.a
{
  private Application app;
  com.tencent.mm.kernel.b.h profile;
  private String thisProcess;

  private void b(final o.a parama)
  {
    AppMethodBeat.i(137974);
    com.tencent.mm.f.a.bb(this.app);
    com.tencent.mm.blink.a.ig(2);
    if (parama == null);
    for (boolean bool = true; ; bool = false)
    {
      this.profile.onCreate();
      g localg = new g();
      this.profile.eJE.a(localg);
      if (!bool)
      {
        com.tencent.mm.splash.h.dqZ();
        new WeChatSplashStartup.1(this).dnU();
        new com.tencent.mm.sdk.b.c()
        {
        }
        .dnU();
      }
      com.tencent.mm.kernel.g.RQ().a(bh(bool));
      com.tencent.mm.splash.h.a(new WeChatSplashStartup.3(this));
      com.tencent.mm.splash.h.a(o.ceX);
      com.tencent.mm.kernel.g.RQ().a(new WeChatSplashStartup.4(this, bool, parama));
      com.tencent.mm.kernel.g.RQ().a(new WeChatSplashStartup.5(this));
      com.tencent.mm.kernel.g.RQ().a(new WeChatSplashStartup.6(this));
      AppMethodBeat.o(137974);
      return;
    }
  }

  private d bh(boolean paramBoolean)
  {
    AppMethodBeat.i(137975);
    Object localObject;
    if (!paramBoolean)
    {
      localObject = j.Bm();
      ((j)localObject).Bn();
      com.tencent.mm.kernel.g.RQ().a(new WeChatSplashStartup.7(this, (j)localObject));
      com.tencent.mm.kernel.a.c.Sa().d(((j)localObject).cet.getLooper());
      localObject = ((j)localObject).ceu;
      AppMethodBeat.o(137975);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(137975);
    }
  }

  public final void BQ()
  {
    AppMethodBeat.i(137973);
    b(null);
    AppMethodBeat.o(137973);
  }

  public final void a(o.a parama)
  {
    AppMethodBeat.i(137972);
    b(parama);
    AppMethodBeat.o(137972);
  }

  public final void b(Application paramApplication, String paramString)
  {
    AppMethodBeat.i(137971);
    this.app = paramApplication;
    this.thisProcess = paramString;
    this.profile = w.cfw;
    com.tencent.mm.kernel.g.a(this.profile);
    paramString = this.profile;
    paramApplication = this.app;
    paramString.eMA.a(new h.6(paramString, paramApplication));
    AppMethodBeat.o(137971);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WeChatSplashStartup
 * JD-Core Version:    0.6.2
 */