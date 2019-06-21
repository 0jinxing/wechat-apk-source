package com.tencent.mm.plugin.priority.b;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.e;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.priority.PluginPriority;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class d$a extends ak
{
  d$a(d paramd, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(54898);
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(54898);
      label37: return;
      this.pgs.ju(120000L);
      if (!com.tencent.mm.plugin.priority.a.a.a.bhI())
        continue;
      Object localObject = ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CImgAutoDownloader();
      int i;
      if (((com.tencent.mm.plugin.priority.b.a.a)localObject).pgt != 0L)
      {
        paramMessage = o.ahl().fJ(((com.tencent.mm.plugin.priority.b.a.a)localObject).pgt);
        if (o.ahm().a(paramMessage.fDy, ((com.tencent.mm.plugin.priority.b.a.a)localObject).pgt, paramMessage.fDC))
          i = 1;
      }
      while (i == 0)
      {
        ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CImgAutoDownloader();
        if (!com.tencent.mm.plugin.priority.b.a.a.bZz())
          break;
        ((PluginPriority)com.tencent.mm.kernel.g.M(PluginPriority.class)).getC2CImgAutoDownloader().start();
        AppMethodBeat.o(54898);
        break label37;
        i = 0;
        continue;
        i = 0;
      }
      long l = System.currentTimeMillis();
      localObject = (com.tencent.mm.plugin.priority.b.b.a)paramMessage.obj;
      try
      {
        ((com.tencent.mm.plugin.priority.b.b.a)localObject).run();
        ab.i("MicroMsg.Priority.PriorityTaskRunner", "Once Run Task %s Use Time %d", new Object[] { ((com.tencent.mm.plugin.priority.b.b.a)localObject).getName(), Long.valueOf(System.currentTimeMillis() - l) });
      }
      catch (Exception paramMessage)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Priority.PriorityTaskRunner", paramMessage, "MESSAGE_ONCE_RUN_TASK %s", new Object[] { ((com.tencent.mm.plugin.priority.b.b.a)localObject).getName() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.d.a
 * JD-Core Version:    0.6.2
 */