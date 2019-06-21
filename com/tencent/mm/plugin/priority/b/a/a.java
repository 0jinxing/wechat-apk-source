package com.tencent.mm.plugin.priority.b.a;

import android.net.TrafficStats;
import android.os.Process;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.d.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.priority.PluginPriority;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Calendar;

public final class a
  implements d.a, com.tencent.mm.plugin.priority.a.a.a.b
{
  public com.tencent.mm.sdk.b.c fDh;
  public long pgt;
  int pgu;
  int pgv;
  boolean pgw;
  long pgx;
  long pgy;
  String talker;
  int uid;

  public a()
  {
    AppMethodBeat.i(54907);
    this.pgt = 0L;
    this.pgu = 0;
    this.pgv = 0;
    this.talker = "";
    this.pgw = false;
    this.pgx = 0L;
    this.pgy = 0L;
    this.fDh = new a.1(this);
    this.uid = Process.myUid();
    if (com.tencent.mm.plugin.priority.a.a.a.bhI())
      this.fDh.dnU();
    this.pgu = 2130838182;
    AppMethodBeat.o(54907);
  }

  public static boolean bZz()
  {
    boolean bool = false;
    AppMethodBeat.i(54912);
    if (!at.isWifi(ah.getContext()))
      AppMethodBeat.o(54912);
    while (true)
    {
      return bool;
      Calendar localCalendar = Calendar.getInstance();
      int i = localCalendar.get(11);
      int j = localCalendar.get(12);
      if (i == 1)
      {
        com.tencent.mm.kernel.g.RN();
        if (j >= Math.abs(com.tencent.mm.kernel.a.QF()) % 30)
        {
          AppMethodBeat.o(54912);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(54912);
        }
      }
      else if ((i >= 2) && (i <= 6))
      {
        AppMethodBeat.o(54912);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(54912);
      }
    }
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(54911);
    ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "onImgTaskCanceled %d", new Object[] { Long.valueOf(paramLong2) });
    this.pgt = 0L;
    ((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).b(paramLong2, false, true);
    com.tencent.mm.plugin.report.e.pXa.a(957L, 57L, 1L, false);
    AppMethodBeat.o(54911);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, m paramm)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, m paramm)
  {
    AppMethodBeat.i(54910);
    if ((paramInt3 != 0) || (paramInt4 != 0))
    {
      ab.e("MicroMsg.Priority.C2CImgAutoDownloader", "img " + paramLong1 + "msgLocalId " + paramLong2 + " download failed");
      ((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).b(paramLong2, false, false);
      com.tencent.mm.plugin.report.e.pXa.a(957L, 53L, 1L, false);
    }
    while (true)
    {
      this.pgt = 0L;
      ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "normal download mode check network stat");
      this.pgw = true;
      this.pgx = TrafficStats.getUidRxBytes(this.uid);
      this.pgy = TrafficStats.getUidTxBytes(this.uid);
      ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getPriorityTaskRunner().b(new a.b(this, (byte)0));
      AppMethodBeat.o(54910);
      return;
      b(paramLong1, paramLong2, true);
      ((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).b(paramLong2, true, false);
      com.tencent.mm.plugin.report.e.pXa.a(957L, 54L, 1L, false);
    }
  }

  public final void b(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(54909);
    if (paramBoolean)
      if (at.isWifi(ah.getContext()))
      {
        ab.v("MicroMsg.Priority.C2CImgAutoDownloader", "is wifi pass count");
        AppMethodBeat.o(54909);
      }
    while (true)
    {
      return;
      long l1 = bo.a((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJY, null), 0L);
      long l2 = bo.anl((String)DateFormat.format("M", System.currentTimeMillis()));
      ab.d("MicroMsg.Priority.C2CImgAutoDownloader", "img " + paramLong1 + " msgLocalId: " + paramLong2 + " has been downloaded current %d month %d", new Object[] { Long.valueOf(1L + l1), Long.valueOf(l2) });
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJY, Long.valueOf(l1 + 1L));
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJZ, Long.valueOf(l2));
      AppMethodBeat.o(54909);
      continue;
      ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "imglocalId " + paramLong1 + " msglocalid " + paramLong2 + " false");
      AppMethodBeat.o(54909);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(54908);
    if (this.pgt != 0L)
    {
      com.tencent.mm.at.e locale = o.ahl().fJ(this.pgt);
      if (o.ahm().a(locale.fDy, this.pgt, locale.fDC))
      {
        ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "Downloading %d", new Object[] { Long.valueOf(this.pgt) });
        AppMethodBeat.o(54908);
        return;
      }
      this.pgt = 0L;
      if (locale.dJA != 1)
        break label162;
      ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "Not In DownloadImgService Queue, Already Downloaded, Force Cancel curMsgId %d", new Object[] { Long.valueOf(this.pgt) });
      ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().z(this.pgt, 5);
    }
    while (true)
    {
      ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getPriorityTaskRunner().a(new a.a(this, (byte)0));
      AppMethodBeat.o(54908);
      break;
      label162: ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "Not In DownloadImgService Queue, Not Downloaded, Force Cancel curMsgId %d", new Object[] { Long.valueOf(this.pgt) });
      ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().z(this.pgt, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.a.a
 * JD-Core Version:    0.6.2
 */