package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.WebStorage;
import com.tencent.xweb.c.g;

public final class j
  implements g
{
  public final void deleteOrigin(String paramString)
  {
    AppMethodBeat.i(84882);
    WebStorage.getInstance().deleteOrigin(paramString);
    AppMethodBeat.o(84882);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.j
 * JD-Core Version:    0.6.2
 */