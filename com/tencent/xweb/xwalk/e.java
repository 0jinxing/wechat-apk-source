package com.tencent.xweb.xwalk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.b.b;
import org.xwalk.core.XWalkCookieManager;

public final class e
  implements b.b
{
  XWalkCookieManager ARR;

  public e()
  {
    AppMethodBeat.i(85214);
    this.ARR = new XWalkCookieManager();
    AppMethodBeat.o(85214);
  }

  public final void init(Context paramContext)
  {
  }

  public final void sync()
  {
    AppMethodBeat.i(85215);
    if (this.ARR != null)
      this.ARR.flushCookieStore();
    AppMethodBeat.o(85215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.e
 * JD-Core Version:    0.6.2
 */