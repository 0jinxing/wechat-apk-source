package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.g;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkCoreWrapper;

public final class i
  implements g
{
  public final void deleteOrigin(String paramString)
  {
    AppMethodBeat.i(85247);
    Log.i("XWStorage", "delete origin ret is ".concat(String.valueOf(XWalkCoreWrapper.invokeRuntimeChannel(80006, new Object[] { paramString }))));
    AppMethodBeat.o(85247);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.i
 * JD-Core Version:    0.6.2
 */