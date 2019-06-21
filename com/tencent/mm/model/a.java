package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public byte[] fka;
  public long fkb;

  public a()
  {
    AppMethodBeat.i(58084);
    this.fkb = -1L;
    if (XF())
      al.n(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(58083);
          try
          {
            if (a.XF())
              com.tencent.mm.plugin.report.e.pXa.a(226L, 1L, 1L, false);
            AppMethodBeat.o(58083);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.AccInfoCacheInWorker", "init Exception:%s", new Object[] { bo.l(localException) });
              AppMethodBeat.o(58083);
            }
          }
        }
      }
      , 5000L);
    AppMethodBeat.o(58084);
  }

  public static boolean XF()
  {
    AppMethodBeat.i(58085);
    boolean bool;
    if ((com.tencent.mm.kernel.a.QT()) || (!g.RK()))
    {
      AppMethodBeat.o(58085);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("AndroidUseWorkerAuthCache"), 0);
      g.RQ();
      g.RN();
      int j = i.bL(com.tencent.mm.kernel.a.QF(), 100);
      bool = com.tencent.mm.sdk.a.b.dnO();
      g.RQ();
      g.RN();
      ab.i("MicroMsg.AccInfoCacheInWorker", "checkUse debug:%s dyVal:%s uin:%d  uinHash:%d init:%b", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(com.tencent.mm.kernel.a.QF()), Integer.valueOf(j), Boolean.valueOf(g.RN().QY()) });
      if (bool)
      {
        AppMethodBeat.o(58085);
        bool = true;
      }
      else if (i > j)
      {
        AppMethodBeat.o(58085);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(58085);
        bool = false;
      }
    }
  }

  public static void XG()
  {
    AppMethodBeat.i(58086);
    if (!XF())
      AppMethodBeat.o(58086);
    long l1;
    while (true)
    {
      return;
      try
      {
        g.RQ();
        a locala = g.RN().eIQ;
        g.RQ();
        localObject = g.RO().eJo.ftA.adg();
        l1 = bo.anU();
        if (localObject != null)
          break label111;
        ab.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker  accinfo == null");
        com.tencent.mm.plugin.report.e.pXa.a(226L, 2L, 1L, false);
        AppMethodBeat.o(58086);
      }
      catch (Throwable localThrowable)
      {
        ab.e("MicroMsg.AccInfoCacheInWorker", "tryBackupToWorker Exception:%s", new Object[] { bo.l(localThrowable) });
        AppMethodBeat.o(58086);
      }
      continue;
      label111: ab.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker islogin:%b cache:%s", new Object[] { Boolean.valueOf(((c)localObject).adb()), Integer.valueOf(localThrowable.XE()) });
      if (((c)localObject).adb())
        break;
      com.tencent.mm.plugin.report.e.pXa.a(226L, 3L, 1L, false);
      ab.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker ERR: Is Not Login");
      AppMethodBeat.o(58086);
    }
    localThrowable.fka = ((c)localObject).adf();
    Object localObject = com.tencent.mm.plugin.report.e.pXa;
    if (localThrowable.XE() > 0)
    {
      l2 = 4L;
      label208: ((com.tencent.mm.plugin.report.e)localObject).a(226L, l2, 1L, false);
      ab.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker time:%s cache:%s useCacheCount:%s ", new Object[] { Long.valueOf(bo.gb(l1)), Integer.valueOf(localThrowable.XE()), Long.valueOf(localThrowable.fkb) });
      if (localThrowable.XE() > 0)
      {
        localObject = com.tencent.mm.plugin.report.e.pXa;
        if (localThrowable.fkb <= 5L)
          break label357;
      }
    }
    label357: for (long l2 = 5L; ; l2 = localThrowable.fkb)
    {
      ((com.tencent.mm.plugin.report.e)localObject).a(226L, 31L - l2, 1L, false);
      com.tencent.mm.plugin.report.e.pXa.e(11098, new Object[] { Integer.valueOf(2000), Long.valueOf(localThrowable.fkb) });
      localThrowable.fkb = -1L;
      AppMethodBeat.o(58086);
      break;
      l2 = 5L;
      break label208;
    }
  }

  public final int XE()
  {
    if (this.fka == null);
    for (int i = -1; ; i = this.fka.length)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.a
 * JD-Core Version:    0.6.2
 */