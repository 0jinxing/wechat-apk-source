package com.tencent.mm.plugin.priority;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.priority.b.a.c;
import com.tencent.mm.plugin.priority.b.a.d;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class a$c extends com.tencent.mm.plugin.priority.b.b.a
{
  private bi cKd;

  public a$c(a parama, bi parambi)
  {
    this.cKd = parambi;
  }

  public final String getName()
  {
    return "Priority.onC2CImgReceiveTask";
  }

  public final void run()
  {
    AppMethodBeat.i(54877);
    if (this.cKd.field_createTime <= ((PluginPriority)g.M(PluginPriority.class)).getInstallPriorityTime())
    {
      ab.i("MicroMsg.Priority.PriorityService", "onC2CImgReceive time condition not support %s", new Object[] { h.formatTime("yyyy-MM-dd HH:mm:ss", this.cKd.field_createTime / 1000L) });
      AppMethodBeat.o(54877);
    }
    while (true)
    {
      return;
      if (!((PluginPriority)g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().jv(this.cKd.field_msgId))
        break;
      ab.i("MicroMsg.Priority.PriorityService", "already exist msg %d", new Object[] { Long.valueOf(this.cKd.field_msgId) });
      AppMethodBeat.o(54877);
    }
    int i = 1;
    Object localObject1;
    label158: double d2;
    int j;
    Object localObject2;
    int k;
    int m;
    if (t.kH(this.cKd.field_talker))
    {
      localObject1 = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().fC(this.cKd.field_talker, "@all");
      double d1 = a.d((double[])localObject1);
      d2 = d1;
      j = i;
      if (t.kH(this.cKd.field_talker))
      {
        localObject2 = bo.bc(bf.oy(this.cKd.field_content), "");
        d2 = d1;
        j = i;
        if (!bo.isNullOrNil((String)localObject2))
        {
          localObject2 = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().fC(this.cKd.field_talker, (String)localObject2);
          k = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHI, 101);
          d2 = d1;
          j = i;
          if (a.d((double[])localObject2) > d1)
          {
            d2 = d1;
            j = i;
            if (a.d((double[])localObject2) > k)
            {
              d2 = a.d((double[])localObject2);
              j = 2;
            }
          }
        }
      }
      m = 1;
      i = 0;
      localObject2 = bf.oE(this.cKd.dqJ);
      if (localObject2 != null)
        break label598;
      k = 0;
      label327: if (k == 0)
      {
        i = 4;
        m = 0;
      }
      k = i;
      int n = m;
      if (!com.tencent.mm.plugin.priority.a.a.a.a.bZw())
      {
        k = i | 0x2;
        n = 0;
      }
      m = k;
      i = n;
      if (!com.tencent.mm.plugin.priority.a.a.a.a.bZx())
      {
        m = k | 0x10;
        i = 0;
      }
      k = m;
      if (!com.tencent.mm.plugin.priority.a.a.a.a.UE(this.cKd.field_talker))
        break label1024;
      m |= 8;
      k = m;
      if (!com.tencent.mm.plugin.priority.a.a.a.bZu())
        break label1024;
      k = 0;
    }
    for (i = m; ; i = m)
    {
      if (com.tencent.mm.plugin.priority.a.a.a.bhI())
        if (d2 >= ((PluginPriority)g.M(PluginPriority.class)).getBorderPriority())
        {
          if (k != 0)
          {
            k = i;
            if (a.d((double[])localObject1) < ((PluginPriority)g.M(PluginPriority.class)).getBorderPriority())
              k = i | 0x100;
            i = k | 0x1;
            ab.i("MicroMsg.Priority.PriorityService", "C2CImgReceiveTask Click Rate %.2f %d Start To Auto Download %d MsgId %d", new Object[] { Double.valueOf(d2), Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(this.cKd.field_msgId) });
            a.a(this.cKd, i, 1, d2, j);
            ((PluginPriority)g.M(PluginPriority.class)).getC2CImgAutoDownloader().start();
            AppMethodBeat.o(54877);
            break;
            localObject1 = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().fC(this.cKd.field_talker, this.cKd.field_talker);
            break label158;
            label598: localObject2 = ((bf.b)localObject2).fmD;
            if ((!bo.isNullOrNil((String)localObject2)) && (com.tencent.mm.modelcontrol.b.rR((String)localObject2)))
            {
              k = 0;
              break label327;
            }
            k = 1;
            break label327;
          }
          ab.i("MicroMsg.Priority.PriorityService", "C2CImgReceiveTask Click Rate %.2f %d Not To Auto Download %d MsgId %d", new Object[] { Double.valueOf(d2), Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(this.cKd.field_msgId) });
        }
      while (true)
      {
        label680: a.a(this.cKd, i, 1, d2, j);
        do
        {
          AppMethodBeat.o(54877);
          break;
          if ((k != 0) && (!t.kH(this.cKd.field_talker)))
          {
            d locald = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage();
            String str = this.cKd.field_talker;
            localObject1 = this.cKd.field_talker;
            long l = d.bZB();
            localObject2 = String.format("SELECT dayreceivecount FROM %s WHERE chat = ? AND talker = ? AND date = ?", new Object[] { "C2CMsgImgUsage" });
            k = 0;
            localObject1 = locald.pga.rawQuery((String)localObject2, new String[] { str, localObject1, String.valueOf(l) });
            if (((Cursor)localObject1).moveToNext())
              k = ((Cursor)localObject1).getInt(0);
            ((Cursor)localObject1).close();
            if (k < 2)
            {
              i |= 128;
              ab.i("MicroMsg.Priority.PriorityService", "C2CImgReceiveTask Click Rate %.2f %d Start To Auto Download %d MsgId %d receiveCount %d", new Object[] { Double.valueOf(d2), Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(this.cKd.field_msgId), Integer.valueOf(k) });
              a.a(this.cKd, i, 1, d2, j);
              ((PluginPriority)g.M(PluginPriority.class)).getC2CImgAutoDownloader().start();
              AppMethodBeat.o(54877);
              break;
            }
          }
          ab.i("MicroMsg.Priority.PriorityService", "C2CImgReceiveTask Click Rate %.2f %d Not To Auto Download %d MsgId %d", new Object[] { Double.valueOf(d2), Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(this.cKd.field_msgId) });
          i |= 64;
          break label680;
        }
        while (!com.tencent.mm.plugin.priority.a.a.a.bZu());
        if (k != 0)
        {
          a.a(this.cKd, i | 0x1, 2, d2, j);
          AppMethodBeat.o(54877);
          break;
        }
      }
      label1024: m = k;
      k = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.a.c
 * JD-Core Version:    0.6.2
 */