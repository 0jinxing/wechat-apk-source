package com.tencent.mm.plugin.priority;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.gi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.database.SQLiteStatement;

final class a$a extends com.tencent.mm.plugin.priority.b.b.a
{
  private long cvx;
  private boolean cxT;
  private boolean eVT;

  public a$a(a parama, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.cvx = paramLong;
    this.cxT = paramBoolean1;
    this.eVT = paramBoolean2;
  }

  public final String getName()
  {
    return "Priority.onC2CImgDownloadedTask";
  }

  public final void run()
  {
    AppMethodBeat.i(54875);
    Object localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.cvx);
    if (((cy)localObject).field_createTime <= ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getInstallPriorityTime())
    {
      ab.i("MicroMsg.Priority.PriorityService", "onC2CImgDownloaded time condition not support %s", new Object[] { com.tencent.mm.pluginsdk.f.h.formatTime("yyyy-MM-dd HH:mm:ss", ((cy)localObject).field_createTime / 1000L) });
      AppMethodBeat.o(54875);
    }
    boolean bool2;
    while (true)
    {
      return;
      if (((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResLogic() == null)
        break label800;
      ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResLogic();
      boolean bool1 = this.cxT;
      bool2 = this.eVT;
      if (!bool1)
        break;
      gi localgi = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().jw(((cy)localObject).field_msgId);
      if (localgi == null)
      {
        ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResLogic", "sender img %d", new Object[] { Long.valueOf(((cy)localObject).field_msgId) });
        AppMethodBeat.o(54875);
      }
      else if (localgi.jBT == 3)
      {
        ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResLogic", "already auto download msgid %d", new Object[] { Long.valueOf(((cy)localObject).field_msgId) });
        AppMethodBeat.o(54875);
      }
      else
      {
        com.tencent.mm.plugin.report.e.pXa.a(957L, 20L, 1L, false);
        if (localgi != null)
        {
          long l1 = System.currentTimeMillis();
          localObject = o.ahl().fI(localgi.vIy);
          localgi.vIz = ((com.tencent.mm.at.e)localObject).frO;
          com.tencent.mm.plugin.priority.b.c.a(1, l1, 0, localgi);
          com.tencent.mm.plugin.priority.b.a.c localc = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage();
          long l2 = localgi.vIs;
          int i = ((com.tencent.mm.at.e)localObject).frO;
          localc.pgE.bindLong(1, l1);
          localc.pgE.bindLong(2, 3L);
          localc.pgE.bindLong(3, i);
          localc.pgE.bindLong(4, l2);
          ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResStorage", "updateStatusAndDownloadTime %d res %d %d %d", new Object[] { Integer.valueOf(localc.pgE.executeUpdateDelete()), Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(3) });
          if (com.tencent.mm.plugin.priority.a.a.a.eW(localgi.vIw, 1))
          {
            com.tencent.mm.plugin.report.e.pXa.a(957L, 21L, 1L, false);
            com.tencent.mm.plugin.report.e.pXa.a(957L, 22L, ((com.tencent.mm.at.e)localObject).frO, false);
          }
          if (com.tencent.mm.plugin.priority.a.a.a.eW(localgi.vIw, 8))
          {
            com.tencent.mm.plugin.report.e.pXa.a(957L, 23L, 1L, false);
            com.tencent.mm.plugin.report.e.pXa.a(957L, 24L, ((com.tencent.mm.at.e)localObject).frO, false);
          }
          if ((com.tencent.mm.plugin.priority.a.a.a.eW(localgi.vIw, 2)) || (com.tencent.mm.plugin.priority.a.a.a.eW(localgi.vIw, 4)))
          {
            com.tencent.mm.plugin.report.e.pXa.a(957L, 25L, 1L, false);
            com.tencent.mm.plugin.report.e.pXa.a(957L, 26L, ((com.tencent.mm.at.e)localObject).frO, false);
          }
          if (com.tencent.mm.plugin.priority.a.a.a.eW(localgi.vIw, 16))
          {
            com.tencent.mm.plugin.report.e.pXa.a(957L, 27L, 1L, false);
            com.tencent.mm.plugin.report.e.pXa.a(957L, 28L, ((com.tencent.mm.at.e)localObject).frO, false);
          }
          if (com.tencent.mm.plugin.priority.a.a.a.eW(localgi.vIw, 32))
          {
            com.tencent.mm.plugin.report.e.pXa.a(957L, 29L, 1L, false);
            com.tencent.mm.plugin.report.e.pXa.a(957L, 30L, ((com.tencent.mm.at.e)localObject).frO, false);
          }
          if (com.tencent.mm.plugin.priority.a.a.a.eW(localgi.vIw, 64))
          {
            com.tencent.mm.plugin.report.e.pXa.a(957L, 33L, 1L, false);
            com.tencent.mm.plugin.report.e.pXa.a(957L, 34L, ((com.tencent.mm.at.e)localObject).frO, false);
          }
          if (com.tencent.mm.plugin.priority.a.a.a.eW(localgi.vIw, 128))
          {
            com.tencent.mm.plugin.report.e.pXa.a(957L, 35L, 1L, false);
            com.tencent.mm.plugin.report.e.pXa.a(957L, 36L, ((com.tencent.mm.at.e)localObject).frO, false);
          }
          AppMethodBeat.o(54875);
        }
        else
        {
          com.tencent.mm.plugin.report.e.pXa.a(957L, 31L, 1L, false);
          AppMethodBeat.o(54875);
        }
      }
    }
    if (bool2)
    {
      ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResLogic", "updateStatus download cancel %d", new Object[] { Long.valueOf(((cy)localObject).field_msgId) });
      ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().z(((cy)localObject).field_msgId, 1);
    }
    while (true)
    {
      com.tencent.mm.plugin.report.e.pXa.a(957L, 32L, 1L, false);
      label800: AppMethodBeat.o(54875);
      break;
      ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResLogic", "updateStatus download fail %d", new Object[] { Long.valueOf(((cy)localObject).field_msgId) });
      ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().z(((cy)localObject).field_msgId, 4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.a.a
 * JD-Core Version:    0.6.2
 */