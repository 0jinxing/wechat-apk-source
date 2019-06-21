package com.tencent.mm.modelmulti;

import android.content.Context;
import android.os.PowerManager;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.comm.WakerLock.IAutoUnlockCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.lx;
import com.tencent.mm.g.a.rv;
import com.tencent.mm.g.a.so;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.by;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import junit.framework.Assert;

public final class o
{
  private static Boolean fJf = null;
  private WakerLock ecc;
  public Queue<o.c> fJg;
  public Queue<o.c> fJh;
  private HashMap<o.c, Long> fJi;
  public o.c fJj;
  private long fJk;

  public o()
  {
    AppMethodBeat.i(58414);
    this.fJg = new LinkedList();
    this.fJh = new LinkedList();
    this.fJi = new HashMap();
    this.fJj = null;
    this.fJk = 0L;
    this.ecc = null;
    AppMethodBeat.o(58414);
  }

  private static boolean XF()
  {
    AppMethodBeat.i(58415);
    boolean bool;
    if ((com.tencent.mm.kernel.a.QT()) || (!g.RK()))
    {
      bool = false;
      AppMethodBeat.o(58415);
    }
    while (true)
    {
      return bool;
      if (fJf != null)
      {
        bool = fJf.booleanValue();
        AppMethodBeat.o(58415);
      }
      else
      {
        fJf = Boolean.TRUE;
        bool = true;
        AppMethodBeat.o(58415);
      }
    }
  }

  private void a(o.c paramc)
  {
    AppMethodBeat.i(58423);
    if (k.ahT())
    {
      ab.e("MicroMsg.SyncService", "tryStart dkinit never do sync before init done :%s ", new Object[] { paramc });
      AppMethodBeat.o(58423);
    }
    while (true)
    {
      return;
      g.RS().aa(new o.2(this, paramc));
      AppMethodBeat.o(58423);
    }
  }

