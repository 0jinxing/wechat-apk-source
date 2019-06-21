package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.h;

final class u$1
  implements ap.a
{
  u$1(u paramu)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(27722);
    u localu = this.vls;
    Context localContext = this.vls.context;
    this.vls.context.getString(2131297061);
    localu.mzU = h.b(localContext, this.vls.context.getString(2131297086), true, new u.1.1(this));
    AppMethodBeat.o(27722);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.u.1
 * JD-Core Version:    0.6.2
 */