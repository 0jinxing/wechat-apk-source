package com.tencent.mm.plugin.websearch.api;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class aa$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(124089);
    String str = aa.cVf();
    if (!TextUtils.isEmpty(str))
      aj.cVp().dy(str, 4);
    AppMethodBeat.o(124089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.aa.1
 * JD-Core Version:    0.6.2
 */