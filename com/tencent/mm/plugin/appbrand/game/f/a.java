package com.tencent.mm.plugin.appbrand.game.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class a
{
  private static a hui;
  public String appId;
  boolean cph;
  private int hub;
  public long huc;
  public long hud;
  public int hue;
  private float huf;
  public CopyOnWriteArrayList<Long> hug;
  HashMap<Integer, Integer> huh;
  public g.c huj;
  public com.tencent.magicbrush.a mbInspector;

  public a()
  {
    AppMethodBeat.i(130332);
    this.hub = 0;
    this.huc = 0L;
    this.hud = 0L;
    this.appId = "";
    this.cph = false;
    this.hue = -1;
    this.huf = -1.0F;
    this.hug = new CopyOnWriteArrayList();
    this.huh = new HashMap();
    this.huj = new g.c()
    {
      public final void a(g.d paramAnonymousd)
      {
        AppMethodBeat.i(130328);
        ab.i("MicroMsg.MBNiReporter", "hy: onPause");
        paramAnonymousd = a.this;
        if (paramAnonymousd.cph)
        {
          ab.i("MicroMsg.MBNiReporter", "hy: hasReported!");
          AppMethodBeat.o(130328);
        }
        while (true)
        {
          return;
          com.tencent.mm.ce.a.post(new a.5(paramAnonymousd));
          AppMethodBeat.o(130328);
        }
      }

      public final void onCreate()
      {
        AppMethodBeat.i(130326);
        ab.i("MicroMsg.MBNiReporter", "hy: onCreate");
        a.e(a.this);
        AppMethodBeat.o(130326);
      }

      public final void onDestroy()
      {
        AppMethodBeat.i(130329);
        ab.i("MicroMsg.MBNiReporter", "hy: onDestroy");
        a locala = a.this;
        ab.i("MicroMsg.MBNiReporter", "hy: release!");
        g.b(locala.appId, locala.huj);
        AppMethodBeat.o(130329);
      }

      public final void onResume()
      {
        AppMethodBeat.i(130327);
        ab.i("MicroMsg.MBNiReporter", "hy: onResume");
        AppMethodBeat.o(130327);
      }
    };
    AppMethodBeat.o(130332);
  }

  public static a aBG()
  {
    AppMethodBeat.i(130333);
    if (hui == null);
    try
    {
      if (hui == null)
      {
        locala = new com/tencent/mm/plugin/appbrand/game/f/a;
        locala.<init>();
        hui = locala;
      }
      a locala = hui;
      AppMethodBeat.o(130333);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(130333);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.f.a
 * JD-Core Version:    0.6.2
 */