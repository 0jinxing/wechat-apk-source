package com.tencent.mm.at;

import android.net.TrafficStats;
import android.os.Looper;
import android.os.Process;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Stack;

public final class b
  implements d.a
{
  private b.a fCU;
  public Stack<Long> fCV;
  long fCW;
  public int fCX;
  boolean fCY;
  public long fCZ;
  int fDa;
  boolean fDb;
  long fDc;
  long fDd;
  int fDe;
  int fDf;
  ap fDg;
  com.tencent.mm.sdk.b.c fDh;
  com.tencent.mm.sdk.b.c fDi;

  public b(Looper paramLooper)
  {
    AppMethodBeat.i(78159);
    this.fCW = 0L;
    this.fCX = 0;
    this.fCY = false;
    this.fCZ = 0L;
    this.fDa = 0;
    this.fDb = false;
    this.fDc = 0L;
    this.fDd = 0L;
    this.fDg = new ap(new b.1(this), false);
    this.fDh = new b.2(this);
    this.fDi = new b.3(this);
    this.fCU = new b.a(this, paramLooper);
    this.fCV = new Stack();
    this.fDe = Process.myUid();
    paramLooper = (Integer)g.RP().Ry().get(327681, null);
    if ((paramLooper == null) || (3 == paramLooper.intValue()));
    for (int i = 1; ; i = paramLooper.intValue())
    {
      this.fDf = i;
      a.xxA.c(this.fDh);
      a.xxA.c(this.fDi);
      AppMethodBeat.o(78159);
      return;
    }
  }

  public static void a(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(78162);
    if (paramBoolean)
      if (at.isWifi(ah.getContext()))
      {
        ab.v("MicroMsg.AutoGetBigImgLogic", "is wifi pass count");
        AppMethodBeat.o(78162);
      }
    while (true)
    {
      return;
      long l1 = bo.a((Long)g.RP().Ry().get(ac.a.xJY, null), 0L);
      long l2 = bo.anl((String)DateFormat.format("M", System.currentTimeMillis()));
      ab.d("MicroMsg.AutoGetBigImgLogic", "img " + paramLong1 + " msgLocalId: " + paramLong2 + " has been downloaded current %d month %d", new Object[] { Long.valueOf(1L + l1), Long.valueOf(l2) });
      g.RP().Ry().set(ac.a.xJY, Long.valueOf(l1 + 1L));
      g.RP().Ry().set(ac.a.xJZ, Long.valueOf(l2));
      AppMethodBeat.o(78162);
      continue;
      ab.i("MicroMsg.AutoGetBigImgLogic", "imglocalId " + paramLong1 + " msglocalid " + paramLong2 + " false");
      AppMethodBeat.o(78162);
    }
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(78164);
    ab.i("MicroMsg.AutoGetBigImgLogic", "img " + paramLong1 + " has been canceled");
    ((com.tencent.mm.plugin.comm.a.b)g.K(com.tencent.mm.plugin.comm.a.b.class)).b(paramLong2, false, true);
    AppMethodBeat.o(78164);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, m paramm)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String arg10, m paramm)
  {
    AppMethodBeat.i(78163);
    if ((paramInt3 != 0) || (paramInt4 != 0))
    {
      ab.e("MicroMsg.AutoGetBigImgLogic", "img " + paramLong1 + "msgLocalId " + paramLong2 + " download failed");
      ((com.tencent.mm.plugin.comm.a.b)g.K(com.tencent.mm.plugin.comm.a.b.class)).b(paramLong2, false, false);
      this.fCW = 0L;
      com.tencent.mm.modelcontrol.c.afC();
      if (com.tencent.mm.modelcontrol.c.afD())
        break label157;
      ab.i("MicroMsg.AutoGetBigImgLogic", "don't allow auto download, clear task list");
    }
    while (true)
    {
      synchronized (this.fCV)
      {
        this.fCV.clear();
        AppMethodBeat.o(78163);
        return;
        a(paramLong1, paramLong2, true);
        ((com.tencent.mm.plugin.comm.a.b)g.K(com.tencent.mm.plugin.comm.a.b.class)).b(paramLong2, true, false);
      }
      label157: this.fDc = TrafficStats.getUidRxBytes(this.fDe);
      this.fDd = TrafficStats.getUidTxBytes(this.fDe);
      this.fDg.ae(1000L, 1000L);
      AppMethodBeat.o(78163);
    }
  }

  public final void cE(boolean paramBoolean)
  {
    AppMethodBeat.i(78161);
    ab.d("MicroMsg.AutoGetBigImgLogic", "is foreground: ".concat(String.valueOf(paramBoolean)));
    this.fCY = paramBoolean;
    this.fCZ = System.currentTimeMillis();
    AppMethodBeat.o(78161);
  }

  public final void start()
  {
    AppMethodBeat.i(78160);
    this.fCU.sendEmptyMessage(1);
    AppMethodBeat.o(78160);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.b
 * JD-Core Version:    0.6.2
 */