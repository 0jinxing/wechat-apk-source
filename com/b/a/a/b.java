package com.b.a.a;

import android.net.wifi.ScanResult;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.List;

abstract class b extends a
{
  private z bCI;

  b()
  {
    super(new d[] { ab.wD(), r.wg(), u.wx(), k.wc() });
  }

  private void b(p paramp)
  {
    if (this.bCI != null);
    try
    {
      z localz = this.bCI;
      a locala = new com/b/a/a/b$a;
      locala.<init>(this, paramp, (byte)0);
      localz.execute(locala);
      label28: return;
    }
    catch (Exception paramp)
    {
      break label28;
    }
  }

  k.a a(d.a parama)
  {
    if (parama == null);
    for (parama = null; ; parama = new k.a(Math.max(parama.bCP, 10000L)))
      return parama;
  }

  abstract void a(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat, long paramLong1, long paramLong2);

  abstract void a(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3, float paramFloat4, float paramFloat5, long paramLong);

  abstract void a(int paramInt, String paramString, long paramLong1, long paramLong2);

  void a(Handler paramHandler, d.a parama)
  {
    if (paramHandler == null)
      try
      {
        paramHandler = new java/lang/Exception;
        paramHandler.<init>("CoreAssembly: master thread handler must be specified and cannot be null");
        throw paramHandler;
      }
      finally
      {
      }
    this.bCI = z.b(paramHandler);
    super.a(paramHandler, parama);
  }

  final void a(Handler paramHandler, Handler[] paramArrayOfHandler)
  {
    paramArrayOfHandler[0] = paramHandler;
    paramArrayOfHandler[1] = null;
    paramArrayOfHandler[2] = paramHandler;
    paramArrayOfHandler[3] = paramHandler;
  }

  final void a(d.a parama, d.a[] paramArrayOfa)
  {
    paramArrayOfa[0] = parama;
    paramArrayOfa[1] = null;
    paramArrayOfa[2] = null;
    paramArrayOfa[3] = a(parama);
  }

  public void a(p paramp)
  {
    switch (paramp.what)
    {
    default:
    case 101:
    case 201:
    case 202:
    case 301:
    case 401:
    }
    while (true)
    {
      return;
      a(((ab.a)paramp).bJi, paramp.bFB, paramp.bFC);
      continue;
      b(paramp);
      continue;
      b(paramp);
      continue;
      paramp = (u.e)paramp;
      a(paramp.x, paramp.y, paramp.bIb, paramp.bHZ, paramp.bIa, paramp.speed, paramp.bFC);
      continue;
      paramp = (k.b)paramp;
      a(paramp.lat, paramp.lng, Double.valueOf(paramp.bEI).intValue(), Math.round(paramp.bEJ), Math.round(paramp.speed), paramp.bEL, paramp.bEM, paramp.bEK, paramp.bEN, paramp.bFC);
    }
  }

  abstract void a(x paramx, long paramLong1, long paramLong2);

  abstract void a(List<ScanResult> paramList, long paramLong1, long paramLong2);

  static final class a
    implements Runnable
  {
    private final WeakReference<b> bCJ;
    private final p bCK;

    private a(b paramb, p paramp)
    {
      AppMethodBeat.i(55672);
      if ((paramb == null) || (paramp == null))
      {
        paramb = new Exception("CoreAssembly: HandleMsgTask: null arg");
        AppMethodBeat.o(55672);
        throw paramb;
      }
      this.bCJ = new WeakReference(paramb);
      this.bCK = paramp;
      AppMethodBeat.o(55672);
    }

    public final void run()
    {
      AppMethodBeat.i(55673);
      b localb = (b)this.bCJ.get();
      if (localb != null)
        switch (this.bCK.what)
        {
        default:
        case 202:
        }
      while (true)
      {
        AppMethodBeat.o(55673);
        r.f localf;
        while (true)
        {
          return;
          localf = (r.f)this.bCK;
          if (localf.bFZ != 1)
            break;
          localb.a(localf.bGa, localf.bFB, localf.bFC);
          AppMethodBeat.o(55673);
        }
        localb.a(localf.bFZ, localf.message, localf.bFB, localf.bFC);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.b.a.a.b
 * JD-Core Version:    0.6.2
 */