package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.h;

final class r$1
  implements ap.a
{
  r$1(r paramr)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(81363);
    r localr = this.qhg;
    Context localContext = this.qhg.context;
    this.qhg.context.getString(2131297061);
    localr.mzU = h.b(localContext, this.qhg.context.getString(2131297086), true, new r.1.1(this));
    AppMethodBeat.o(81363);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.r.1
 * JD-Core Version:    0.6.2
 */