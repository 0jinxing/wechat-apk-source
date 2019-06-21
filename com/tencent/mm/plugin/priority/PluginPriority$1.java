package com.tencent.mm.plugin.priority;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.comm.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;

final class PluginPriority$1
  implements h.a
{
  PluginPriority$1(PluginPriority paramPluginPriority)
  {
  }

  public final void a(h paramh, h.c paramc)
  {
    AppMethodBeat.i(54866);
    if (paramc.oqJ.equals("insert"))
    {
      int i = 0;
      if (i < paramc.oqK.size())
      {
        paramh = (bi)paramc.oqK.get(i);
        if ((paramh.field_isSend != 1) && (paramh.drE()));
        for (int j = 1; ; j = 0)
        {
          if (j != 0)
            ((b)g.K(b.class)).U(paramh);
          i++;
          break;
        }
      }
    }
    AppMethodBeat.o(54866);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.PluginPriority.1
 * JD-Core Version:    0.6.2
 */