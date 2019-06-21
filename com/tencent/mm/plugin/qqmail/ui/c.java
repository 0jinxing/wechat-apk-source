package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ki;
import com.tencent.mm.g.a.ki.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.a;

public final class c
  implements f
{
  private static long pzl = 0L;
  private Activity czX;
  private c.a pzm;

  public c(Activity paramActivity)
  {
    AppMethodBeat.i(68413);
    g.RO().eJo.a(138, this);
    this.czX = paramActivity;
    AppMethodBeat.o(68413);
  }

  public final void a(final c.a parama)
  {
    AppMethodBeat.i(68414);
    this.pzm = parama;
    parama = new ki();
    parama.cFO.czX = this.czX;
    parama.cFO.cFQ = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(68411);
        if (parama.cFP.cvi)
        {
          c.a(c.this);
          AppMethodBeat.o(68411);
        }
        while (true)
        {
          return;
          if (c.b(c.this) != null)
            c.b(c.this).ccG();
          AppMethodBeat.o(68411);
        }
      }
    };
    a.xxA.a(parama, Looper.myLooper());
    AppMethodBeat.o(68414);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(68416);
    release();
    super.finalize();
    AppMethodBeat.o(68416);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(68417);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (this.pzm != null)
      {
        this.pzm.ccF();
        this.pzm = null;
      }
    while (true)
    {
      pzl = System.currentTimeMillis();
      AppMethodBeat.o(68417);
      return;
      if (this.pzm != null)
      {
        this.pzm.ccG();
        this.pzm = null;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(68415);
    g.RO().eJo.b(138, this);
    AppMethodBeat.o(68415);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.c
 * JD-Core Version:    0.6.2
 */