  private static boolean ahS()
  {
    AppMethodBeat.i(58424);
    try
    {
      bool = ((Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)ah.getContext().getSystemService("power"), new Object[0])).booleanValue();
      AppMethodBeat.o(58424);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.plugin.report.e.pXa.a(99L, 45L, 1L, false);
        ab.e("MicroMsg.SyncService", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", new Object[] { Boolean.TRUE, bo.l(localException) });
        AppMethodBeat.o(58424);
        boolean bool = true;
      }
    }
  }

  private void ahY()
  {
    try
    {
      AppMethodBeat.i(58422);
      Object localObject1;
      if ((this.ecc == null) || (!this.ecc.isLocking()))
        if (this.ecc == null)
        {
          localObject1 = "null";
          ab.w("MicroMsg.SyncService", "wakeUnlock syncWakerLock locking?:%s foreground:%s", new Object[] { localObject1, Boolean.valueOf(com.tencent.mm.sdk.a.b.foreground) });
          AppMethodBeat.o(58422);
        }
      while (true)
      {
        return;
        localObject1 = Boolean.valueOf(this.ecc.isLocking());
        break;
        this.ecc.unLock();
        AppMethodBeat.o(58422);
      }
    }
    finally
    {
    }
  }

  private static void assertTrue(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(58416);
    if (paramBoolean)
      AppMethodBeat.o(58416);
    while (true)
    {
      return;
      ab.e("MicroMsg.SyncService", "ASSERT now msg:%s", new Object[] { paramString });
      Assert.assertTrue(paramString, paramBoolean);
      AppMethodBeat.o(58416);
    }
  }

  private int h(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(58420);
    o.e locale = new o.e(this, paramInt1, paramInt2, paramBoolean);
    a(locale);
    paramInt1 = locale.hashCode();
    AppMethodBeat.o(58420);
    return paramInt1;
  }

  private void sR(String paramString)
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(58421);
      ab.i("MicroMsg.SyncService", "wakelock tag:%s syncWakerLock:%s [%s]", new Object[] { paramString, this.ecc, bo.dpG() });
      if (this.ecc == null)
      {
        WakerLock localWakerLock = new com/tencent/mars/comm/WakerLock;
        Context localContext = ah.getContext();
        WakerLock.IAutoUnlockCallback local1 = new com/tencent/mm/modelmulti/o$1;
        local1.<init>(this);
        localWakerLock.<init>(localContext, "MicroMsg.SyncService", local1);
        this.ecc = localWakerLock;
      }
      if (!this.ecc.isLocking());
      while (true)
      {
        assertTrue("lock", bool);
        if (!com.tencent.mm.sdk.a.b.foreground)
          this.ecc.lock(30000L, paramString);
        AppMethodBeat.o(58421);
        return;
        bool = false;
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final int a(long paramLong, int paramInt, String paramString)
  {
    AppMethodBeat.i(58417);
    boolean bool = XF();
    ab.i("MicroMsg.SyncService", "dealWithSelectoru checkUse:%s selector:%d aiScene:%d xml:%s ", new Object[] { Boolean.valueOf(bool), Long.valueOf(paramLong), Integer.valueOf(paramInt), paramString });
    int i = 0;
    Object localObject;
    if ((0x100 & paramLong) != 0L)
    {
      localObject = new rv();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    if ((0x200000 & paramLong) != 0L)
    {
      localObject = new lx();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    if ((0x80 & paramLong) != 0L)
    {
      localObject = new so();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    paramLong = 0xFFFFFEFF & paramLong & 0xFFDFFFFF & 0x5F;
    int j = i;
    if (paramLong != 0L)
    {
      j = i;
      if (g.RK())
      {
        g.RQ();
        j = i;
        if (g.RP().Ry() != null)
        {
          ab.i("MicroMsg.SyncService", "ContinueFlag:%s", new Object[] { Long.valueOf(paramLong) });
          g.RQ();
          g.RP().Ry().set(8196, Long.valueOf(paramLong));
          if (bool)
            break label365;
          localObject = new j(paramInt);
          paramInt = localObject.hashCode();
          ab.i("MicroMsg.SyncService", "dealWithSelector syncHash: %d", new Object[] { Integer.valueOf(paramInt) });
          g.RQ();
          j = paramInt;
          if (!g.RO().eJo.a((m)localObject, 0))
            ab.w("MicroMsg.SyncService", "dealWithSelector doScene failed, hash: %d, zero hash will be return.", new Object[] { Integer.valueOf(paramInt) });
        }
      }
    }
    label365: for (j = 0; ; j = h(paramInt, 7, false))
    {
      if (!bo.isNullOrNil(paramString))
      {
        localObject = new ak();
        ((ak)localObject).cto.type = 3;
        ((ak)localObject).cto.ctq = paramString;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      AppMethodBeat.o(58417);
      return j;
    }
  }

  public final void a(t.b paramb, int paramInt, long paramLong)
  {
    AppMethodBeat.i(58418);
    boolean bool = XF();
    ab.i("MicroMsg.SyncService", "triggerNotifyDataSync checkUse:%s resp:%s syncflag:%s recvtime:%s", new Object[] { Boolean.valueOf(bool), paramb, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    if (!bool)
    {
      g.RQ();
      g.RO().eJo.a(new j(paramb, paramInt, paramLong), 0);
      AppMethodBeat.o(58418);
    }
    while (true)
    {
      return;
      a(new o.f(this, paramb, paramInt, paramLong));
      AppMethodBeat.o(58418);
    }
  }

  public final int lN(int paramInt)
  {
    AppMethodBeat.i(58419);
    boolean bool = XF();
    ab.i("MicroMsg.SyncService", "triggerSync checkUse:%s scene:%s [%s]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt), bo.dpG() });
    if (!bool)
    {
      j localj = new j(paramInt);
      g.RQ();
      g.RO().eJo.a(localj, 0);
      paramInt = localj.hashCode();
      AppMethodBeat.o(58419);
    }
    while (true)
    {
      return paramInt;
      paramInt = h(paramInt, 7, false);
      AppMethodBeat.o(58419);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o
 * JD-Core Version:    0.6.2
 */