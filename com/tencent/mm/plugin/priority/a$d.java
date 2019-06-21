package com.tencent.mm.plugin.priority;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.priority.b.a.c;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.protocal.protobuf.gi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.lang.ref.WeakReference;

final class a$d extends com.tencent.mm.plugin.priority.b.b.a
{
  private bi cKd;
  private WeakReference<Runnable> pgj;

  a$d(bi parambi, WeakReference<Runnable> paramWeakReference)
  {
    this.cKd = paramWeakReference;
    Object localObject;
    this.pgj = localObject;
  }

  public final String getName()
  {
    return "Priority.onC2CImgScrollTask";
  }

  public final void run()
  {
    AppMethodBeat.i(54878);
    if ((com.tencent.mm.plugin.priority.a.a.a.bhI()) && (this.cKd.field_createTime <= ((PluginPriority)g.M(PluginPriority.class)).getInstallPriorityTime()))
    {
      ab.i("MicroMsg.Priority.PriorityService", "onC2CImgScroll time condition not support %s", new Object[] { h.formatTime("yyyy-MM-dd HH:mm:ss", this.cKd.field_createTime / 1000L) });
      AppMethodBeat.o(54878);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Priority.PriorityService", "C2CImgScrollTask Start To Auto Download %d MsgId %d", new Object[] { Integer.valueOf(32), Long.valueOf(this.cKd.field_msgId) });
      if (this.pgj.get() != null)
        ((Runnable)this.pgj.get()).run();
      ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgAutoDownloadResLogic();
      bi localbi = this.cKd;
      gi localgi = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().jw(localbi.field_msgId);
      if (localgi == null)
      {
        ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResLogic", "This Image Sender is Me");
        AppMethodBeat.o(54878);
      }
      else
      {
        if (localgi.jBT == 1)
          ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgAutoDownloadResStorage().m(localbi.field_msgId, 32, 2);
        AppMethodBeat.o(54878);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.a.d
 * JD-Core Version:    0.6.2
 */