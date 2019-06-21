package com.tencent.xweb.x5;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.CookieSyncManager;
import com.tencent.xweb.c.b.b;

public final class e
  implements b.b
{
  CookieSyncManager AQs;

  public final void init(Context paramContext)
  {
    AppMethodBeat.i(84806);
    this.AQs = CookieSyncManager.createInstance(paramContext);
    AppMethodBeat.o(84806);
  }

  public final void sync()
  {
    AppMethodBeat.i(84807);
    if (this.AQs != null)
      this.AQs.sync();
    AppMethodBeat.o(84807);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.e
 * JD-Core Version:    0.6.2
 */