package com.tencent.mm.plugin.appbrand.game;

import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.MBRuntime.IMBEventListener;
import com.tencent.magicbrush.MBRuntime.MBParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.s;

public final class a
{
  public volatile MBRuntime hqb;
  public boolean hqc;
  public boolean hqd;
  public boolean hqe;
  public i hqf;
  public a.c hqg;
  public MBRuntime.IMBEventListener hqh;
  public MBRuntime.MBParams hqi;
  public final a.a hqj;

  public a()
  {
    AppMethodBeat.i(129999);
    this.hqc = false;
    this.hqd = false;
    this.hqe = true;
    this.hqi = new MBRuntime.MBParams();
    this.hqj = new a.a(this, new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(129993);
        if (a.this.hqb != null);
        while (true)
        {
          synchronized (a.this)
          {
            if (a.this.hqb != null)
            {
              a.this.hqb.destroy();
              a.this.hqb = null;
            }
            AppMethodBeat.o(129993);
            return;
          }
          AppMethodBeat.o(129993);
        }
      }
    });
    AppMethodBeat.o(129999);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a
 * JD-Core Version:    0.6.2
 */