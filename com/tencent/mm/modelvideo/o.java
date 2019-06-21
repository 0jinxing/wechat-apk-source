package com.tencent.mm.modelvideo;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

public class o
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private static al fWL;
  private static ak fWM;
  private volatile v fWE;
  private volatile t fWF;
  private volatile x fWG;
  private volatile y.a fWH;
  private volatile l fWI;
  private volatile k fWJ;
  private volatile m fWK;
  private com.tencent.mm.al.e fWN;
  private i fWO;
  private p fWP;

  static
  {
    AppMethodBeat.i(50778);
    fWL = null;
    fWM = null;
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("VIDEOINFO_TABLE".hashCode()), new o.1());
    eaA.put(Integer.valueOf("VIDEOPLAYHISTORY_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return x.fnj;
      }
    });
    eaA.put(Integer.valueOf("SIGHTDRAFTSINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return l.fnj;
      }
    });
    AppMethodBeat.o(50778);
  }

  public o()
  {
    AppMethodBeat.i(50763);
    this.fWE = new v();
    this.fWH = null;
    this.fWI = null;
    this.fWJ = null;
    this.fWK = null;
    this.fWN = null;
    this.fWO = null;
    this.fWP = new p();
    AppMethodBeat.o(50763);
  }

  public static o alk()
  {
    AppMethodBeat.i(50764);
    o localo = (o)q.Y(o.class);
    AppMethodBeat.o(50764);
    return localo;
  }

  public static t all()
  {
    try
    {
      AppMethodBeat.i(50765);
      if (!g.RK())
      {
        com.tencent.mm.model.b localb = new com/tencent/mm/model/b;
        localb.<init>();
        AppMethodBeat.o(50765);
        throw localb;
      }
    }
    finally
    {
    }
    if (alk().fWF == null)
    {
      localObject2 = alk();
      t localt = new com/tencent/mm/modelvideo/t;
      localt.<init>(g.RP().eJN);
      ((o)localObject2).fWF = localt;
    }
    Object localObject2 = alk().fWF;
    AppMethodBeat.o(50765);
    return localObject2;
  }

  public static com.tencent.mm.al.e alm()
  {
    int i = 0;
    AppMethodBeat.i(50766);
    g.RN().QU();
    if (alk().fWN == null)
      alk().fWN = new com.tencent.mm.al.e();
    if (com.tencent.mm.al.f.afy().fyE == null);
    for (int j = 1; ; j = 0)
    {
      if (j != 0)
      {
        com.tencent.mm.al.a locala = com.tencent.mm.al.f.afy();
        locale = alk().fWN;
        locala.fyE = locale;
        int k = locala.hashCode();
        j = i;
        if (locale != null)
          j = locale.hashCode();
        ab.i("MicroMsg.CdnTransportEngine", "set cdn online video callback hash[%d] onlineVideoCallback[%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(j) });
      }
      com.tencent.mm.al.e locale = alk().fWN;
      AppMethodBeat.o(50766);
      return locale;
    }
  }

  public static i aln()
  {
    AppMethodBeat.i(50767);
    g.RN().QU();
    if (alk().fWO == null)
      alk().fWO = new i();
    i locali = alk().fWO;
    AppMethodBeat.o(50767);
    return locali;
  }

  public static x alo()
  {
    AppMethodBeat.i(50768);
    if (!g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(50768);
      throw ((Throwable)localObject);
    }
    if (alk().fWG == null)
      alk().fWG = new x(g.RP().eJN);
    Object localObject = alk().fWG;
    AppMethodBeat.o(50768);
    return localObject;
  }

  public static l alp()
  {
    try
    {
      AppMethodBeat.i(50769);
      if (!g.RK())
      {
        com.tencent.mm.model.b localb = new com/tencent/mm/model/b;
        localb.<init>();
        AppMethodBeat.o(50769);
        throw localb;
      }
    }
    finally
    {
    }
    if (alk().fWI == null)
    {
      localObject2 = alk();
      l locall = new com/tencent/mm/modelvideo/l;
      locall.<init>(g.RP().eJN);
      ((o)localObject2).fWI = locall;
    }
    Object localObject2 = alk().fWI;
    AppMethodBeat.o(50769);
    return localObject2;
  }

  public static y.a alq()
  {
    AppMethodBeat.i(50770);
    if (!g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(50770);
      throw ((Throwable)localObject);
    }
    if (alk().fWH == null)
      alk().fWH = new y.a();
    Object localObject = alk().fWH;
    AppMethodBeat.o(50770);
    return localObject;
  }

  public static m alr()
  {
    AppMethodBeat.i(50771);
    if (!g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(50771);
      throw ((Throwable)localObject);
    }
    if (alk().fWK == null)
      alk().fWK = new m();
    Object localObject = alk().fWK;
    AppMethodBeat.o(50771);
    return localObject;
  }

  private static void als()
  {
    boolean bool1 = false;
    AppMethodBeat.i(50772);
    if ((fWM != null) && (fWL != null))
    {
      AppMethodBeat.o(50772);
      return;
    }
    boolean bool2;
    if (fWM != null)
    {
      bool2 = true;
      label33: if (fWL != null)
        bool1 = true;
      ab.w("MicroMsg.SubCoreVideo", "check decoder thread available fail, handler[%B] thread[%B] stack[%s]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), bo.dpG() });
      if (fWM != null)
        fWM.removeCallbacksAndMessages(null);
      if (fWL == null)
        break label131;
      fWL.a(null);
    }
    while (true)
    {
      fWM = new ak(fWL.oAl.getLooper());
      AppMethodBeat.o(50772);
      break;
      bool2 = false;
      break label33;
      label131: fWL = new al("Short-Video-Decoder-Thread-" + System.currentTimeMillis());
    }
  }

  public static String getAccVideoPath()
  {
    AppMethodBeat.i(50777);
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = g.RP().eJM + "video/";
    AppMethodBeat.o(50777);
    return localObject;
  }

  public static boolean i(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(50773);
    boolean bool;
    if (paramRunnable == null)
    {
      bool = false;
      AppMethodBeat.o(50773);
      return bool;
    }
    als();
    if (paramLong > 0L)
      fWM.postDelayed(paramRunnable, paramLong);
    while (true)
    {
      bool = true;
      AppMethodBeat.o(50773);
      break;
      fWM.post(paramRunnable);
    }
  }

  public static boolean y(Runnable paramRunnable)
  {
    boolean bool = true;
    AppMethodBeat.i(50774);
    if (paramRunnable == null)
      AppMethodBeat.o(50774);
    while (true)
    {
      return bool;
      als();
      if (fWM == null)
      {
        ab.e("MicroMsg.SubCoreVideo", "short video decoder handler is null");
        bool = false;
        AppMethodBeat.o(50774);
      }
      else
      {
        fWM.removeCallbacks(paramRunnable);
        AppMethodBeat.o(50774);
      }
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(50776);
    ab.i("MicroMsg.SubCoreVideo", "%d onAccountPostReset ", new Object[] { Integer.valueOf(hashCode()) });
    alq().a(this.fWP);
    e.d.a(Integer.valueOf(43), this.fWE);
    e.d.a(Integer.valueOf(44), this.fWE);
    e.d.a(Integer.valueOf(62), this.fWE);
    if (fWM != null)
      fWM.removeCallbacksAndMessages(null);
    g.RS().aa(new o.4(this));
    File localFile = new File(k.ale());
    if ((!localFile.exists()) || (!localFile.isDirectory()))
      localFile.mkdirs();
    AppMethodBeat.o(50776);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(50775);
    ab.i("MicroMsg.SubCoreVideo", "%d onAccountRelease ", new Object[] { Integer.valueOf(hashCode()) });
    alq().b(this.fWP);
    try
    {
      if (alk().fWH != null)
      {
        localObject = alk().fWH;
        ((y.a)localObject).cqV = 0;
        if (((y.a)localObject).fXN != null)
          g.Rg().c(((y.a)localObject).fXN);
        if (((y.a)localObject).fXO != null)
          g.Rg().c(((y.a)localObject).fXO);
        g.Rg().b(149, (com.tencent.mm.ai.f)localObject);
        g.Rg().b(150, (com.tencent.mm.ai.f)localObject);
        all().a((t.a)localObject);
      }
      if (alk().fWK != null)
      {
        localObject = alk().fWK;
        ((m)localObject).cqV = 0;
        ab.i("MicroMsg.SightMassSendService", "stop, cur cdn client id %s", new Object[] { ((m)localObject).fWi });
        if (!bo.isNullOrNil(((m)localObject).fWi))
          com.tencent.mm.al.f.afx().rN(((m)localObject).fWi);
      }
      if (alk().fWO != null)
      {
        localObject = alk().fWO;
        ((i)localObject).stopDownload();
        ((i)localObject).fVS.clear();
      }
      if (alk().fWN != null)
        alk().fWN.release();
      e.d.b(Integer.valueOf(43), this.fWE);
      e.d.b(Integer.valueOf(44), this.fWE);
      e.d.b(Integer.valueOf(62), this.fWE);
      if (fWM != null)
        fWM.removeCallbacksAndMessages(null);
    }
    catch (Exception localException1)
    {
      try
      {
        Object localObject = alq();
        ab.i("MicroMsg.VideoService", "quitVideoSendThread: %s", new Object[] { ((y.a)localObject).fXH });
        HandlerThread localHandlerThread = ((y.a)localObject).fXH;
        if (localHandlerThread != null);
        while (true)
        {
          try
          {
            ((y.a)localObject).fXH.quit();
            ((y.a)localObject).fXJ = false;
            ((y.a)localObject).fXI = null;
            ((y.a)localObject).fXH = null;
            AppMethodBeat.o(50775);
            return;
            localException1 = localException1;
            ab.printErrStackTrace("MicroMsg.SubCoreVideo", localException1, "", new Object[0]);
          }
          catch (Exception localException2)
          {
            ab.e("MicroMsg.VideoService", "quitVideoSendThread error: %s", new Object[] { localException2.getMessage() });
          }
          AppMethodBeat.o(50775);
        }
      }
      catch (Exception localException3)
      {
        while (true)
        {
          ab.e("MicroMsg.SubCoreVideo", "onAccountRelease, quitVideoSendThread error: %s", new Object[] { localException3.getMessage() });
          AppMethodBeat.o(50775);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.o
 * JD-Core Version:    0.6.2
 */