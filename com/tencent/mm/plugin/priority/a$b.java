package com.tencent.mm.plugin.priority;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.priority.b.a.d;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.protocal.protobuf.gi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.wcdb.database.SQLiteStatement;

final class a$b extends com.tencent.mm.plugin.priority.b.b.a
{
  private bi cKd;

  public a$b(a parama, bi parambi)
  {
    this.cKd = parambi;
  }

  public final String getName()
  {
    return "Priority.onC2CImgOpenTask";
  }

  public final void run()
  {
    AppMethodBeat.i(54876);
    if (this.cKd.field_createTime <= ((PluginPriority)g.M(PluginPriority.class)).getInstallPriorityTime())
    {
      ab.i("MicroMsg.Priority.PriorityService", "onC2CImgOpen time condition not support %s", new Object[] { h.formatTime("yyyy-MM-dd HH:mm:ss", this.cKd.field_createTime / 1000L) });
      AppMethodBeat.o(54876);
    }
    bi localbi;
    gi localgi;
    while (true)
    {
      return;
      if (((PluginPriority)g.M(PluginPriority.class)).getC2CMsgAutoDownloadResLogic() == null)
        break label377;
      ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgAutoDownloadResLogic();
      localbi = this.cKd;
      e.pXa.a(957L, 10L, 1L, false);
      localgi = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().jw(localbi.field_msgId);
      if (localgi == null)
      {
        ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResLogic", "This Image Sender is Me");
        e.pXa.a(957L, 13L, 1L, false);
        AppMethodBeat.o(54876);
      }
      else
      {
        if (localgi.vIA <= 0L)
          break;
        ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResLogic", "onImgOpen img already use %d", new Object[] { Long.valueOf(localbi.field_msgId) });
        AppMethodBeat.o(54876);
      }
    }
    if (t.kH(localbi.field_talker))
      ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().fB(localgi.ptA, "@all");
    ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().fB(localgi.ptA, localgi.vIt);
    localgi.vIA = System.currentTimeMillis();
    com.tencent.mm.plugin.priority.b.a.c localc = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage();
    long l1 = localbi.field_msgId;
    long l2 = localgi.vIA;
    localc.pgF.bindLong(1, l2);
    localc.pgF.bindLong(2, l1);
    ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResStorage", "updateOpenTime %d res %d %d", new Object[] { Integer.valueOf(localc.pgF.executeUpdateDelete()), Long.valueOf(l1), Long.valueOf(l2) });
    int i;
    if (localgi.jBT == 3)
    {
      i = 1;
      e.pXa.a(957L, 14L, 1L, false);
    }
    while (true)
    {
      com.tencent.mm.plugin.priority.b.c.a(2, localgi.vIA, i, localgi);
      label377: AppMethodBeat.o(54876);
      break;
      if (localgi.jBT == 2)
      {
        i = 3;
        e.pXa.a(957L, 16L, 1L, false);
      }
      else if (localgi.jBT == 4)
      {
        i = 4;
        e.pXa.a(957L, 17L, 1L, false);
      }
      else if (localgi.jBT == 5)
      {
        i = 5;
        e.pXa.a(957L, 18L, 1L, false);
      }
      else
      {
        i = 2;
        e.pXa.a(957L, 15L, 1L, false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.a.b
 * JD-Core Version:    0.6.2
 */