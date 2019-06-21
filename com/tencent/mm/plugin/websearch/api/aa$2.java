package com.tencent.mm.plugin.websearch.api;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class aa$2
  implements Runnable
{
  aa$2(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124090);
    String str = aa.bx(this.fwD, this.hno);
    if (!TextUtils.isEmpty(str))
      aj.cVp().dy(str, 5);
    AppMethodBeat.o(124090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.aa.2
 * JD-Core Version:    0.6.2
 */