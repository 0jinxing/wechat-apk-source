package com.tencent.mm.plugin.brandservice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.s;
import java.util.ArrayList;

final class PluginBrandService$3
  implements h.a
{
  PluginBrandService$3(PluginBrandService paramPluginBrandService)
  {
  }

  public final void a(h paramh, h.c paramc)
  {
    AppMethodBeat.i(13805);
    if ((paramh == null) || (paramc == null))
      AppMethodBeat.o(13805);
    while (true)
    {
      return;
      int i;
      if ((("insert".equals(paramc.oqJ)) || ("update".equals(paramc.oqJ))) && (paramc.oqK != null))
      {
        for (i = 0; i < paramc.oqK.size(); i++)
        {
          paramh = (bi)paramc.oqK.get(i);
          if (paramh.field_isSend != 1)
            s.an(paramh);
        }
        AppMethodBeat.o(13805);
      }
      else
      {
        if (("delete".equals(paramc.oqJ)) && (paramc.oqK != null))
          for (i = 0; i < paramc.oqK.size(); i++)
            s.ao((bi)paramc.oqK.get(i));
        AppMethodBeat.o(13805);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.PluginBrandService.3
 * JD-Core Version:    0.6.2
 */