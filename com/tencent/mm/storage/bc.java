package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.n;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class bc extends j<bb>
  implements n
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(1303);
    fnj = new String[] { j.a(bb.ccO, "GetSysCmdMsgInfo") };
    AppMethodBeat.o(1303);
  }

  public bc(h paramh)
  {
    super(paramh, bb.ccO, "GetSysCmdMsgInfo", null);
    this.bSd = paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bc
 * JD-Core Version:    0.6.2
 */