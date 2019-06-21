package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.f;
import com.tencent.mm.protocal.protobuf.ctp;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.IOException;
import java.util.List;

public final class e extends c
{
  public final String getName()
  {
    return "WearFailMsgCreateTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26443);
    int i = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().bOC().size();
    ctp localctp = new ctp();
    localctp.ndE = a.cUn().tXv.adr(com.tencent.mm.model.r.Yz()).id;
    localctp.Title = ah.getContext().getString(2131296982);
    localctp.ncM = ah.getContext().getString(2131301761, new Object[] { Integer.valueOf(i) });
    try
    {
      a.cUn();
      com.tencent.mm.plugin.wear.model.e.r.b(20005, localctp.toByteArray(), true);
      AppMethodBeat.o(26443);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        AppMethodBeat.o(26443);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.e
 * JD-Core Version:    0.6.2
 */