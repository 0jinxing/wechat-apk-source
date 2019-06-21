package com.tencent.mm.plugin.priority.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.at.d;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.priority.PluginPriority;
import com.tencent.mm.protocal.protobuf.gi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;

final class a$a extends com.tencent.mm.plugin.priority.b.b.a
{
  private a$a(a parama)
  {
  }

  public final String getName()
  {
    return "Priority.C2CImgAutoDownloaderTask";
  }

  public final void run()
  {
    AppMethodBeat.i(54905);
    if (!com.tencent.mm.plugin.priority.a.a.a.bhI())
      AppMethodBeat.o(54905);
    while (true)
    {
      return;
      if (!com.tencent.mm.plugin.priority.a.a.a.a.bZv())
      {
        ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "not auto download condition");
        AppMethodBeat.o(54905);
      }
      else
      {
        if ((this.pgz.pgt == 0L) && (!this.pgz.pgw))
          break;
        ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "Downloading %d pauseOnMonitor %b", new Object[] { Long.valueOf(this.pgz.pgt), Boolean.valueOf(this.pgz.pgw) });
        AppMethodBeat.o(54905);
      }
    }
    float f1 = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getBorderPriority();
    float f2 = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getBgBorderPriority();
    int i = 0;
    Object localObject1 = null;
    if (!bo.isNullOrNil(this.pgz.talker))
    {
      localObject1 = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().h(this.pgz.talker, f1);
      i = 1;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().aR(f1);
      i = 2;
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().bZA();
      i = 4;
    }
    if ((localObject1 == null) && (a.bZz()))
    {
      localObject1 = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().aQ(f2);
      ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "bg normal download");
      i = 3;
    }
    while (true)
    {
      if (localObject1 == null)
      {
        this.pgz.pgt = 0L;
        ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "autoDownloadRes is null");
        AppMethodBeat.o(54905);
        break;
      }
      this.pgz.pgt = ((gi)localObject1).vIs;
      ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "curMsgId %d priority %.2f prioritytype %d way %d borderPriority %.2f bgBorderPriority %.2f", new Object[] { Long.valueOf(this.pgz.pgt), Double.valueOf(((gi)localObject1).vIB), Integer.valueOf(((gi)localObject1).vIC), Integer.valueOf(i), Float.valueOf(f1), Float.valueOf(f2) });
      localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.pgz.pgt);
      localObject1 = o.ahl().fI(((cy)localObject2).field_msgSvrId);
      if (((com.tencent.mm.at.e)localObject1).dJA == 1)
      {
        ab.i("MicroMsg.Priority.C2CImgAutoDownloader", this.pgz.pgt + " already has hd thumb");
        ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().z(this.pgz.pgt, 5);
        this.pgz.pgt = 0L;
        this.pgz.start();
        AppMethodBeat.o(54905);
        break;
      }
      f.afx().fyQ.add("image_" + ((cy)localObject2).field_msgId);
      int j;
      if ((!bo.isNullOrNil(this.pgz.talker)) && (this.pgz.talker.equals(((cy)localObject2).field_talker)))
      {
        j = o.ahm().a(((com.tencent.mm.at.e)localObject1).fDy, ((cy)localObject2).field_msgId, 0, Long.valueOf(this.pgz.pgt), this.pgz.pgu, this.pgz, 60000, true);
        ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "start download cdnautostart %d %s %s result=%d", new Object[] { Long.valueOf(this.pgz.pgt), "image_" + ((cy)localObject2).field_msgId, this.pgz.talker, Integer.valueOf(j) });
        label668: switch (j)
        {
        default:
        case -4:
        case -3:
        case 0:
        case -2:
        case -1:
        }
      }
      while (true)
      {
        AppMethodBeat.o(54905);
        break;
        j = o.ahm().a(((com.tencent.mm.at.e)localObject1).fDy, ((cy)localObject2).field_msgId, 0, Long.valueOf(this.pgz.pgt), this.pgz.pgu, this.pgz, 60000, false);
        ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "start download cdnautostart %d %s result=%d", new Object[] { Long.valueOf(this.pgz.pgt), "image_" + ((cy)localObject2).field_msgId, Integer.valueOf(j) });
        break label668;
        ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().z(this.pgz.pgt, 2);
        if (i == 3)
        {
          com.tencent.mm.plugin.report.e.pXa.a(957L, 52L, 1L, false);
          AppMethodBeat.o(54905);
          break;
        }
        if (i == 1)
        {
          com.tencent.mm.plugin.report.e.pXa.a(957L, 50L, 1L, false);
          AppMethodBeat.o(54905);
          break;
        }
        if (i == 4)
        {
          com.tencent.mm.plugin.report.e.pXa.a(957L, 57L, 1L, false);
          AppMethodBeat.o(54905);
          break;
        }
        com.tencent.mm.plugin.report.e.pXa.a(957L, 51L, 1L, false);
        AppMethodBeat.o(54905);
        break;
        ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().z(this.pgz.pgt, 3);
        if (i == 3)
          com.tencent.mm.plugin.report.e.pXa.a(957L, 55L, 1L, false);
        this.pgz.pgt = 0L;
        this.pgz.start();
        AppMethodBeat.o(54905);
        break;
        ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().z(this.pgz.pgt, 4);
        if (i == 3)
          com.tencent.mm.plugin.report.e.pXa.a(957L, 56L, 1L, false);
        this.pgz.pgt = 0L;
        this.pgz.start();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.a.a.a
 * JD-Core Version:    0.6.2
 */