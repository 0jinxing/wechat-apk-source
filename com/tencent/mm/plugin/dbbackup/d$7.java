package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

final class d$7
  implements k.a
{
  d$7(d paramd)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(18976);
    if ((paramString != null) && (paramString.length() > 0) && ("event_updated".equals(paramString)))
      d.bhU();
    AppMethodBeat.o(18976);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.7
 * JD-Core Version:    0.6.2
 */