package com.tencent.mm.plugin.profile.ui.newbizinfo.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.d;
import com.tencent.mm.plugin.profile.ui.newbizinfo.d.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.s;

public final class c
{
  public static final void cP(String paramString, int paramInt)
  {
    AppMethodBeat.i(23957);
    Object localObject = com.tencent.mm.plugin.profile.c.cap().Va(paramString);
    if (localObject != null);
    for (localObject = ((d)localObject).field_decryptUserName; ; localObject = "")
    {
      ab.d("MicroMsg.Kv13307", "username:%s scene::%s optype:%d opscene:%d decryptUserName:%s", new Object[] { paramString, Integer.valueOf(3), Integer.valueOf(paramInt), Integer.valueOf(4), localObject });
      h.pYm.e(13307, new Object[] { paramString, Integer.valueOf(3), Integer.valueOf(paramInt), Integer.valueOf(4), localObject, Integer.valueOf(s.getSessionId()) });
      AppMethodBeat.o(23957);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.c.c
 * JD-Core Version:    0.6.2
 */