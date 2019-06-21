package com.tencent.xweb.sys;

import android.content.Context;
import android.webkit.CookieSyncManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.b.b;

public final class b
  implements b.b
{
  CookieSyncManager APF;

  public final void init(Context paramContext)
  {
    AppMethodBeat.i(84647);
    this.APF = CookieSyncManager.createInstance(paramContext);
    AppMethodBeat.o(84647);
  }

  public final void sync()
  {
    AppMethodBeat.i(84648);
    if (this.APF != null)
      this.APF.sync();
    AppMethodBeat.o(84648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.b
 * JD-Core Version:    0.6.2
 */