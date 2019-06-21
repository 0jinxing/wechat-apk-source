package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.messenger.foundation.a.g;
import com.tencent.mm.protocal.protobuf.bbe;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class m
  implements g, com.tencent.mm.plugin.messenger.foundation.a.m
{
  public final String B(bi parambi)
  {
    AppMethodBeat.i(18270);
    if (f.kq(parambi.field_talker))
    {
      parambi = e.aae();
      AppMethodBeat.o(18270);
    }
    while (true)
    {
      return parambi;
      parambi = null;
      AppMethodBeat.o(18270);
    }
  }

  public final void a(bbe parambbe, bi parambi)
  {
    AppMethodBeat.i(18269);
    if (f.kq(parambi.field_talker))
    {
      parambbe.vEG = parambi.dqJ;
      if (!bo.isNullOrNil(parambbe.vEG))
        break label60;
      parambbe.vEG = e.rw(parambi.dqJ);
      AppMethodBeat.o(18269);
    }
    while (true)
    {
      return;
      parambbe.vEG = parambi.dqJ;
      label60: AppMethodBeat.o(18269);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.m
 * JD-Core Version:    0.6.2
 */