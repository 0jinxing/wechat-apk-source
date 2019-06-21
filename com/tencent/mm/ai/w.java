package com.tencent.mm.ai;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.e.a;

public final class w
{
  public static b fuq = null;

  public static b a(b paramb, a parama)
  {
    AppMethodBeat.i(58308);
    a(paramb, parama, false, null);
    AppMethodBeat.o(58308);
    return paramb;
  }

  public static m a(b paramb, a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(138431);
    paramb = a(paramb, parama, paramBoolean, null);
    AppMethodBeat.o(138431);
    return paramb;
  }

  public static m a(b paramb, a parama, boolean paramBoolean, com.tencent.mm.vending.e.b paramb1)
  {
    AppMethodBeat.i(58310);
    c localc = new c(parama);
    if (parama == null)
      localc = null;
    if ((paramb1 != null) && (localc != null))
      paramb1.keep(localc);
    paramb = b(paramb, localc, paramBoolean);
    AppMethodBeat.o(58310);
    return paramb;
  }

  public static boolean adF()
  {
    boolean bool = false;
    AppMethodBeat.i(58305);
    if (fuq == null)
    {
      ab.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
      AppMethodBeat.o(58305);
    }
    while (true)
    {
      return bool;
      if (fuq.Rh() == null)
      {
        ab.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
        AppMethodBeat.o(58305);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(58305);
      }
    }
  }

  public static b b(b paramb)
  {
    AppMethodBeat.i(58307);
    a(paramb, null, false, null);
    AppMethodBeat.o(58307);
    return paramb;
  }

  private static m b(b paramb, final a parama, final boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(138068);
    if (fuq == null)
    {
      ab.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
      AppMethodBeat.o(138068);
      paramb = localObject;
    }
    while (true)
    {
      return paramb;
      if (fuq.Rh() == null)
      {
        ab.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
        AppMethodBeat.o(138068);
        paramb = localObject;
      }
      else if (paramb == null)
      {
        ab.e("MicroMsg.RunCgi", "ERROR: Param CommReqResp is null");
        AppMethodBeat.o(138068);
        paramb = localObject;
      }
      else
      {
        paramb = new m()
        {
          private k fsE;
          f fur;
          final m fus;
          int fut;
          ap fuu;
          final long startTime;

          public final int a(e paramAnonymouse, f paramAnonymousf)
          {
            AppMethodBeat.i(58300);
            this.fur = paramAnonymousf;
            int i = a(paramAnonymouse, this.fuv, this.fsE);
            ab.i("MicroMsg.RunCgi", "Start doScene:%d func:%d netid:%d time:%d", new Object[] { Integer.valueOf(this.fus.hashCode()), Integer.valueOf(this.fuv.fsI), Integer.valueOf(i), Long.valueOf(bo.anU() - this.startTime) });
            if (parama != null)
            {
              if (i >= 0)
                break label124;
              w.a(paramBoolean, parama, 3, -1, "", this.fuv, this.fus);
            }
            while (true)
            {
              AppMethodBeat.o(58300);
              return i;
              label124: this.fuu.ae(60000L, 60000L);
            }
          }

          public final int getType()
          {
            return this.fuv.fsI;
          }
        };
        if (fuq.Rh().a(paramb, 0))
        {
          AppMethodBeat.o(138068);
        }
        else
        {
          AppMethodBeat.o(138068);
          paramb = localObject;
        }
      }
    }
  }

  public static void c(m paramm)
  {
    AppMethodBeat.i(58306);
    if (fuq == null)
    {
      ab.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
      AppMethodBeat.o(58306);
    }
    while (true)
    {
      return;
      if (fuq.Rh() == null)
      {
        ab.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
        AppMethodBeat.o(58306);
      }
      else if (paramm == null)
      {
        ab.e("MicroMsg.RunCgi", "ERROR: Param scene  == null.");
        AppMethodBeat.o(58306);
      }
      else
      {
        fuq.Rh().c(paramm);
        AppMethodBeat.o(58306);
      }
    }
  }

  public static abstract interface a
  {
    public abstract int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm);
  }

  public static abstract interface b
  {
    public abstract p Rh();
  }

  static final class c
    implements w.a, a
  {
    private w.a fuA;

    public c(w.a parama)
    {
      this.fuA = parama;
    }

    public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
    {
      AppMethodBeat.i(58304);
      if (this.fuA != null)
      {
        paramInt1 = this.fuA.a(paramInt1, paramInt2, paramString, paramb, paramm);
        AppMethodBeat.o(58304);
      }
      while (true)
      {
        return paramInt1;
        paramInt1 = -100000;
        AppMethodBeat.o(58304);
      }
    }

    public final void dead()
    {
      this.fuA = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.w
 * JD-Core Version:    0.6.2
 */