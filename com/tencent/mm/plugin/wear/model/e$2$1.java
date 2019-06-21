package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.e.j;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.f.c;
import java.io.UnsupportedEncodingException;

final class e$2$1 extends c
{
  e$2$1(e.2 param2)
  {
  }

  public final String getName()
  {
    return "SendMsgSyncTask";
  }

  public final void send()
  {
    AppMethodBeat.i(26297);
    try
    {
      a.cUn();
      r.b(20007, a.cUn().tXt.tXL.tYA.getBytes("utf8"), false);
      AppMethodBeat.o(26297);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        AppMethodBeat.o(26297);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.2.1
 * JD-Core Version:    0.6.2
 */