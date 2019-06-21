package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.plugin.backup.b.b.c;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.i.o;
import com.tencent.mm.plugin.backup.i.y;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.l;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class d
  implements com.tencent.mm.plugin.backup.b.b.d
{
  private static boolean jtr = false;
  private static boolean jwl = false;
  private boolean eVT;
  private long jrb;
  private boolean jsA;
  private com.tencent.mm.plugin.backup.c.d jti;
  LinkedList<String> jtj;
  LinkedList<Long> jtk;
  private HashSet<String> jto;
  private long jtp;
  private long jtq;
  public Set<b.c> jwm;
  public b.a jwn;
  private long jwo;
  private boolean jwp;
  private final com.tencent.mm.plugin.backup.g.b.d jwq;
  private Object lock;
  private long recvSize;

  public d()
  {
    AppMethodBeat.i(17525);
    this.jrb = 0L;
    this.recvSize = 0L;
    this.lock = new Object();
    this.eVT = false;
    this.jwm = new HashSet();
    this.jto = new HashSet();
    this.jtp = 0L;
    this.jtq = 0L;
    this.jwo = 0L;
    this.jsA = false;
    this.jwp = false;
    this.jwq = new d.1(this);
    AppMethodBeat.o(17525);
  }

  private static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(17531);
    y localy = new y();
    localy.jCx = paramString;
    localy.jCy = paramInt1;
    localy.jCA = paramInt2;
    localy.jCB = paramInt3;
    localy.jBT = paramInt4;
    try
    {
      com.tencent.mm.plugin.backup.g.b.r(localy.toByteArray(), 7, paramInt5);
      AppMethodBeat.o(17531);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupPcRecoverServer", paramString, "sendResp", new Object[0]);
        AppMethodBeat.o(17531);
      }
    }
  }

  public static void aTM()
  {
    jwl = true;
  }

  public static boolean aTe()
  {
    AppMethodBeat.i(17527);
    boolean bool = aw.ZK().Yr().drz();
    AppMethodBeat.o(17527);
    return bool;
  }

  private static void d(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(17532);
    o localo = new o();
    localo.ID = b.aTD().jqO;
    localo.jBT = paramInt1;
    localo.jBO = g.gw(paramLong);
    try
    {
      ab.i("MicroMsg.BackupPcRecoverServer", "send start resp, status[%d]", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.plugin.backup.g.b.r(localo.toByteArray(), 4, paramInt2);
      AppMethodBeat.o(17532);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupPcRecoverServer", localException, "buf to BackupStartRequest err.", new Object[0]);
        AppMethodBeat.o(17532);
      }
    }
  }

  public final void aSL()
  {
    AppMethodBeat.i(17533);
    synchronized (this.lock)
    {
      if ((this.jti != null) && (this.jti.jsp))
      {
        ab.e("MicroMsg.BackupPcRecoverServer", "startMerge hasStartMerge, return.");
        AppMethodBeat.o(17533);
      }
      while (true)
      {
        return;
        if (this.jti != null)
          this.jti.l(false, 0);
        if ((this.jto != null) && (this.jto.size() > 0))
          break;
        i = aw.ZK().Yr().drA();
        b.aTD().aSu().O(26, 1, i);
        rj(26);
        if (this.jtj == null)
        {
          localObject2 = new java/util/LinkedList;
          ((LinkedList)localObject2).<init>();
          this.jtj = ((LinkedList)localObject2);
        }
        if (this.jtk == null)
        {
          localObject2 = new java/util/LinkedList;
          ((LinkedList)localObject2).<init>();
          this.jtk = ((LinkedList)localObject2);
        }
        this.jtq = bo.anU();
        Object localObject2 = new com/tencent/mm/plugin/backup/c/d;
        ((com.tencent.mm.plugin.backup.c.d)localObject2).<init>(b.aTD(), 1, this, i, this.jsA, this.jtj, this.jtk);
        this.jti = ((com.tencent.mm.plugin.backup.c.d)localObject2);
        this.jti.aSL();
        h.pYm.a(400L, 24L, 1L, false);
        AppMethodBeat.o(17533);
      }
      int i = this.jto.size();
    }
  }

  public final void aSt()
  {
    AppMethodBeat.i(17535);
    aTf();
    h.pYm.a(400L, 27L, 1L, false);
    h.pYm.a(400L, 28L, bo.gb(this.jtq) / 1000L, false);
    com.tencent.mm.plugin.backup.g.b.rx(12);
    com.tencent.mm.plugin.backup.g.b.aTV();
    com.tencent.mm.plugin.backup.g.b.aTX();
    AppMethodBeat.o(17535);
  }

  public final void aTf()
  {
    AppMethodBeat.i(17528);
    ab.i("MicroMsg.BackupPcRecoverServer", "clearContinueRecoverData");
    this.jto.clear();
    AppMethodBeat.o(17528);
  }

  public final void c(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(17529);
    ab.i("MicroMsg.BackupPcRecoverServer", "cancel isSelf[%b], needClearContinueRecoverData[%b], caller:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), an.doQ() });
    jwl = true;
    if (!paramBoolean1)
    {
      b.aTD().aTE();
      c.aTj();
    }
    synchronized (this.lock)
    {
      this.eVT = true;
      if ((this.jti != null) && (this.jti.jsp))
      {
        this.jti.l(paramBoolean2, paramInt);
        this.jti = null;
        if ((i != 0) && (paramInt != 0))
        {
          b.aTD().aSu().jqW = paramInt;
          rj(paramInt);
        }
        if (paramBoolean2)
          aTf();
        com.tencent.mm.plugin.backup.g.b.aTV();
        com.tencent.mm.plugin.backup.g.b.aTX();
        com.tencent.mm.plugin.backup.g.b.aUa();
        AppMethodBeat.o(17529);
        return;
      }
      i = 1;
    }
  }

  public final void init()
  {
    AppMethodBeat.i(17526);
    ab.i("MicroMsg.BackupPcRecoverServer", "init");
    this.jwp = false;
    jwl = false;
    jtr = false;
    com.tencent.mm.plugin.backup.g.b.a(this.jwq);
    this.jrb = 0L;
    this.recvSize = 0L;
    this.eVT = false;
    this.jsA = false;
    this.jto.clear();
    AppMethodBeat.o(17526);
  }

  public final void rj(int paramInt)
  {
    AppMethodBeat.i(17534);
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.jwm);
    al.d(new d.3(this, localHashSet, paramInt));
    if (this.jwn != null)
      al.d(new d.4(this, paramInt));
    AppMethodBeat.o(17534);
  }

  public final void rt(int paramInt)
  {
    AppMethodBeat.i(17530);
    long l = 0L;
    if (this.jtp != 0L)
      l = bo.gb(this.jtp);
    h.pYm.e(13737, new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.jrb / 1024L), Long.valueOf(l / 1000L), Integer.valueOf(2), Integer.valueOf(b.aTD().aTE().jwg) });
    ab.i("MicroMsg.BackupPcRecoverServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], recoverCostTime[%d s]", new Object[] { Integer.valueOf(13737), Integer.valueOf(paramInt), Long.valueOf(this.jrb / 1024L), Long.valueOf(l / 1000L) });
    AppMethodBeat.o(17530);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.d
 * JD-Core Version:    0.6.2
 */